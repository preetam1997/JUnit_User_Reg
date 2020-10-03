package com.bridgeLabz.JunitDemo2;




@FunctionalInterface
interface MoodA {
	String Mood(String t) throws MoodAnalysisException ;
}
public class MoodAnalyser {

	MoodA moodA = (mood)-> {
		try {
			if(mood.length()==0) {
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Please Enter Valid String");
			}
			if(mood.contains("sad")) {
				return "SAD";
			}
			return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Please Enter Valid String");
		}
		
	};

}
