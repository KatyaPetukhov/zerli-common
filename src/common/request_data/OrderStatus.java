package common.request_data;

public enum OrderStatus {
	/* User role Manager gets a shop, Owner gets all shops*/
	APPROVED("Approved"),
	NOT_APPROVED("Not Approved"),
	WAITING_FOR_APPROVE("Waiting for approve");
	
	private String s;
 
	OrderStatus(final String s) {
		this.s = s;
	}

	
	 public String getValue() {
	        return s;
	    }
	
	public String toString() {
		return this.getValue();
	}
	
    public static OrderStatus fromString(String text) {
        for (OrderStatus b : OrderStatus.values()) {
            if (b.s.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }

}



