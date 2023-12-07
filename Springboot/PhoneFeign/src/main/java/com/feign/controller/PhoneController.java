package com.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.model.Phones;
import com.feign.utility.PhoneClient;
@RestController
@RequestMapping("sphones")
public class PhoneController {
	
	@Autowired
	PhoneClient phoneClient;
	
	@PostMapping("/save")
	public ResponseEntity<Phones> saveBook(@RequestBody Phones phone) {
		return phoneClient.savePhone(phone);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Phones> updatephone(@RequestBody Phones phone){
		return new ResponseEntity<Phones>(phoneClient.updatePhone(phone), HttpStatus.OK);
	}
}