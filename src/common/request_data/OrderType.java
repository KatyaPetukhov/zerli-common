package common.request_data;

public enum OrderType {
	
	NONE("None"),
	DELIVERY("Delivery"),
	TAKE_AWAY("Take away");

	
	private String s;

	OrderType(String s) {
		this.s = s;
	}

	public String toString() {
		return s;
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