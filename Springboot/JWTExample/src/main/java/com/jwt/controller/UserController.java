package com.jwt.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.AuthRequest;
import com.jwt.utility.UserUtility;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserUtility userUtility;

	@Autowired
	AuthenticationManager authenticationManager;

	@GetMapping("/home")
	public String home() {
		return "Hello Motivity";
	}

	@PostMapping("/verify")
	public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
		} catch (Exception e) {
			throw new Exception("Invalid username or password");
		}
		return userUtility.generateToken(authRequest.getUserName());
	}
}
