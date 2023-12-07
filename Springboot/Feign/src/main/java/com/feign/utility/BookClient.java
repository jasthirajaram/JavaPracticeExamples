package com.feign.utility;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.feign.model.Books;

@FeignClient(value = "feign", url = "http://localhost:8080/books")
public interface BookClient {
	
	@PostMapping("/save")
	public ResponseEntity<Books> save(@RequestBody Books books);
	
	@GetMapping("/getall")
	List<Books> getAll();
	
	@PutMapping("/update")
	Books update(@RequestBody Books books);

	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id);
}