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
	
	public String EmailValidator(String s) {
		
		 String regex = "^(?!.*\\.{2})([a-zA-Z0-9]+)([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]?)([a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)@([a-z A-Z]{2,20}).([a-z A-Z]{2,4})(.[a-z]{2,8})?$";
	     
	      boolean result = Pattern.matches(regex,s);
	      if(result) {
				return "valid";
			}
			return "in-valid";
	   }

	public String PhoneNumber(String s) {
		String regex = "^([0-9]{2})(\\s)([0-9]{10})$";
	     
	    boolean result = Pattern.matches(regex,s);
		if(result) {
			return "valid";
		}
		return "in-valid";
	}
}
