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
		String FName = user.FirstName("Preetam");
		assertEquals("valid", FName);
		
	} 
	
	@Test
	public void GIVEN_FIRST_NAME_DOES_NOT_STARTS_CAP_AND_CONTAINS_3_OR_MORE_LETTERS() {
		
		UserReg user = new UserReg();
		String Name = user.FirstName("pk");
		assertEquals("in-valid", Name);
		
	} 
	
	
	@Test
	public void GIVEN_LAST_NAME_STARTS_CAP_AND_CONTAINS_3_OR_MORE_LETTERS() {
		
		UserReg user = new UserReg();
		String Name = user.LastName("Mukhopadhyay");
		assertEquals("valid", Name);
		
	} 
	
	@Test
	public void GIVEN_LAST_NAME_DOES_NOT_STARTS_CAP_AND_CONTAINS_3_OR_MORE_LETTERS() {
		
		UserReg user = new UserReg();
		String LName = user.LastName("pk");
		assertEquals("in-valid", LName);
		
	} 
	
	
	@Test
	public void GIVEN_EMAIL_FORMAT_IS_CORRECT() {
		UserReg user = new UserReg();
		String Email = user.EmailValidator("ompreetam@gmail.com");
		assertEquals("valid", Email);
		
	}
	
	@Test
	public void GIVEN_EMAIL_FORMAT_IS_NOT_CORRECT() {
		UserReg user = new UserReg();
		String Email = user.EmailValidator("ompreetam.@gmail.com");
		assertEquals("in-valid", Email);
		
	}
	
	@Test
	public void GIVEN_PHONE_NUMBER_FORMAT_IS_CORRECT() {
		UserReg user = new UserReg();
		String Ph_no = user.PhoneNumber("91 8240755200");
		assertEquals("valid", Ph_no);
		
	}
	
	@Test
	public void GIVEN_PHONE_NUMBER_FORMAT_IS_NOT_CORRECT() {
		UserReg user = new UserReg();
		String Ph_no = user.PhoneNumber("91. 8240755200");
		assertEquals("in-valid", Ph_no);
		
	}
	
	@Test
	public void GIVEN_PASSPWRD_IS_ACCEPTABLE() {
		UserReg user = new UserReg();
		String PassWord = user.PassWord("Za1S.ORD");
		assertEquals("valid", PassWord);
		
	}
	
	@Test
	public void GIVEN_PASSPWRD_IS_NOT_ACCEPTABLE() {
		UserReg user = new UserReg();
		String PassWord = user.PassWord("ZaoneS.ORD");
		assertEquals("in-valid", PassWord);
		
	}
	
	@Test
	public void GIVEN_EMAIL_FORMAT_IS_CORRECT_1() {
		UserReg user = new UserReg();
		
		assertEquals("valid", user.EmailValidator("abc@yahoo.com"));
		assertEquals("valid", user.EmailValidator("abc-100@yahoo.com"));
		assertEquals("valid", user.EmailValidator("abc.100@gmail.com"));
		assertEquals("valid", user.EmailValidator("abc111@abc.com"));
		assertEquals("valid", user.EmailValidator("abc-100@abc.net"));
		assertEquals("valid", user.EmailValidator("abc.100@abc.com.au"));
		assertEquals("valid", user.EmailValidator("abc@gmail.com.com"));
		assertEquals("valid", user.EmailValidator("abc+100@gmail.com"));
		assertEquals("in-valid", user.EmailValidator("abc"));//in-valid
		assertEquals("in-valid", user.EmailValidator("abc@.com.my"));
		assertEquals("in-valid", user.EmailValidator("abc123@gmail.a"));
		assertEquals("in-valid", user.EmailValidator(".abc@abc.com"));
		assertEquals("in-valid", user.EmailValidator("abc()*@gmail.com.com"));
		assertEquals("in-valid", user.EmailValidator("abc@%*.com.com"));
		assertEquals("in-valid", user.EmailValidator("abc..2002@gmail.com"));
		assertEquals("in-valid", user.EmailValidator("abc.@gmail.com"));
		assertEquals("in-valid", user.EmailValidator("abc@abc@gmail.com"));
		assertEquals("in-valid", user.EmailValidator("abc@gmail.com.1a"));
		assertEquals("in-valid", user.EmailValidator("abc@gmail.com.aa.au"));
		assertEquals("in-valid", user.EmailValidator("abc@1.com"));
		
	}

}
