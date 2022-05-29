package common.request_data;

public enum OrderType {

	NONE("None"), DELIVERY("Delivery"), TAKE_AWAY("Take away");

	private String s;

	OrderType(String s) {
		this.s = s;
	}

	public String toString() {
		return s;
	}

}
