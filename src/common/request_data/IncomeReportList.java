package common.request_data;

import java.util.ArrayList;

import common.JSONObject;

public class IncomeReportList extends JSONObject {
	
	public ArrayList<IncomeReport> Reports;
	
	public static IncomeReportList fromJson(String s) {
		/* Add such function to each subclass! */
		return (IncomeReportList) fromJson(s, IncomeReportList.class);
	}

}
