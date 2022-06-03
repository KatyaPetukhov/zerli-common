package common.request_data;

import common.JSONObject;

/**
   *this is an json class that represents the survey analayze 
   *by this class we can transfer the survey analyze data between user->client->sql
  *@author Jessica and Yarden
   */
public class AnalyseSurvey extends JSONObject {

	public String syrveyType;
	public String shopName;
	public String date;
	
	public AnalyseSurvey() {
		this.syrveyType = null;
		this.shopName = null;
		this.date = null;
		
	}	
	
/**
   *A constructor who maintains the survey values to be analyzed
  *@author Jessica and Yarden
   */
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
