package common;

public enum RequestType {
	// List of requests supported by server
	UNKNOWN_REQUEST,  // data is null - Something went wrong on server side
	FORBIDDEN,  // data is null - User is not authorized
	GET_USER,  // data of class User
	GET_ITEMS,
	SUBMIT_ORDER,
	GET_ORDERS,
	// TODO: Add others
	;
}
