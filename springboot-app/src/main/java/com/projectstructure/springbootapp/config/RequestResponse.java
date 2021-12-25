package com.projectstructure.springbootapp.config;

import org.springframework.http.HttpStatus;

public class RequestResponse {

	//properties
	private String path;
	
	private HttpStatus httpStatus;
	
	private String message;
	
	private Object resultSet;

	//constructor
	public RequestResponse(String path, HttpStatus httpStatus, String message) {
		super();
		this.path = path;
		this.httpStatus = httpStatus;
		this.message = message;
	}
	
	public RequestResponse(String path, HttpStatus httpStatus, String message, Object resultSet) {
		super();
		this.path = path;
		this.httpStatus = httpStatus;
		this.message = message;
		this.resultSet = resultSet;
	}
	
	//getter and setters
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResultSet() {
		return resultSet;
	}

	public void setResultSet(Object resultSet) {
		this.resultSet = resultSet;
	}
	
}