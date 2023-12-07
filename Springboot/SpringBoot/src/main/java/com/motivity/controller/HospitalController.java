package com.motivity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motivity.entity.Hospital;
import com.motivity.service.HospitalService;

@RestController
@RequestMapping("/hosp")
public class HospitalController 
{
	@Autowired
	private HospitalService hs;
	
	@PostMapping("/save")
	public ResponseEntity<Hospital> save(@RequestBody Hospital h)
	{
		Hospital h1=hs.save(h);
		return new ResponseEntity<Hospital> (h1,HttpStatus.OK);
		
	}
	@GetMapping("/and/{fname}/or/{lname}")
	public ResponseEntity<List<Hospital>> findByNames(@PathVariable String fname,@PathVariable String lname)
	{
		List<Hospital> hh=hs.findByFirstAndLastName(fname, lname);
		return new ResponseEntity<List<Hospital>> (hh,HttpStatus.OK);
		
	}
	@GetMapping("/or/{fname}/and/{lname}")
	public ResponseEntity<List<Hospital>> name(@PathVariable String fname,@PathVariable String lname)
	{
		List<Hospital> h2=hs.findByFnameOrLname(fname, lname);
		return new ResponseEntity<List<Hospital>> (h2,HttpStatus.OK);
	}
/*	@GetMapping("/age/{l1}/agelim/{l2}")
	public ResponseEntity<List<Hospital>> age(@PathVariable int l1,@PathVariable int l2)
	{
		List<Hospital> hw=hs.findAgeBetween(l1, l2);
		return new ResponseEntity<List<Hospital>> (hw,HttpStatus.OK);
	}*/
//	@GetMapping("/lessthan")
//	public ResponseEntity<List<Hospital>> ageLess(@PathVariable int o1,@PathVariable int o2)
//	{
//		List<Hospital> hn=hs.findByAgeLessThan(o1, o2);
//		return new ResponseEntity<List<Hospital>> (hn,HttpStatus.OK);
//	}
	
	@GetMapping("/name/{fname}")
	public ResponseEntity<List<Hospital>> byName(@PathVariable String fname)
	{
		List<Hospital> hm=hs.getByFname(fname);
		return new ResponseEntity<List<Hospital>> (hm,HttpStatus.OK);
	}
}
