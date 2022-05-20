package common.request_data;

import java.util.HashMap;

import common.JSONObject;

public class CartItem extends JSONObject{
	public HashMap<String, Integer> items;
	public String greeting;

	
	
	
	public static CartItem fromJson(String s) {
		/* Add such function to each subclass! */
		return (CartItem) fromJson(s, CartItem.class);
	}
	

}
