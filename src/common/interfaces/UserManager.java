package common.interfaces;

import java.util.List;

import common.Role;
import common.request_data.User;

public interface UserManager {
	/*
	 * This interface should be implemented in both Client and Server sides:
	 * 
	 * 1. ClientUserManager implement UserManager
	 * 
	 * 2. ServerUserManager implements UserManager
	 * 
	 * This function will allow direct access from client to server data without
	 * taking into account the real process.
	 * 
	 * Client will call functions from ClientUserManager. ClientUserManager will
	 * create a Request with required data inside and send it via EchoClient to
	 * EchoServer. EchoServer will unpack the data from Request and call exactly
	 * same function from ServerUserManager. ServerUserManager will get the data
	 * from SQL and return it in correct data format. EchoServer will pack the data
	 * to same Request it came with. EchoServer will return same Request back to
	 * EchoClient. EchoClient will return data to UserClientManager.
	 * UserClientManager will return data to Client.
	 * 
	 * For each function below there is a RequestType that will tell EchoServer
	 * which function to call.
	 */

	/* Possible error are send via ServerError data class: */
	public class TooManyAttempts extends Exception {
	}

	public class WeakPassword extends Exception {
		/*
		 * Password requirements can be set by server. So password strength should be
		 * checked twice. Client will check once to make it faster. But if client have
		 * not checked for some reason - server can also decline weak or empty
		 * passwords.
		 */
		private static final long serialVersionUID = -4115270837154574029L;

		public WeakPassword(String message) {
			/* Explanation on what is wrong with the password. */
			super(message);
		}
	}

	public class PermissionDenied extends Exception {
		private static final long serialVersionUID = -2211480302172449980L;
	}

	/* Required functions for RequestType: */
	/*
	 * GET_USER
	 * 
	 * Returns an object User which corresponds to provided username and password.
	 * If password does not match or user does not exist return null.
	 */
	public User getUser(String username, String password);

	/*
	 * ADD_USER
	 * 
	 * Adds a new user. Not approved user can be added by anyone. Approved user can
	 * be added only by Manager, otherwise PermissionDenied will be thrown. Returns
	 * true if user was added.
	 */
	public boolean addNewUser(String username, String password, String nickname, Role role, boolean approved)
			throws WeakPassword, PermissionDenied;

	/*
	 * APPROVE_USER
	 * 
	 * Approves already existing user. Can be done only by Manager, otherwise
	 * PermissionDenied thrown. If user does not exist or already approved - returns
	 * false.
	 */
	public boolean approveUser(String user) throws PermissionDenied;

	/*
	 * REMOVE_USER
	 * 
	 * Removes existing user. Can be done only by Manager, otherwise
	 * PermissionDenied is thrown. Returns false if no user was removed.
	 */
	public boolean removeUser(String user) throws PermissionDenied;

	/*
	 * GET_USERS
	 * 
	 * Returns a list of "amount" existing users starting from user "start" by type
	 * approved/not approved. Can be done only by Manager.
	 */
	public List<User> getUsers(boolean approved, int start, int amount) throws PermissionDenied;
}
