package com.bridgeLabz.JunitDemo2;

public class MoodAnalyser {

	public String Mood(String string) throws MoodAnalysisException {
		try {
			if(string.length()==0) {
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Please Enter Valid String");
			}
			if(string.contains("sad")) {
				return "SAD";
			}
			return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Please Enter Valid String");
		}
		
	}

}
