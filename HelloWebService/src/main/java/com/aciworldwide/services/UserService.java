package com.aciworldwide.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.aciworldwide.entities.User;
import com.aciworldwide.entities.UserPrincipal;
import com.aciworldwide.repositories.UserRepository;



public class UserService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		User user=userRepository.findByUsername(username);
		
		if(user!=null)
			return new UserPrincipal(user);
		else
			throw new UsernameNotFoundException("Sorry username not found 404...");
	}

}
