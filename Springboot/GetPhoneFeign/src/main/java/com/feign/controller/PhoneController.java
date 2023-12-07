package com.feign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.model.Phones;
import com.feign.utility.PhoneClient;
@RestController
@RequestMapping("/gphones")
public class PhoneController {

	@Autowired
	PhoneClient phoneClient;

	@GetMapping("/getall")
	public ResponseEntity<List<Phones>> getAllPhones() {
		return new ResponseEntity<List<Phones>>(phoneClient.getAllPhones(), HttpStatus.OK);
	}
}