package common.request_data;

import java.util.ArrayList;

import common.JSONObject;

public class UsersList extends JSONObject {
	
	public ArrayList<User> Users;
	
	public static UsersList fromJson(String s) {
		/* Add such function to each subclass! */
		return (UsersList) fromJson(s, UsersList.class);
	}

}
