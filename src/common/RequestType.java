package common;

public enum RequestType {
	// List of requests supported by server
	/* Errors: */
	REQUEST_FAILED, // data is null - Something went wrong on server side
	FORBIDDEN, // data is null - User is not authorized

	/* General: */
	PING, // Checks is server is alive. Should return unmodified request.

	/* UserManager: */
	GET_USER, ADD_USER, APPROVE_USER, REMOVE_USER, GET_USERS,GET_INCOME_REPORT,GET_INCOME_REPORT_BC,CHANGE_STATUS,

	/* ProductManager */
	GET_CATEGORIES, GET_PRODUCTS, ADD_PRODUCT, REMOVE_PRODUCT, GET_PRODUCT, GET_ORDERS, GET_ORDER, ADD_ORDER,

	/* OrderManager */
	/* AccountManager */
	/* etc. */
}
