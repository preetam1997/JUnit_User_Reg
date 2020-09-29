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
		String Name = user.FirstName("Mukhopadhyay");
		assertEquals("valid", Name);
		
	} 
	
	@Test
	public void GIVEN_LAST_NAME_DOES_NOT_STARTS_CAP_AND_CONTAINS_3_OR_MORE_LETTERS() {
		
		UserReg user = new UserReg();
		String LName = user.FirstName("pk");
		assertEquals("in-valid", LName);
		
	} 
	
	

}
