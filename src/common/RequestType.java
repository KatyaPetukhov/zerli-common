package common;

public enum RequestType {
	// List of requests supported by server
	/* Errors: */
	REQUEST_FAILED, // data is null - Something went wrong on server side
	FORBIDDEN, // data is null - User is not authorized

	/* General: */
	PING, // Checks is server is alive. Should return unmodified request.

	/* UserManager: */
	GET_USER, ADD_USER, APPROVE_USER, REMOVE_USER, GET_USERS,UPDATE_WALLET,

	/* ProductManager */
	GET_CATEGORIES, GET_PRODUCTS, ADD_PRODUCT,GET_PRODUCT, REMOVE_PRODUCT,TOFROM_CATALOGUE, SET_DISCOUNT,

	/* OrderManager */
	GET_ORDER, GET_ORDERS, ADD_ORDER, APPROVE_ORDER,
	/* AccountManager */
	/* etc. */
}
