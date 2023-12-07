package com.motivity.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.motivity.entity.Student;
import com.motivity.serviceImpl.ServiceImpl;

@Controller
public class StudentController {
	@Autowired
	private ServiceImpl impl;
	
	@PostMapping("/addStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student entity = impl.addStudent(student);
		return new ResponseEntity<Student>(entity,HttpStatus.OK);
	}
	
	@GetMapping("/getById/{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable("studentId") int studentId){
		Student student = impl.getStudent(studentId);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
}
