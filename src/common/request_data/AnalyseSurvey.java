package common.request_data;

import common.JSONObject;

public class AnalyseSurvey extends JSONObject {

	public String syrveyType;
	public String shopName;
	public String date;
	
	
	public static AnalyseSurvey fromJson(String s) {
		/* Add such function to each subclass! */
		return (AnalyseSurvey) fromJson(s, AnalyseSurvey.class);
	}
}
