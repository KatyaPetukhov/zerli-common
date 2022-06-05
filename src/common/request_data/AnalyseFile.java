package common.request_data;

import java.io.Serializable;

import common.JSONObject;

public class AnalyseFile extends JSONObject implements Serializable {
	public String description;
	public String fileName = null;
	public int size;
	public byte[] byteArray;
	public String surveyAnalyseId;

	public AnalyseFile() {
		description = null;
		fileName = null;
		size = 0;
		byteArray = null;
		surveyAnalyseId = null;
	}

	public AnalyseFile(String fileName) {
		this.fileName = fileName;
		description = null;
		size = 0;
	}

	public static AnalyseFile fromJson(String s) {
		/* Add such function to each subclass! */
		return (AnalyseFile) fromJson(s, AnalyseFile.class);
	}


}