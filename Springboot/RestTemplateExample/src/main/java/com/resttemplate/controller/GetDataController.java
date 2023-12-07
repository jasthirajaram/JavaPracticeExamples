package com.resttemplate.controller;

import java.util.Collections;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.resttemplate.model.GetBooksData;
import com.resttemplate.model.GetEmployeeData;

@RestController
@RequestMapping("/get")
public class GetDataController {

	RestTemplate restTemplate;

	public GetDataController(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	@GetMapping("/getbooksdata")
	GetBooksData[] getBooksList() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		//HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
		return restTemplate
				.exchange("http://localhost:8080/books/getall", HttpMethod.GET, null, GetBooksData[].class)
				.getBody();
	}

	@PostMapping("/post")
	GetBooksData saveBook(@RequestBody GetBooksData book) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<GetBooksData> httpEntity = new HttpEntity<>(book, httpHeaders); // First req obj
		return restTemplate
				.exchange("http://localhost:8080/books/save", HttpMethod.POST, httpEntity, GetBooksData.class)
				.getBody();
	}

	@PutMapping("/update")
	GetBooksData updateBook(@RequestBody GetBooksData book) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<GetBooksData> httpEntity = new HttpEntity<>(book, httpHeaders); // First req obj
		return restTemplate
				.exchange("http://localhost:8080/books/update", HttpMethod.PUT, httpEntity, GetBooksData.class)
				.getBody();
	}public GetDataController() {
		// TODO Auto-generated constructor stub
	}
	@DeleteMapping("/delete/{id}")
	String deleteBook(@PathVariable int id) {
		restTemplate.delete("http://localhost:8080/books/delete/" + id);
		return "deleted";
	}

	@GetMapping("/getbyfname/{fname}")
	GetEmployeeData[] getEmpByFname(@PathVariable String fname) {
		GetEmployeeData[] response = restTemplate.getForObject("http://localhost:8081/employee/findbyfname/" + fname,
				GetEmployeeData[].class);
		return response;
	}
	
	@GetMapping("/getbylname/{lname}")
	Object[] getEmpByLname(@PathVariable String lname) {
		Object[] response =restTemplate.getForObject("http://localhost:8081/employee/findbylname/" + lname,Object[].class);
		return response;
	}

	@GetMapping("/salaryyoj/{salary}/{yoj}")
	GetEmployeeData[] getEmpBySalAndYoj(@PathVariable double salary, @PathVariable int yoj) {
		GetEmployeeData[] response = restTemplate.getForObject("http://localhost:8081/employee/salaryyoj/"+salary+"/"+yoj,
				GetEmployeeData[].class);
		return response;
	}
}