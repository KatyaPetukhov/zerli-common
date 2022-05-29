package common.request_data;

import common.JSONObject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;

public class Complaint extends JSONObject {
	public String userName;
	public String orderId;
	public String complaint;
	public String date;
	public String price;
	public String complaintStatus;
	public String refund;

	public Complaint() {
		this.userName = null;
		this.orderId = null;
		this.complaint = null;
		this.date = null;
		this.price = null;
		this.complaintStatus = null;
		this.refund = null;
	}

	public Complaint(String userName, String orderId, String complaint, String date, String price,
			String complaintStatus, String refund) {
		this.userName = userName;
		this.orderId = orderId;
		this.complaint = complaint;
		this.date = date;
		this.price = price;
		this.complaintStatus = complaintStatus;
		this.refund = refund;
	}

	public String getRefund() {
		return refund;
	}

	public void setRefund(String refund) {
		this.refund = refund;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getComplaintStatus() {
		return complaintStatus;
	}

	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}

	public static Complaint fromJson(String s) {
		/* Add such function to each subclass! */
		return (Complaint) fromJson(s, Complaint.class);
	}
}
