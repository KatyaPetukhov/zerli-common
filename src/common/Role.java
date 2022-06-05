package common;


/**
   *User role identified by server with string representation for printing.
   *saves in emun all the role options in zerli system- Customer,Owner,Worker,Support,Guest
  *@Katya
   */

public enum Role {
	/* User role identified by server with string representation for printing. */
	CUSTOMER("Customer"),
	MANAGER("Manager"),
	OWNER("Owner"),
	WORKER("Worker"),
	SUPPORT("Support"),
	GUEST("Guest");

	private String s;

	Role(String s) {
		this.s = s;
	}

	public String toString() {
		return s;
	}
}
