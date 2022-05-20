package common.request_data;

import java.util.ArrayList;

import common.JSONObject;


public class Order extends JSONObject{
	public String orderNumber;
	public String username;
	public String date; 
	public String hour; 
	public ArrayList<Product> products;
	public String status;
	public double totalPrice;
	public String complaint;
	
	public Order() {
		this.orderNumber = null;
		this.username = null;
		this.date = null;
		this.hour = null;
		this.products = null;
		this.status = null;
		this.totalPrice=0.0;
		this.complaint=null;
	}

	public Order(String orderNumber, String username, String date, String hour, ArrayList<Product> products,
			String status,double totalPrice) {
		super();
		this.orderNumber = orderNumber;
		this.username = username;
		this.date = date;
		this.hour = hour;
		this.products = products;
		this.status = status;
		this.totalPrice=totalPrice;
	}
	public static Order fromJson(String s) {
		/* Add such function to each subclass! */
		return (Order) fromJson(s, Order.class);
	}
	 


}
