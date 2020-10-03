package com.bridgeLabz.JunitDemo2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class UserRegTest {
	
	public void Welcome() {
		
		System.out.println("Welcome to JUnit Testing of User Registeration");
	}
	
	@Test
	public void GIVEN_FIRST_NAME_DOESNT_STARTS_CAP_AND_CONTAINS_3_OR_MORE_LETTERS() {
		
		UserReg user = new UserReg();
		String FName1;
		try {
			FName1 = user.FirstName("pr");
			
		} catch (UserRegExecption e) {
			// TODO Auto-generated catch block
			
			
				
				
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			
				
			//e.printStackTrace();
		}
		
		
	} 
	@Test
	public void GIVEN_FIRST_NAME_IS_EMPTY() {
		
		UserReg user = new UserReg();
		String FName1;
		try {
			FName1 = user.FirstName("");
			
		} catch (UserRegExecption e) {
			// TODO Auto-generated catch block
			
			
				
				assertEquals(UserRegExecption.ExceptionType.ENTERED_EMPTY, e.type);
			//e.printStackTrace();
		}
		
		
	} 
	
	@Test
	public void GIVEN_FIRST_NAME_IS_NULL() {
		
		UserReg user = new UserReg();
		String FName1;
		try {
			FName1 = user.FirstName(null);
			
		} catch (UserRegExecption e) {
			// TODO Auto-generated catch block
			
			
				
				assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
			//e.printStackTrace();
		}
		
		
	} 
	
	


	@Test
	public void GIVEN_LAST_NAME_DOESNT_STARTS_CAP_AND_CONTAINS_3_OR_MORE_LETTERS() {
	
		UserReg user = new UserReg();
		String Name;
		try {
			Name = user.LastName("mu");
		} catch (UserRegExecption e) {
			
				
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			
				
			//e.printStackTrace();
		}
		
	}
	
	@Test
	public void GIVEN_LAST_NAME_IS_EMPTY() {
	
		UserReg user = new UserReg();
		String Name;
		try {
			Name = user.LastName("");
		} catch (UserRegExecption e) {
			
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_EMPTY, e.type);
			//e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void GIVEN_LAST_NAME_IS_NULL() {
	
		UserReg user = new UserReg();
		String Name;
		try {
			Name = user.LastName(null);
		} catch (UserRegExecption e) {
			
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
			//e.printStackTrace();
		}
		
	}
	
	@Test
	public void GIVEN_EMAIL_FORMAT_IS_NOT_CORRECT() {
		UserReg user = new UserReg();
		String Email;
		try {
			Email = user.EmailValidator("abc");
		} catch (UserRegExecption e) {
			
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			
			//e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void GIVEN_EMAIL_FORMAT_IS_EMPTY() {
		UserReg user = new UserReg();
		String Email;
		try {
			Email = user.EmailValidator("");
		} catch (UserRegExecption e) {
			
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_EMPTY, e.type);
			//e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void GIVEN_EMAIL_FORMAT_IS_NULL() {
		UserReg user = new UserReg();
		String Email;
		try {
			Email = user.EmailValidator(null);
		} catch (UserRegExecption e) {
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
			
			//e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void GIVEN_PHONE_NUMBER_FORMAT_IS_NOT_CORRECT() {
		UserReg user = new UserReg();
		String Ph_no;
		try {
			Ph_no = user.PhoneNumber("  abc");
		} catch (UserRegExecption e) {
			
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			
			//e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void GIVEN_PHONE_NUMBER_FORMAT_IS_EMPTY() {
		UserReg user = new UserReg();
		String Ph_no;
		try {
			Ph_no = user.PhoneNumber("");
		} catch (UserRegExecption e) {
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_EMPTY, e.type);
			//e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void GIVEN_PHONE_NUMBER_FORMAT_IS_NULL() {
		UserReg user = new UserReg();
		String Ph_no;
		try {
			Ph_no = user.PhoneNumber(null);
		} catch (UserRegExecption e) {
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
			
			//e.printStackTrace();
		}
		
		
	}
	
	
	@Test
	public void GIVEN_PASSWORD_IS_NOT_ACCEPTABLE() {
		UserReg user = new UserReg();
		String PassWord;
		try {
			PassWord = user.PassWord("ZaS..,ORD");
		} catch (UserRegExecption e) {
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			
			//e.printStackTrace();
		}
		
		
	}
	
	public void GIVEN_PASSWORD_IS_EMPTY() {
		UserReg user = new UserReg();
		String PassWord;
		try {
			PassWord = user.PassWord("");
		} catch (UserRegExecption e) {
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_EMPTY, e.type);
			//e.printStackTrace();
		}
		
		
	}
	
	public void GIVEN_PASSWORD_IS_NULL() {
		UserReg user = new UserReg();
		String PassWord;
		try {
			PassWord = user.PassWord(null);
		} catch (UserRegExecption e) {
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
			
			//e.printStackTrace();
		}
		
		
	}

}