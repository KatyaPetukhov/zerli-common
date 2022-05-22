package common.request_data;

import java.util.HashMap;

import common.JSONObject;

public class CartItem extends JSONObject{
	public HashMap<String, Integer> items;
	public String amount;
	public String recipient;
	public String greetingMessage;
	public String signature;
	public String shop;
	public String date;
	public String time;
	public String address;
	public String phone;
	public String paymentName;
	public String paymentID;
	public String paymentPhone;
	public String cardNumber;
	public String expirationDate;
	public String CVV;

	
	

	
	
	
	public static CartItem fromJson(String s) {
		/* Add such function to each subclass! */
		return (CartItem) fromJson(s, CartItem.class);
	}
	

}
