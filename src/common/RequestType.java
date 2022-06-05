package common;


/**
   *enum that saves all the types of request that a client ask for server due to his role
   *for each product saves - nams,price,discount,category,image name
  *@Jessican and Yarden
   */

public enum RequestType {
	// List of requests supported by server
	/* Errors: */
	REQUEST_FAILED, // data is null - Something went wrong on server side
	FORBIDDEN, // data is null - User is not authorized

	/* General: */
	PING, // Checks is server is alive. Should return unmodified request.

	/* UserManager: */
	GET_USER, ADD_USER, APPROVE_USER, REMOVE_USER, GET_USERS,

	/* ProductManager */
	GET_CATEGORIES, GET_PRODUCTS, ADD_PRODUCT, REMOVE_PRODUCT,

	/* OrderManager */
	/* AccountManager */
	/* etc. */
}
