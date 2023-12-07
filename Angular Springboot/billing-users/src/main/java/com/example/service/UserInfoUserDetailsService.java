package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;

@Service
public class UserInfoUserDetailsService implements UserDetailsService {
//
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<User> optionalUser = userRepository.findByUsername(userName);
		return optionalUser.map(UserInfoUserDetails::new)
		            .orElseThrow(() -> new UsernameNotFoundException("User not found "+userName, null));	
	}

}