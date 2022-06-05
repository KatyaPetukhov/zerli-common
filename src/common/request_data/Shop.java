package common.request_data;

/**
   *Shop  enum class savingInformation about the stores 
   *there is 2 stores in our system-Nahariya,Haifa
   *this class also saves  the permissions that can be made to the store
   * amanger- have premission to his store and a owner to all shops
   *long method descripton
  *@author Jessica and Yarden
   */

public enum Shop {
	/* User role Manager gets a shop, Owner gets all shops */
	ALL("All"),
//	NONE("None"),
	HAIFA("Haifa"), NAHARIYA("Nahariya");

	private String s;

	private Shop(final String s) {
		this.s = s;
	}

	public String getValue() {
		return s;
	}

	public String toString() {
		return this.getValue();
	}

	public static Shop fromString(String text) {
		for (Shop b : Shop.values()) {
			if (b.s.equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
	}

}
