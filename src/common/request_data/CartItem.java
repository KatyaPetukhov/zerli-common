package common.request_data;

import java.util.HashMap;
import java.util.Map;

import common.JSONObject;

//KATYA
public class CartItem extends JSONObject {
	public HashMap<String, Integer> items;
	public Double price = 0.0;
	public String recipient;
	public String greetingMessage;
	public String signature;
	public Shop shop = null;
	public String date;
	public String time;
	public String address;
	public String city;
	public String phone;
	public String paymentID;
	public String paymentPhone;
	public OrderType orderType = null;
	public boolean submit = false;

	public static CartItem fromJson(String s) {
		/* Add such function to each subclass! */
		return (CartItem) fromJson(s, CartItem.class);
	}

}