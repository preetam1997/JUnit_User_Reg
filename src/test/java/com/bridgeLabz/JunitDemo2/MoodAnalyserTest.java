package com.bridgeLabz.JunitDemo2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;



public class MoodAnalyserTest {
	
	

		MoodAnalyser moodAnaylser = null;
		
		@Before
		public void initialize() {
			 moodAnaylser = new MoodAnalyser();
		}
		
		@Test
		public void givenMessage_WhenSad_ShouldReturnSad() {
			String mood;
			
				try {
					mood = moodAnaylser.moodA.Mood(null);
				} catch (MoodAnalysisException e) {
					// TODO Auto-generated catch block
					assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
					//e.printStackTrace();
				}
				
			
		}
	}

