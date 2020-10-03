package com.bridgeLabz.JunitDemo2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParametricEmailTester {
	
	private String email;
	private String result;
	
	private UserReg user;
	
	public ParametricEmailTester(String email,String result) {
		
		this.email = email;
		this.result = result;
	}
	
	@Before
	public void initialize() {
		user = new UserReg();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com","valid"},
			{"abc-100@yahoo.com","valid"},
			{"abc.100@gmail.com","valid"},
			{"abc111@abc.com","valid"},
			{"abc-100@abc.net","valid"},
			{"abc.100@abc.com.au","valid"},
			{"abc@gmail.com.com","valid"},
			{"abc+100@gmail.com","valid"},
			{"abc","in-valid"},
			{"abc@.com.my","in-valid"},
			{"abc123@gmail.a","in-valid"},
			{".abc@abc.com","in-valid"},
			{"abc()*@gmail.com.com","in-valid"},
			{"abc@%*.com.com","in-valid"},
			{"abc..2002@gmail.com","in-valid"},
			{"abc.@gmail.com","in-valid"},
			{"abc@abc@gmail.com","in-valid"},
			{"abc@gmail.com.1a","in-valid"},
			{"abc@gmail.com.aa.au","in-valid"},
			{"abc@1.com","in-valid"}});
	}
	
	@Test
	public void testEmail(){
		try {
			assertEquals(result, user.uriEmailParameterised.User(email));
		} catch (UserRegExecption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
