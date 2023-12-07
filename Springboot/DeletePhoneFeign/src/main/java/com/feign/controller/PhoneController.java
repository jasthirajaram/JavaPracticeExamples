package com.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.utility.PhoneClient;

@RestController
@RequestMapping("/dphones")
public class PhoneController {
	
	@Autowired
	PhoneClient phoneClient;

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletePhone(@PathVariable int id) {
		phoneClient.deletePhone(id);
		return new ResponseEntity<String>("Deleted successfully", HttpStatus.OK);
	}
}
