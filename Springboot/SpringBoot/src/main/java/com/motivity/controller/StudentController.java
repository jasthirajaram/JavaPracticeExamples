package com.motivity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.motivity.entity.Student;
import com.motivity.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	@Autowired
	private StudentService stdservice;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveEmp(@RequestBody Student std)
	{
		Student st=stdservice.saveStudent(std);
		return new ResponseEntity<Student>(st,HttpStatus.OK);
		
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getById(@PathVariable int id)
	{
		Student st1=stdservice.getById(id);
		return new ResponseEntity<Student>(st1,HttpStatus.OK);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id)
	{
		stdservice.deletebyid(id);
		return new ResponseEntity<String>("deleted successfully",HttpStatus.OK);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getAllDetails()
	{
		List<Student> stv=stdservice.getAll();
		return new ResponseEntity<List<Student>> (stv,HttpStatus.OK);
		
		
	}
	
	@PutMapping("/update/{id}/name/{sname}")
	public ResponseEntity<Student> updateStudent(@PathVariable("sname") String sname,@PathVariable int id)
	{
	
		return new ResponseEntity<Student>(stdservice.updateStudent(sname, id), HttpStatus.OK);
		
	}

	@GetMapping("/custom")
	public ResponseEntity<List<Student>> custommethod1(@RequestParam String sname)
	{
		List<Student> stt=(List<Student>) stdservice.findBysname(sname);
		return new ResponseEntity<List<Student>>(stt,HttpStatus.OK);
		
	}
	
	@GetMapping("/existsById/{id}")
	public ResponseEntity<Boolean> existsById(@PathVariable int id)
	{
		boolean ss=stdservice.existsById(id);
		return new ResponseEntity<Boolean> (ss,HttpStatus.OK);
		
	}
	
	@RequestMapping("/existsBysname/{sname}")
	public ResponseEntity<Boolean> ExistBy(@PathVariable String sname)
	{
		boolean sv=stdservice.existsBysname(sname);
		return new ResponseEntity<Boolean> (sv,HttpStatus.OK);
		
	}
	

	
	
	
	
	
	
}
