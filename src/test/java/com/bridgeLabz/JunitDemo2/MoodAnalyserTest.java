package com.bridgeLabz.JunitDemo2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
	
	@Test
	public void GIVEN_METHOD_RETURNS_SAD() {
		
		MoodAnalyser mood = new MoodAnalyser();
		String mood1;
		try {
			//ExpectedException exceptionRule = ExpectedException.none();
			//exceptionRule.expect(MoodAnalysisException.class);
			mood1 = mood.Mood(null);
			//assertEquals("SAD", mood1);
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
			//e.printStackTrace();
		}
		
	}
}
