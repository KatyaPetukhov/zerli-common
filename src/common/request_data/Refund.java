package common.request_data;

import common.JSONObject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;

/**
   *JSON class that saves the sutable refund due to the complaint handaling  and can  be transferred between the client and the server
  *@Jessican and Yarden
   */
public class Refund extends JSONObject {

	public String orderId;
	public String refund;

	public Refund() {
		this.orderId = null;
		this.refund = null;
	}

	public Refund(String orderId, String refund) {
		this.refund = refund;
		this.orderId = orderId;
	}

	public static Refund fromJson(String s) {
		/* Add such function to each subclass! */
		return (Refund) fromJson(s, Refund.class);
	}
}
