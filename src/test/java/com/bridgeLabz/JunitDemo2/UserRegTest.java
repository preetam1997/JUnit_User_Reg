package com.bridgeLabz.JunitDemo2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class UserRegTest {
	
	public void Welcome() {
		
		System.out.println("Welcome to JUnit Testing of User Registeration");
	}
	
	@Test
	public void GIVEN_FIRST_NAME_STARTS_CAP_AND_CONTAINS_3_OR_MORE_LETTERS() {
		
		UserReg user = new UserReg();
		String FName1;
		try {
			FName1 = user.FirstName("");
			
		} catch (UserRegExecption e) {
			// TODO Auto-generated catch block
			
			if(e.getMessage().matches("Please Enter valid String which is not null") )
				assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
				
			if(e.getMessage().matches("Please Enter valid String") )
				assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			
			if(e.getMessage().matches("Please Enter Valid String which is not Empty"))
				assertEquals(UserRegExecption.ExceptionType.ENTERED_EMPTY, e.type);
			//e.printStackTrace();
		}
		
		
	} 
	
	


	@Test
	public void GIVEN_LAST_NAME_STARTS_CAP_AND_CONTAINS_3_OR_MORE_LETTERS() {
	
		UserReg user = new UserReg();
		String Name;
		try {
			Name = user.LastName(null);
		} catch (UserRegExecption e) {
			if(e.getMessage().matches("Please Enter valid String which is not null") )
				assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
			
			if(e.getMessage().matches("Please Enter Valid String") ) 
				assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			
			if(e.getMessage().matches("Please Enter Valid String which is not Empty"))
				assertEquals(UserRegExecption.ExceptionType.ENTERED_EMPTY, e.type);
			//e.printStackTrace();
		}
		
	}
	
	@Test
	public void GIVEN_EMAIL_FORMAT_IS_CORRECT() {
		UserReg user = new UserReg();
		String Email;
		try {
			Email = user.EmailValidator("");
		} catch (UserRegExecption e) {
			if(e.getMessage().matches("Please Enter valid String which is not null") )
				assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
			
			if(e.getMessage().matches("Please Enter Valid String") ) 
				assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			
			if(e.getMessage().matches("Please Enter Valid String which is not Empty"))
				assertEquals(UserRegExecption.ExceptionType.ENTERED_EMPTY, e.type);
			//e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void GIVEN_PHONE_NUMBER_FORMAT_IS_CORRECT() {
		UserReg user = new UserReg();
		String Ph_no;
		try {
			Ph_no = user.PhoneNumber("91 8240755200");
		} catch (UserRegExecption e) {
			if(e.getMessage().matches("Please Enter valid String which is not null") )
				assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
			
			if(e.getMessage().matches("Please Enter Valid String") ) 
				assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			
			if(e.getMessage().matches("Please Enter Valid String which is not Empty"))
				assertEquals(UserRegExecption.ExceptionType.ENTERED_EMPTY, e.type);
			//e.printStackTrace();
		}
		
		
	}
	
	
	@Test
	public void GIVEN_PASSPWRD_IS_ACCEPTABLE() {
		UserReg user = new UserReg();
		String PassWord;
		try {
			PassWord = user.PassWord("Za1S.ORD");
		} catch (UserRegExecption e) {
			if(e.getMessage().matches("Please Enter valid String which is not null") )
				assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
			
			if(e.getMessage().matches("Please Enter Valid String") ) 
				assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			
			if(e.getMessage().matches("Please Enter Valid String which is not Empty"))
				assertEquals(UserRegExecption.ExceptionType.ENTERED_EMPTY, e.type);
			//e.printStackTrace();
		}
		
		
	}

}