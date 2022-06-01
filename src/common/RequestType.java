package common;

public enum RequestType {
	// List of requests supported by server
	/* Errors: */
	REQUEST_FAILED, // data is null - Something went wrong on server side
	FORBIDDEN, // data is null - User is not authorized

	/* General: */
	PING, // Checks is server is alive. Should return unmodified request.

	/* UserManager: */
	GET_USER, ADD_USER, APPROVE_USER, REMOVE_USER, GET_USERS, GET_USER_OREDERS, GET_INCOME_REPORT, GET_INCOME_REPORT_BC,
	CHANGE_STATUS, LOG_OFF_USER, LOGIN,

	/* ProductManager */
	GET_CATEGORIES, GET_PRODUCTS, ADD_PRODUCT, REMOVE_PRODUCT, GET_COMPLAINT, GET_ALL_COMPLAINTS, GET_REFUND_AMOUNT,
	GET_PRODUCT, GET_ANSWERS_SURVEY, GET_ANALYSE_SURVEY,

	/* OrderManager */
	GET_ORDER, GET_ORDERS, ADD_ORDER, APPROVE_ORDER,
	/* AccountManager */
	/* etc. */

}
