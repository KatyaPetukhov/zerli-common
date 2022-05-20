package common.request_data;

import common.JSONObject;
import common.Role;
import common.Shop;

public class User extends JSONObject {
	public String username;
	public String password;
	public String nickname; // Display name for a greeting
	public Shop shopname;
	public Role userrole;
	public boolean approved;

	public User() {
		/*
		 * Default constructor is required for JSONObject if any other constructor
		 * defined.
		 */
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.nickname = null;
		this.userrole = null;
		this.approved = false;
	}

	public static User fromJson(String s) {
		/* Add such function to each subclass! */
		return (User) fromJson(s, User.class);
	}
}
