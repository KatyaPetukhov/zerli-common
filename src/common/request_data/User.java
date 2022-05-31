package common.request_data;

import common.JSONObject;

import common.Role;


public class User extends JSONObject {
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	

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
	public String accountStatus; //Approved/Blocked/frozen

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
		this.shopname = Shop.NONE;
		this.approved = false;
		this.cardNumber = null;
		this.exDate = null;
		this.cvv = null;
		this.logInfo = false;
		
	}
	
	public void setAccountStatus() {
		if(!approved)
			accountStatus = "Blocked";
		else if(userrole.equals(Role.CUSTOMER))
				accountStatus="Approved";
		else accountStatus ="Frozen";
	}

	public static User fromJson(String s) {
		/* Add such function to each subclass! */
		return (User) fromJson(s, User.class);
	}
}
