package common.request_data;

import common.JSONObject;

public class Order extends JSONObject {
	public String orderNumber;
	public String username;
	public String date;
	public String hour;
	public ProductList products;
	public OrderStatus status;
	public double totalPrice = 0.0;
	public String recipient;
	public String greetingMessage;
	public String signature;
	public Shop shop = Shop.NONE;
	public String address;
	public String city;
	public String phone; // Recipient of order
	public String paymentPhone; // Payment phone
	public OrderType orderType;

	public Order() {
		this.orderNumber = null;
		this.username = null;
		this.date = null;
		this.hour = null;
		this.products = null;
		this.status = null;
		this.totalPrice = 0.0;
		this.recipient = null;
		this.greetingMessage = null;
		this.signature = null;
		this.shop = null;
		this.address = null;
		this.city = null;
		this.phone = null;
		this.paymentPhone = null;
		this.orderType = null;
	}

	public Order(String orderNumber, String username, String date, String hour, ProductList products,
			OrderStatus status, double totalPrice, String recipient, String greetingMessage, String signature,
			Shop shop, String address, String city, String phone, String paymentName, String paymentPhone,
			OrderType orderType) {
		super();
		this.orderNumber = orderNumber;
		this.username = username;
		this.date = date;
		this.hour = hour;
		this.products = products;
		this.status = status;
		this.totalPrice = totalPrice;
		this.recipient = recipient;
		this.greetingMessage = greetingMessage;
		this.signature = signature;
		this.shop = shop;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.paymentPhone = paymentPhone;
		this.orderType = orderType;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public static Order fromJson(String s) {
		/* Add such function to each subclass! */
		return (Order) fromJson(s, Order.class);
	}

}