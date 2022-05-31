package common.request_data;

import common.JSONObject;

public class Survey extends JSONObject {

	public int surveyId;
	public int q1;
	public int q2;
	public int q3;
	public int q4;
	public int q5;
	public int q6;
	public String type;
	public String shopName;
	public String date;

	public Survey() {
		this.type = null;
		this.date = null;
		this.shopName = null;
		this.surveyId = 0;
		this.q1 = 0;
		this.q2 = 0;
		this.q3 = 0;
		this.q4 = 0;
		this.q5 = 0;
		this.q6 = 0;
	}

	public Survey(int question1, int question2, int question3, int question4, int question5, int question6, String type,
			String shopName, String date) {
		this.type = type;
		this.date = date;
		this.shopName = shopName;
		this.q1 = question1;
		this.q2 = question2;
		this.q3 = question3;
		this.q4 = question4;
		this.q5 = question5;
		this.q6 = question6;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public int getQuestion1() {
		return q1;
	}

	public void setQuestion1(int question1) {
		this.q1 = question1;
	}

	public int getQuestion2() {
		return q2;
	}

	public void setQuestion2(int question2) {
		this.q2 = question2;
	}

	public int getQuestion3() {
		return q3;
	}

	public void setQuestion3(int question3) {
		this.q3 = question3;
	}

	public int getQuestion4() {
		return q4;
	}

	public void setQuestion4(int question4) {
		this.q4 = question4;
	}

	public int getQuestion5() {
		return q5;
	}

	public void setQuestion5(int question5) {
		this.q5 = question5;
	}

	public int getQuestion6() {
		return q6;
	}

	public void setQuestion6(int question6) {
		this.q6 = question6;
	}

	public static Survey fromJson(String s) {
		/* Add such function to each subclass! */
		return (Survey) fromJson(s, Survey.class);
	}
}