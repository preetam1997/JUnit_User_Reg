package com.bridgeLabz.JunitDemo2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class UserRegTest {
	
	UserReg user = null;
	
	@Before
	public void initialize() {
		 user = new UserReg();
	}
	public void Welcome() {
		
		System.out.println("Welcome to JUnit Testing of User Registeration");
	}
	
	
	
	@Test
	public void GIVEN_FIRST_NAME_DOESNT_STARTS_CAP_AND_CONTAINS_3_OR_MORE_LETTERS() {
		
		
		String FName1;
		try {
			FName1 = user.uriFirstName.User("pr");
			
		} catch (UserRegExecption e) {
			// TODO Auto-generated catch block
			
			assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			
			//e.printStackTrace();
		}
		
		
	} 
	@Test
	public void GIVEN_FIRST_NAME_IS_EMPTY() {
		
		
		String FName1;
		try {
			FName1 = user.uriFirstName.User("");
			
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
			FName1 = user.uriFirstName.User(null);
			
		} catch (UserRegExecption e) {
			// TODO Auto-generated catch block
			assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
			//e.printStackTrace();
		}
		
		
	} 
	
	


	@Test
	public void GIVEN_LAST_NAME_DOESNT_STARTS_CAP_AND_CONTAINS_3_OR_MORE_LETTERS() {
	
		String Name;
		try {
			Name = user.uriLastName.User("mu");
		} catch (UserRegExecption e) {
			
			assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			//e.printStackTrace();
		}
		
	}
	
	@Test
	public void GIVEN_LAST_NAME_IS_EMPTY() {
	
		String Name;
		try {
			Name = user.uriLastName.User("");
		} catch (UserRegExecption e) {
			
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_EMPTY, e.type);
			//e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void GIVEN_LAST_NAME_IS_NULL() {
	
		String Name;
		try {
			Name = user.uriLastName.User(null);
		} catch (UserRegExecption e) {
			
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
			//e.printStackTrace();
		}
		
	}
	
	@Test
	public void GIVEN_EMAIL_FORMAT_IS_NOT_CORRECT() {
		String Email;
		try {
			Email = user.uriEmail.User("abc");
		} catch (UserRegExecption e) {
			
			assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			//e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void GIVEN_EMAIL_FORMAT_IS_EMPTY() {
		
		String Email;
		try {
			Email = user.uriEmail.User("");
		} catch (UserRegExecption e) {
			
			assertEquals(UserRegExecption.ExceptionType.ENTERED_EMPTY, e.type);
			//e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void GIVEN_EMAIL_FORMAT_IS_NULL() {
		
		String Email;
		try {
			Email = user.uriEmail.User(null);
		} catch (UserRegExecption e) {
			
			assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
			//e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void GIVEN_PHONE_NUMBER_FORMAT_IS_NOT_CORRECT() {
		
		String Ph_no;
		try {
			Ph_no = user.uriPhoneNumber.User("  abc");
		} catch (UserRegExecption e) {
			
			assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			//e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void GIVEN_PHONE_NUMBER_FORMAT_IS_EMPTY() {
		
		String Ph_no;
		try {
			Ph_no = user.uriPhoneNumber.User("");
		} catch (UserRegExecption e) {
			
			assertEquals(UserRegExecption.ExceptionType.ENTERED_EMPTY, e.type);
			//e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void GIVEN_PHONE_NUMBER_FORMAT_IS_NULL() {
		
		String Ph_no;
		try {
			Ph_no = user.uriPhoneNumber.User(null);
		} catch (UserRegExecption e) {
			
				assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
			
			//e.printStackTrace();
		}
		
		
	}
	
	
	@Test
	public void GIVEN_PASSWORD_IS_NOT_ACCEPTABLE() {
		
		String PassWord;
		try {
			PassWord = user.uriPassWord.User("ZaS..,ORD");
		} catch (UserRegExecption e) {
			
			assertEquals(UserRegExecption.ExceptionType.ENTERED_INVALID, e.type);
			//e.printStackTrace();
		}
		
		
	}
	
	public void GIVEN_PASSWORD_IS_EMPTY() {
		
		String PassWord;
		try {
			PassWord = user.uriPassWord.User("");
		} catch (UserRegExecption e) {
			
			assertEquals(UserRegExecption.ExceptionType.ENTERED_EMPTY, e.type);
			//e.printStackTrace();
		}
		
		
	}
	
	public void GIVEN_PASSWORD_IS_NULL() {
		
		String PassWord;
		try {
			PassWord = user.uriPassWord.User(null);
		} catch (UserRegExecption e) {
			
			assertEquals(UserRegExecption.ExceptionType.ENTERED_NULL, e.type);
			//e.printStackTrace();
		}
		
		
	}

}