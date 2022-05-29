package common.request_data;

public enum Shop {
	/* User role Manager gets a shop, Owner gets all shops*/
	ALL("All"),
	NONE("None"),
	HAIFA("Haifa"),
	NAHARIYA("Nahariya");
	
	
	private String s;

	Shop(String s) {
		this.s = s;
	}

	public String toString() {
		return s;
	}

}