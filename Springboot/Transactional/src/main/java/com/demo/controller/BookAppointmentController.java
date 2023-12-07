package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.AppointmentFormDto;
import com.demo.service.BookAppointmentService;

@RestController
@RequestMapping("/con")
public class BookAppointmentController {
	
	@Autowired
	private BookAppointmentService bookAppointmentService;
	
	@PostMapping("/save")
	public String bookAppointment(@RequestBody AppointmentFormDto appointmentFormDto) {
		return bookAppointmentService.bookAppointment(appointmentFormDto);
	}
}