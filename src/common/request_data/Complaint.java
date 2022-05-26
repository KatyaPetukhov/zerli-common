package common.request_data;

import common.JSONObject;

public class Complaint extends JSONObject {
	public String userName;
	public String orderId;
	public String complaint;
	public String date;
	public String price;
	public String complaintStatus;

	// public String supportName;
	public Complaint() {// String supportName) {
		this.userName = null;
		this.orderId = null;
		this.complaint = null;
		this.date = null;
		this.price = null;
		this.complaintStatus = null;
	}

	public Complaint(String userName, String orderId, String complaint, String date, String price,
			String complaintStatus) {// String supportName) {
		this.userName = userName;
		this.orderId = orderId;
		this.complaint = complaint;
		this.date = date;
		this.price = price;
		this.complaintStatus = complaintStatus;
		// this.supportName = supportName;
	}

	public static Complaint fromJson(String s) {
		/* Add such function to each subclass! */
		return (Complaint) fromJson(s, Complaint.class);
	}

}
