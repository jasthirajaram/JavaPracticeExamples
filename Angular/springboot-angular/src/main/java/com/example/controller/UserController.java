package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.UserDto;
import com.example.entity.LoginRequest;
import com.example.service.UserService;
import com.example.util.JwtUtil;

import lombok.AllArgsConstructor;

@CrossOrigin("http://localhost:4200")
@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/save")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto user) {
		System.out.println("SAVE METHOD STARTED");
		UserDto saveduser = userService.createUser(user);
		System.out.println("SAVE METHOD ENDED" + saveduser);
		return new ResponseEntity<>(saveduser, HttpStatus.CREATED);
	}

	@GetMapping("/getall")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ResponseEntity<List<UserDto>> getAllUsers() {
		List<UserDto> users = userService.getAllUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@GetMapping("/getbyid/{id}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId) {
		UserDto user = userService.getUserById(userId);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@GetMapping("/getbyname/{username}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public ResponseEntity<UserDto> getUserByUsername(@PathVariable("username") String userName) {
		UserDto user = userService.getUserByUsername(userName);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId, @RequestBody UserDto user) {
		user.setId(userId);
		UserDto updatedUser = userService.updateUser(user);
		return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId) {
		userService.deleteUser(userId);
		return new ResponseEntity<>("User successfully deleted", HttpStatus.OK);
	}

//	@PostMapping("/login")
//	public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
//		String userName = loginRequest.getUserName();
//		String password = loginRequest.getPassword();
//
//		User user = userService.validateUser(userName, password);
//		if (user != null) {
//			return ResponseEntity.ok(user);
//		} else {
//			// Invalid username or password
//			return ResponseEntity.status(HttpStatus.UNAUTHORIZED.value()).build();
//		}
//	}

	@PostMapping("/authenticate")
	public String authenticateAndGetToken(@RequestBody LoginRequest loginRequest) {
//		System.out.println("Authenticate Method");
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUserName(), loginRequest.getPassword()));
		if (authentication.isAuthenticated()) {
			String res = jwtUtil.generateToken(loginRequest.getUserName());
			String result = "{\"token\":\"" + res + "\"}";
			return result;
		} else {
			throw new UsernameNotFoundException("Invalid username or password");
		}

	}
}