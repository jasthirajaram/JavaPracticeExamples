package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/con")
public class SecurityController {
	
	@GetMapping("/rajaram")
	public String rajaram() {
		return "User Rajaram is added successfuly";
	}
	
	@GetMapping("/abhilash")
	public String abhi() {
		return "User Abhilash is added successfuly";
	}
	
	@GetMapping("/goutham")
	public String goutham() {
		return "User Goutham is added successfuly";
	}
	
	@GetMapping("/kalyan")
	public String kalyan() {
		return "User Kalyan is added successfuly";
	}
}