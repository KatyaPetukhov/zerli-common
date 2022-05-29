package common.request_data;

import java.util.HashMap;
import java.util.Map;

import common.JSONObject;

public class CartItem extends JSONObject {
	public HashMap<String, Integer> items;
	public Double price = 0.0;
	public String recipient;
	public String greetingMessage;
	public String signature;
	public Shop shop = Shop.NONE;
	public String date;
	public String time;
	public String address;
	public String city;
	public String phone;
	public String paymentName;
	public String paymentID;
	public String paymentPhone;
	public boolean submit = false;

	public static CartItem fromJson(String s) {
		/* Add such function to each subclass! */
		return (CartItem) fromJson(s, CartItem.class);
	}

}
