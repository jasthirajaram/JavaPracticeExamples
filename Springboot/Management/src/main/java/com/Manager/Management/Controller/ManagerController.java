package com.Manager.Management.Controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Manager.Management.Entity.Manager;
import com.Manager.Management.Service.ManagerService;

@RestController
public class ManagerController {
	
	@Autowired
	ManagerService managerService;
	
	private final static Logger log=LogManager.getLogger(ManagerController.class);
	
	@PostMapping("/manager/save")
	public ResponseEntity<Manager> saveEmp(@RequestBody Manager manager) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(managerService.saveEmp(manager));
		
	}
	
	@GetMapping("/manager/get")
	public ResponseEntity<List<Manager>> getAll(){
		log.info("******GetAll*******");
		List<Manager> list = managerService.getAll();
		log.info("*Details {}" ,list);
		log.info("******BY BY GetAll*******");
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	@DeleteMapping("/manager/delete/{id}")
	public ResponseEntity<String> delEmp(@PathVariable int id){
		managerService.delEmp(id);
		return ResponseEntity.status(HttpStatus.OK).body("deleted");
	}
	
	@PutMapping("/manager/update/{id}")
	public ResponseEntity<Manager> updateEmp(@PathVariable int id , @RequestBody Manager manager){
		
		Manager m= managerService.updateEmp(manager, id);
		 
		log.info("update {}",m);
		return ResponseEntity.status(HttpStatus.OK).body(m);
	}
	
	//*******************************************************//
	@GetMapping("/manager/firstname")
	public ResponseEntity<List<Manager>> findByFirstName(@RequestParam String firstName){
		return ResponseEntity.status(HttpStatus.OK).body(managerService.findByFirstName(firstName));
		
	}
	
	@GetMapping("/manager/fullname")
	public ResponseEntity<List<Manager>> findByFirstNameAndLastName(@RequestParam String firstName, @RequestParam String lastName){
		return ResponseEntity.status(HttpStatus.OK).body(managerService.findByFirstNameAndLastName(firstName, lastName));
	}
	
	@GetMapping("/manager/statingwith")
	public ResponseEntity<List<Manager>> findByEmpCodeStartingWith(@RequestParam String empCode){
		return ResponseEntity.status(HttpStatus.OK).body(managerService.findByEmpCodeStartingWith(empCode));
	}
	
	@GetMapping("/manager/endingwith")
	public ResponseEntity<List<Manager>> findByEmpCodeEndingWith(@RequestParam String empCode){
		return ResponseEntity.status(HttpStatus.OK).body(managerService.findByEmpCodeEndingWith(empCode));
	}
	
	@GetMapping("/manager/containing")
	public ResponseEntity<List<Manager>> findByEmpCodeContaining(@RequestParam String empCode){
		return ResponseEntity.status(HttpStatus.OK).body(managerService.findByEmpCodeContaining(empCode));
	}
	
	@GetMapping("/manager/notcontaining")
	public ResponseEntity<List<Manager>> findByEmpCodeNotContaining(@RequestParam String empCode){
		return ResponseEntity.status(HttpStatus.OK).body(managerService.findByEmpCodeNotContaining(empCode));
	}
	
	@GetMapping("/manager/equals")
	public ResponseEntity<List<Manager>> findByEmpCodeEquals(@RequestParam String empCode){
		return ResponseEntity.status(HttpStatus.OK).body(managerService.findByEmpCodeEquals(empCode));
	}
	
	@GetMapping("/manager/notequals")
	public ResponseEntity<List<Manager>> findByEmpCodeNotEquals(@RequestParam String empCode){
		return ResponseEntity.status(HttpStatus.OK).body(managerService.findByEmpCodeNot(empCode));
	}

	@GetMapping("/manager/between")
	public ResponseEntity<List<Manager>> findBySalaryBetween(@RequestParam int start, @RequestParam int end){
		return ResponseEntity.status(HttpStatus.OK).body(managerService.findBySalaryBetween(start, end));
	}
	
	@GetMapping("/manager/like")
	public ResponseEntity<List<Manager>> findByFullNameLike(@RequestParam String fullName){
		return ResponseEntity.status(HttpStatus.OK).body(managerService.findByFullNameLike(fullName));
	}
	
	@GetMapping("/manager/greaterthanequals")
	public ResponseEntity<List<Manager>> findBySalaryGreaterThanEqual(@RequestParam int salary){
		return ResponseEntity.status(HttpStatus.OK).body(managerService.findBySalaryGreaterThanEqual(salary));
	}
	
}
