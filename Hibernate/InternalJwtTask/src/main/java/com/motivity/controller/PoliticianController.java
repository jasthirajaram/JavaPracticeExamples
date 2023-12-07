package com.motivity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.motivity.model.AuthRequest;
import com.motivity.model.Politician;
import com.motivity.service.PoliticianService;
import com.motivity.util.JwtUtil;

@RestController
public class PoliticianController {

	@Autowired
	private PoliticianService politicianService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@PostMapping("/save")
	ResponseEntity<Politician> savePol(@RequestBody Politician politician){
		return new ResponseEntity<Politician>(politicianService.savePolitician(politician), HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	ResponseEntity<Politician> getPolitician(@PathVariable int id){
		return new ResponseEntity<Politician>(politicianService.getPolitician(id), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	ResponseEntity<Politician> updatePolitician(@PathVariable int id, @RequestBody Politician politician){
		return new ResponseEntity<Politician>(politicianService.updatePolitician(id, politician), HttpStatus.OK);
	}
	
	@PostMapping("/authenticate")
	public String generate(@RequestBody AuthRequest authRequest) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
		}catch(Exception exception) {
			throw new Exception("Invalid Credentials");
		}
		return jwtUtil.generateToken(authRequest.getUsername());
	}
	
}
