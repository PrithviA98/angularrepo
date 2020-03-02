package com.aciworldwide.services;

import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;


//********MODEL
@Service
public class UserServiceImpl implements UserService {
	
	
	
	
//Business logic method implementation
	@Override
	public boolean isValidUser(User user) {
		// TODO Auto-generated method stub
		
		//Business logic
		
		if(user!=null&&user.getUsername().equals("Prithvi")&user.getPassword().equals("Welcome"))
			return true;
		else
			return false;
		
	}

}
