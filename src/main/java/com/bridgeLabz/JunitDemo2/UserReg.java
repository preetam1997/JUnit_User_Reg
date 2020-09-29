package com.bridgeLabz.JunitDemo2;

import java.util.regex.Pattern;

public class UserReg {

	public String FirstName(String s) {
		String regex = "^([A-Z]{1})([a-z]{2,})$";
	     
	    boolean result = Pattern.matches(regex,s);
		if(result) {
			return "valid";
		}
		return "in-valid";
	}
	
	public String LastName(String s) {
		String regex = "^([A-Z]{1})([a-z]{2,})$";
	     
	    boolean result = Pattern.matches(regex,s);
		if(result) {
			return "valid";
		}
		return "in-valid";
	}

	
}
