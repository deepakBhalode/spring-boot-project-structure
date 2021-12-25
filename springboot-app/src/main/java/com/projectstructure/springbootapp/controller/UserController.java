package com.projectstructure.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectstructure.springbootapp.config.RequestResponse;
import com.projectstructure.springbootapp.dto.UserDetail;
import com.projectstructure.springbootapp.exception.OperationFailedException;
import com.projectstructure.springbootapp.service.UserService;
import com.projectstructure.springbootapp.utility.Route;

@RestController
@RequestMapping(Route.USER)
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping(Route.REGISTER_USER)
	public ResponseEntity<RequestResponse> registerUser(@RequestBody UserDetail userDetail) throws OperationFailedException {
		userService.registerUser(userDetail);
		RequestResponse requestResponse = new RequestResponse(null, null, null);
		return new ResponseEntity<>(requestResponse, HttpStatus.CREATED);
		 
	}
	
	@GetMapping(Route.GET_USER_BY_EMAIL)
	public void getUserDetailByEmail(@PathVariable String email) throws OperationFailedException {
		userService.getUserDetailByEmail(email);
	}
	
}