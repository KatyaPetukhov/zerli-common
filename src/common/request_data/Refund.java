package common.request_data;

import common.JSONObject;

public class Refund extends JSONObject {

	public String orderId;
	public String refund;

	public Refund() {
		this.orderId = null;
		this.refund = null;
	}

	public Refund(String orderId, String refund) {
		this.orderId = orderId;
		this.refund = refund;
	}

	public static Refund fromJson(String s) {
		/* Add such function to each subclass! */
		return (Refund) fromJson(s, Refund.class);
	}
}
