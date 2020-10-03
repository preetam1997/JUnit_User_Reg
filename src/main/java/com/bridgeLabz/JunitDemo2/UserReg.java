package com.bridgeLabz.JunitDemo2;

import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegInterface {
	String User(String t) throws UserRegExecption ;
}

public class UserReg {

	UserRegInterface uriFirstName = (s)->  {
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
	
	};
	
	UserRegInterface uriLastName = (s)->  {
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
		
	};
	
	UserRegInterface uriEmail = (s)->  {
		
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
		
	   };
	
	   UserRegInterface uriEmailParameterised = (s)->  {
		
		 String regex = "^(?!.*\\.{2})([a-zA-Z0-9]+)([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]?)([a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)@([a-z A-Z]{2,20}).([a-z A-Z]{2,4})(.[a-z]{2,8})?$";
	     
		 boolean result = Pattern.matches(regex,s);
		 	if(result) {
		 		return "valid";
		 		}
			return "in-valid";
		};
	
	

		UserRegInterface uriPhoneNumber = (s)->  {
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
		
	};
	
	UserRegInterface uriPassWord = (s)->  {
		
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
		
	};
}
