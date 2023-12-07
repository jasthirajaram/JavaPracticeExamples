package com.motivity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.motivity.entity.Manager;
import com.motivity.entity.Student;
import com.motivity.globalexception.UserIDNotAvailable;
import com.motivity.globalexception.UserNameNotAvailableException;
import com.motivity.service.MangerService;

@RestController
@RequestMapping("/mgr")
public class ManagerController 
{
	@Autowired
	private MangerService ms;
	
	@PostMapping("/save")
	public ResponseEntity<Manager> save(@RequestBody Manager m)
	{
		Manager mm=ms.saveManager(m);
		return new ResponseEntity<Manager> (mm,HttpStatus.OK);	
	}
	
	@GetMapping("/name/{fname}/last/{lname}")
	public ResponseEntity<List<Manager>> findByNames(@PathVariable String fname,@PathVariable String lname)
	{
		List<Manager> m2=ms.findByFnameAndLname(fname, lname);
		return new ResponseEntity<List<Manager>>(m2,HttpStatus.OK);
	}
	@GetMapping("/human{age}")
	public ResponseEntity<List<Manager>> agegreater(@RequestParam int age)
	{
		List<Manager> m3=ms.findByAgeGreaterThan(age);
		return new ResponseEntity<List<Manager>>(m3,HttpStatus.OK);
	}
	
	@GetMapping("/hm/{age}")
	public ResponseEntity<List<Manager>> ageEquals(@RequestParam int age)
	{
		List<Manager> mw=ms.findByAgeEquals(age);
		return new ResponseEntity<List<Manager>>(mw,HttpStatus.OK);
	}
	@GetMapping("/codes")
	public ResponseEntity<List<Manager>> empCode(@RequestParam String empcode)
	{
		List<Manager> mk=ms.findByempcode(empcode);
		return new ResponseEntity<List<Manager>>(mk,HttpStatus.OK);
	}
	@GetMapping("/com")
	public ResponseEntity<List<Manager>> empstarts(@RequestParam String empcode)
	{
		List<Manager> mv=ms.findByempcodeStartsWith(empcode);
		return new ResponseEntity<List<Manager>>(mv,HttpStatus.OK);
	}
	@GetMapping("/cc")
	public ResponseEntity<List<Manager>> empends(@RequestParam String empcode)
	{
		List<Manager> mvv=ms.findByempcodeEndsWith(empcode);
		return new ResponseEntity<List<Manager>>(mvv,HttpStatus.OK);
	}
	@GetMapping("/equals")
	public ResponseEntity<List<Manager>> empequall(@RequestParam String empcode)
	{
		List<Manager> mvw=ms.findByempcodeEquals(empcode);
		return new ResponseEntity<List<Manager>>(mvw,HttpStatus.OK);
	}
	@GetMapping("/sv")
	public ResponseEntity<List<Manager>> empnotequal(@RequestParam String empcode)
	{
		List<Manager> vw=ms.findByempcodeIsNot(empcode);
		return new ResponseEntity<List<Manager>>(vw,HttpStatus.OK);
	}
	@GetMapping("/msv/{sal1}/vv/{sal2}")
	public ResponseEntity<List<Manager>> salary(@PathVariable double sal1,@PathVariable double sal2)
	{
		List<Manager> mvw=ms.findBysalBetween(sal1, sal2);
		return new ResponseEntity<List<Manager>>(mvw,HttpStatus.OK);
	}
	@GetMapping("/full/{fullName}")
	public ResponseEntity<List<Manager>> empName(@PathVariable String fullName)
	{
		List<Manager> w=ms.findByfullNameLike(fullName);
		return new ResponseEntity<List<Manager>>(w,HttpStatus.OK);
	}
	@GetMapping("/con/{empcode}")
	public ResponseEntity<List<Manager>> containing(@PathVariable String empcode)
	{
		List<Manager> v=ms.findByempcodeContains(empcode);
		return new ResponseEntity<List<Manager>>(v,HttpStatus.OK);
	}
	@GetMapping("/bmw/{empcode}")
	public ResponseEntity<List<Manager>> conn(@PathVariable String empcode)
	{
		List<Manager> n=ms.findByempcodeNotContains(empcode);
		return new ResponseEntity<List<Manager>>(n,HttpStatus.OK);
	}
	
	@GetMapping("/wr/{age}")
	public ResponseEntity<List<Manager>> cm(@PathVariable int age)
	{
		List<Manager> m=ms.findByAgeGreaterThanEqual(age);
		return new ResponseEntity<List<Manager>>(m,HttpStatus.OK);
	}
	
	@GetMapping("/gett/{id}")
	public ResponseEntity<Manager> getById(@PathVariable int id)
	{
		Optional<Manager> st1=ms.getById(id);
		return new ResponseEntity<Manager>(st1.orElseThrow(()->new UserIDNotAvailable()),HttpStatus.OK);
	}
	@GetMapping("/findnamee/{fname}")
	public ResponseEntity<Manager> name(@PathVariable String fname)
	{
		return new ResponseEntity<Manager>(ms.findByFname(fname), HttpStatus.OK);
		
		
	}

}
