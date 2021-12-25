package com.projectstructure.springbootapp.service;

import com.projectstructure.springbootapp.dto.UserDetail;
import com.projectstructure.springbootapp.exception.OperationFailedException;

public interface UserService {

	void registerUser(UserDetail userDetail) throws OperationFailedException;
	
	UserDetail getUserDetailByEmail(String email) throws OperationFailedException;
	
}