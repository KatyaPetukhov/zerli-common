package common.request_data;

import common.JSONObject;

public class AnalyseSurvey extends JSONObject {

	public String syrveyType;
	public String shopName;
	public String date;
	
	public AnalyseSurvey() {
		this.syrveyType = null;
		this.shopName = null;
		this.date = null;
		
	}	
	
	public AnalyseSurvey(String syrveyType, String shopName, String date) {
		this.syrveyType = syrveyType;
		this.shopName = shopName;
		this.date = date;
	}

	public static AnalyseSurvey fromJson(String s) {
		/* Add such function to each subclass! */
		return (AnalyseSurvey) fromJson(s, AnalyseSurvey.class);
	}
}
