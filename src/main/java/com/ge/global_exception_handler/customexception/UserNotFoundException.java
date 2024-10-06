package com.ge.global_exception_handler.customexception;

public class UserNotFoundException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String message) {
		
		super(message);
	}

}
