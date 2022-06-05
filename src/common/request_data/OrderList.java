package common.request_data;

import java.util.ArrayList;

import common.JSONObject;

/**
   *JSON object that represnt a order List and  saves information about order List, and can  be transferred between the client and the server
   *for each OrderList saves - ther user order list,the amount of products and a start counter
  *@Jessican and Yarden
   */

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
