package common.request_data;

public enum OrderType {

	// NONE("None"),
	DELIVERY("Delivery"), TAKE_AWAY("Take away");

	private String s;

	OrderType(final String s) {
		this.s = s;
	}

	public String getValue() {
		return s;
	}

	public String toString() {
		return this.getValue();
	}

	public static OrderType fromString(String text) {
		for (OrderType b : OrderType.values()) {
			if (b.s.equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
	}

}