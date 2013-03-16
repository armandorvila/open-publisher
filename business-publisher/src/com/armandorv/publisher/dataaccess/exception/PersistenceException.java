package com.armandorv.publisher.dataaccess.exception;

public class PersistenceException extends RuntimeException {


	private static final long serialVersionUID = -787559514187112239L;

	public PersistenceException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersistenceException(String message) {
		super(message);
		
	}
	
	

}
