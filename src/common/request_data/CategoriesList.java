package common.request_data;

import java.util.ArrayList;

import common.JSONObject;

public class CategoriesList extends JSONObject {
	public ArrayList<String> items; // Not List because it should be initialized by default during JSON creation.

	public static CategoriesList fromJson(String s) {
		/* Add such function to each subclass! */
		return (CategoriesList) fromJson(s, CategoriesList.class);
	}
}
