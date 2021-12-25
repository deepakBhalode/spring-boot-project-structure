package com.projectstructure.springbootapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.projectstructure.springbootapp.dto.UserDetail;
import com.projectstructure.springbootapp.entity.User;
import com.projectstructure.springbootapp.exception.OperationFailedException;
import com.projectstructure.springbootapp.repository.UserRepository;

public class UserServiceImpl implements UserService {

	@Autowired
    private BCryptPasswordEncoder bcryptEncoder;
    @Autowired
    private ModelMapper modelMapper;    
    @Autowired
    private UserRepository userRepository;

	
	public void registerUser(UserDetail userDetail) throws OperationFailedException {
		User newUser = modelMapper.map(userDetail, User.class);
		try {
			newUser.setPassword(bcryptEncoder.encode(userDetail.getPassword()));
			userRepository.save(newUser);
		} catch(Exception exp) {
			throw new OperationFailedException();
		}
	}

	public UserDetail getUserDetailByEmail(String email) throws OperationFailedException {
		UserDetail userDetail = new UserDetail();
		
		try {
			
		} catch(Exception exp) {
			throw new OperationFailedException();
		}
		
		return userDetail;
	}

}