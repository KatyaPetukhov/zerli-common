package common.request_data;

/**
   *a common class between the client and the server  
   *this class can save and transfer the information about canceling order status
   *we save in enum 3 params- Canceled,Not Canceled,Waiting for Cancel
   *we use this class to follow the state of a cancel request
  *@author Jessica and Yarden
   */

public enum CancelStatus {
	/* User role Manager gets a shop, Owner gets all shops */
	CANCELED("Canceled"), NOT_CANCELED("Not Canceled"), WAITING_FOR_CANCEL("Waiting for Cancel");

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
