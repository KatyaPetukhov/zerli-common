package common.interfaces;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import common.Role;
import common.request_data.Shop;
import common.request_data.Survey;
import common.request_data.ComplaintList;
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
		private static final long serialVersionUID = 4180122998486458438L;
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
	public boolean addNewUser(String username, String password, String nickname, Shop shopname, Role role,
			boolean approved, String cardNumber, String expirationDate, String cvv, boolean logInfo)

			throws WeakPassword, PermissionDenied, SQLIntegrityConstraintViolationException;

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

	/*
	 * ADD_NEW_COMPLIANT
	 * 
	 * Return boolean if the new complaint were added to sql
	 */
	public boolean addNewCompliant(String userName, String orderId, String complaint, String date, String price,
			String complaintStatus, String supportName, String refund);

	/*
	 * GET_ALL_COMPLAINTS
	 * 
	 * Return list of all complaints that specific support user has asked for.
	 */
	public ComplaintList getAllComplaints(String supportName);

	/*
	 * SET_REFUND_AMOUNT
	 * 
	 * set refund to this user according his orderId.
	 */
	public boolean setRefundAmount(String orderId, String refund);

	/*
	 * SET_SURVEY_ANSWERS
	 * 
	 * fill answers to DB.
	 */
	public boolean setSurveyAnswers(double q1, double q2, double q3, double q4, double q5, double q6, String type, String shopName,
			String Date);

	/*
	 * LOG_OFF_USER
	 * 
	 * Changes the logInfo to LOGED_OFF
	 */
	public boolean logOffUser(User user);

	/*
	 * LOG_IN
	 * 
	 * Changes the logInfo to LOGED_In
	 */
	public boolean logInUser(User user);

	/*
	 * ANALYSE_TYPE_SURVEY
	 * 
	 * Display survey analysis.
	 */
	public Survey analyseTypeSurvey(String surveyType, String shopName, String date);
}
