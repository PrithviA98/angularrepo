package com.aciworldwide.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;
import com.aciworldwide.repositories.UserRepository;


//********MODEL 
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
//Business logic method implementation
	@Override
	public boolean isValidUser(User user) {
		// TODO Auto-generated method stub
		User dbUser=userRepository.findByUsername(user.getUsername());		
		
		//Business logic
		//if(dbUser!=null&&dbUser.getUsername().equals("Prithvi")&dbUser.getPassword().equals("Welcome"))
		if(dbUser!=null&& user.getPassword().equals(dbUser.getPassword()))
			return true;
		else
			return false;
		
	}

}
