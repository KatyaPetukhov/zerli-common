package common.request_data;

public class AnalyseFileContainer {
	public AnalyseFile analyseFile;

	public AnalyseFileContainer() {
		analyseFile = new AnalyseFile();
	}

	public void initArray(int size) {
		analyseFile.byteArray = new byte[size];
	}

}