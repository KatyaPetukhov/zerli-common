package common;

public enum RequestType {
	// List of requests supported by server
	REQUEST_FAILED,  // data is null - Something went wrong on server side
	FORBIDDEN,  // data is null - User is not authorized
	PING,  // Checks is server is alive. Should return unmodified request.
	GET_USER,  // data of class User
	GET_ITEMS,
	SUBMIT_ORDER,
	GET_ORDERS,
	// TODO: Add others
	;
}
