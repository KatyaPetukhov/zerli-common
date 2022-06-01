package common.request_data;

public enum CancelStatus {
	/* User role Manager gets a shop, Owner gets all shops*/
	CANCELED("Canceled"),
	NOT_CANCELED("Not Canceled"),
	WAITING_FOR_CANCEL("Waiting for Cancel");
	
	private String s;
 
	CancelStatus(final String s) {
		this.s = s;
	}

	
	 public String getValue() {
	        return s;
	    }
	
	public String toString() {
		return this.getValue();
	}
	
    public static CancelStatus fromString(String text) {
        for (CancelStatus b : CancelStatus.values()) {
            if (b.s.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
