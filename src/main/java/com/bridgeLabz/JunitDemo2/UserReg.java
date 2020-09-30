package com.bridgeLabz.JunitDemo2;

import java.util.regex.Pattern;

public class UserReg {

	public String FirstName(String s) throws UserRegExecption {
		String regex = "^([A-Z]{1})([a-z]{2,})$";
	     
	   try {
		   if(s.length()==0) {
				throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_EMPTY, "Please Enter Valid String which is not Empty");
			}
		   boolean result = Pattern.matches(regex,s);
			if(result) {
				return "valid";
			}
			throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_INVALID, "Please Enter Valid String");
		
	} catch (NullPointerException e) {
		//return "valid";
		throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_NULL, "Please Enter valid String which is not null");
	}
	
	}
	
	public String LastName(String s) throws UserRegExecption {
		String regex = "^([A-Z]{1})([a-z]{2,})$";
		  try {
			   if(s.length()==0) {
					throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_EMPTY, "Please Enter Valid String which is not Empty");
				}
			   boolean result = Pattern.matches(regex,s);
				if(result) {
					return "valid";
				}
				throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_INVALID, "Please Enter Valid String");
			
		} catch (NullPointerException e) {
			//return "valid";
			throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_NULL, "Please Enter valid String which is not null");
		}
		
	}
	
	public String EmailValidator(String s) throws UserRegExecption {
		
		 String regex = "^(?!.*\\.{2})([a-zA-Z0-9]+)([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]?)([a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)@([a-z A-Z]{2,20}).([a-z A-Z]{2,4})(.[a-z]{2,8})?$";
	     
		  try {
			   if(s.length()==0) {
					throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_EMPTY, "Please Enter Valid String which is not Empty");
				}
			   boolean result = Pattern.matches(regex,s);
				if(result) {
					return "valid";
				}
				throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_INVALID, "Please Enter Valid String");
			
		} catch (NullPointerException e) {
			//return "valid";
			throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_NULL, "Please Enter valid String which is not null");
		}
		
	   }
	
	public String EmailValidatorForParameterisedTesting(String s) {
		
		 String regex = "^(?!.*\\.{2})([a-zA-Z0-9]+)([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]?)([a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)@([a-z A-Z]{2,20}).([a-z A-Z]{2,4})(.[a-z]{2,8})?$";
	     
		 boolean result = Pattern.matches(regex,s);
		 	if(result) {
		 		return "valid";
		 		}
			return "in-valid";
		}
	
	

	public String PhoneNumber(String s) throws UserRegExecption {
		String regex = "^([0-9]{2})(\\s)([0-9]{10})$";
	     
		  try {
			   if(s.length()==0) {
					throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_EMPTY, "Please Enter Valid String which is not Empty");
				}
			   boolean result = Pattern.matches(regex,s);
				if(result) {
					return "valid";
				}
				throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_INVALID, "Please Enter Valid String");
			
		} catch (NullPointerException e) {
			//return "valid";
			throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_NULL, "Please Enter valid String which is not null");
		}
		
	}
	
	public String PassWord(String s) throws UserRegExecption {
		
		String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^.,:;'!@#$%^&*_+=|]*[.,:;'!@#$%^&*_+=|][^.,:;'!@#$%^&*_+=|]*$)[A-Za-z0-9.,:;'!@#$%^&*_+=|]{8,16}$";
	    
		  try {
			   if(s.length()==0) {
					throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_EMPTY, "Please Enter Valid String which is not Empty");
				}
			   boolean result = Pattern.matches(regex,s);
				if(result) {
					return "valid";
				}
				throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_INVALID, "Please Enter Valid String");
			
		} catch (NullPointerException e) {
			//return "valid";
			throw new UserRegExecption(UserRegExecption.ExceptionType.ENTERED_NULL, "Please Enter valid String which is not null");
		}
		
	}
}
