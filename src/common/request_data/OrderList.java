package common.request_data;

import java.util.ArrayList;

import common.JSONObject;

public class OrderList extends JSONObject  {
	public int start;
	public int amount;
	public String username;
	public ArrayList<Order> orders; // Not List because it should be initialized by default during JSON creation.

	public static OrderList fromJson(String s) {
		/* Add such function to each subclass! */
		return (OrderList) fromJson(s, OrderList.class);
	}

}
