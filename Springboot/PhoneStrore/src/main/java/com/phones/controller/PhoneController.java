package com.phones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phones.model.Phones;
import com.phones.service.PhoneService;

@RestController
@RequestMapping("/phones")
public class PhoneController {

	@Autowired
	PhoneService phoneService;

	@PostMapping("/save")
	public ResponseEntity<Phones> savePhone(@RequestBody Phones phone) {
		return new ResponseEntity<Phones>(phoneService.savePhone(phone), HttpStatus.OK);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Phones>> getAllPhones() {
		return new ResponseEntity<List<Phones>>(phoneService.getAllPhones(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Phones> updatePhone(@RequestBody Phones phone) {
		return new ResponseEntity<Phones>(phoneService.updatePhone(phone), HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deletePhone(@PathVariable int id) {
		phoneService.deletePhone(id);
		return new ResponseEntity<String>("Phone data deleted successfully", HttpStatus.OK);
	}
	
}