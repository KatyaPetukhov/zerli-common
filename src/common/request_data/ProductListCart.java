package common.request_data;

import java.util.HashMap;

import common.JSONObject;

public class ProductListCart extends JSONObject{
	public HashMap<String, Integer> items; // Not List because it should be initialized by default during JSON creation.

	public static ProductListCart fromJson(String s) {
		/* Add such function to each subclass! */
		return (ProductListCart) fromJson(s, ProductListCart.class);
	}
	
	@Override
	public String toString() {
		
		return items.toString();
		
	}
}
