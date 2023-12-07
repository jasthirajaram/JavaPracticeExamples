package com.employee.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	private final static org.apache.logging.log4j.Logger log = LogManager.getLogger(EmployeeController.class);

	// Insert method
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		log.info("DATA SAVED SUCCESSFULLY");
		return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.OK);
	}

	// Get all details by fname
	@GetMapping("/findbyfname/{fname}")
	public ResponseEntity<List<Employee>> findByFname(@PathVariable String fname) {
		log.info("FIND BY NAME IS PRESENT");
		return new ResponseEntity<List<Employee>>(employeeService.findByfname(fname), HttpStatus.OK);
	}
	
	// Get all details by lname
		@GetMapping("/findbylname/{lname}")
		public ResponseEntity<List<Employee>> findByLname(@PathVariable String lname) {
			log.info("FIND BY NAME IS PRESENT");
			return new ResponseEntity<List<Employee>>(employeeService.findBylname(lname), HttpStatus.OK);
		}

	// get by salary and yoj
	@GetMapping("/salaryyoj/{salary}/{yoj}")
	public ResponseEntity<List<Employee>> getBySalaryAndYoj(@PathVariable double salary, @PathVariable int yoj) {
		log.info("DATA RETRIVED BASED ON SALARY AND YOJ");
		List<Employee> emp = employeeService.findBySalaryAndYoj(salary, yoj);
		return new ResponseEntity<List<Employee>>(emp, HttpStatus.OK);
	}
}