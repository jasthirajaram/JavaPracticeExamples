package com.motivity.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.motivity.model.Employee;
import com.motivity.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Employee> save(@RequestBody Employee emp) {
		Employee response = employeeService.saveEmployee(emp);
		return new ResponseEntity<Employee>(response, HttpStatus.OK);
	}

	@RequestMapping(value = "getbyempid/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getbyid(@PathVariable Integer id) throws Exception {
		Optional<Employee> emp = employeeService.getbyEmployeeid(id);
		return new ResponseEntity<Employee>(emp.orElseThrow(() -> new Exception()), HttpStatus.OK);
		// new ExistsByID()), HttpStatus.OK);
		// new UserNotAvailable()), HttpStatus.OK);
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		employeeService.deleteByID(id);
		return new ResponseEntity<String>("deleted successfully====" + id, HttpStatus.OK);
	}

	@RequestMapping(value = "getall", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getall() {
		List<Employee> emplist = employeeService.getAllEmps();
		return new ResponseEntity<List<Employee>>(emplist, HttpStatus.OK);

	}

//	@RequestMapping(value="ExistByName",method = RequestMethod.GET)
//	public boolean ExistBy(@RequestParam String ename){
//	   boolean result= employeeService.ExistByename(ename);
//		return result;
//	}
//	
	@RequestMapping(value = "ExistById", method = RequestMethod.GET)
	public ResponseEntity<Boolean> ExistbyId(@RequestParam Integer id) throws Exception {
		Boolean result = employeeService.Existbyid(id);
		if (result == false) {
			throw new IllegalArgumentException("user not available===" + id);
		}
		return new ResponseEntity<Boolean>(result, HttpStatus.OK);
	}

//	@GetMapping("/empcode")
//	public ResponseEntity<List<Employee>> findByEmpcode(@RequestParam String code){
//		  List<Employee> response=employeeService.findByempcodeStartsWith(code);
//		return new ResponseEntity<List<Employee>>(response, HttpStatus.OK);
//		
//		
//	}
	@GetMapping("/greterthan")
	public ResponseEntity<List<Employee>> findBysalary(@RequestParam Integer salary) {
		List<Employee> res = employeeService.findBysalaryGreaterThan(salary);
		return new ResponseEntity<List<Employee>>(res, HttpStatus.OK);

	}

	@GetMapping("/getallemp")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> list = employeeService.getAllEmp();
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);

	}

	@GetMapping("/searching")
	public ResponseEntity<List<Employee>> SearchempData(@RequestParam String YourInput) {
		List<Employee> ooo = employeeService.searchingEmployeeData(YourInput);
		return new ResponseEntity<List<Employee>>(ooo, HttpStatus.OK);

	}

	@GetMapping("/filterdata")
	public ResponseEntity<List<Employee>> FilterDataOnEmployeeCode(@RequestParam String filtertype,
			@RequestParam String empcode) {
		List<Employee> emplist = employeeService.filterData(filtertype, empcode);
		return new ResponseEntity<List<Employee>>(emplist, HttpStatus.OK);
	}
}