package com.bridgeLabz.JunitDemo2;

public class UserRegExecption extends Exception{
	enum ExceptionType{
		ENTERED_NULL,ENTERED_EMPTY,ENTERED_INVALID
	}
	
	ExceptionType type;

	public UserRegExecption(ExceptionType type,String message) {
		super(message);
		this.type = type;
	}
	
}
