package common.request_data;

import common.JSONObject;
import common.Role;


/**
   *User-a jason class that 
   *this class help us to transform the user details between client and server
   *
  *@Katya and Ahron
   */

public class User extends JSONObject {
	public String username;
	public String password;
	public String nickname; // Display name for a greeting
	public Shop shopname;
	public Role userrole;
	public boolean approved;
	public String cardNumber;
	public String exDate;
	public String cvv;
	public boolean logInfo;

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
		this.cardNumber = null;
		this.exDate = null;
		this.cvv = null;
		this.logInfo = false;
	}

	public static User fromJson(String s) {
		/* Add such function to each subclass! */
		return (User) fromJson(s, User.class);
	}
}
