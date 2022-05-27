package common.request_data;

import java.util.ArrayList;

import common.JSONObject;

public class ProductList extends JSONObject {
	public String category;
	public ArrayList<Product> items; // Not List because it should be initialized by default during JSON creation.

	public static ProductList fromJson(String s) {
		/* Add such function to each subclass! */
		return (ProductList) fromJson(s, ProductList.class);
	}
	
	@Override
	public String toString() {
		
		return items.toString();
		
	}
}
