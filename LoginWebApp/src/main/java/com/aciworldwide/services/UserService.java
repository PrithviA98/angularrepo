package com.aciworldwide.services;

import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;

//SERVICES....BUSINESS LAYER --*******MODEL INTERFACE

public interface UserService {
	
	//BUSINESS LOGIC METHODS
	boolean isValidUser(User user);

}
