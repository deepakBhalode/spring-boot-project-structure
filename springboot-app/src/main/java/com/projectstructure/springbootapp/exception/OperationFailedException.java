package com.projectstructure.springbootapp.exception;

import com.projectstructure.springbootapp.utility.ExceptionMessage;

public class OperationFailedException extends Exception {

	private static final long serialVersionUID = -7975753302793262327L;

	public OperationFailedException() {
		super(ExceptionMessage.OPERATION_FAILED);
	}

	/**
	 * @param message
	 */
	public OperationFailedException(String message) {
		super(message);
	}
	
}