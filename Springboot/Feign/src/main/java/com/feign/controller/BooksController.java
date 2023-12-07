package com.feign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feign.model.Books;
import com.feign.utility.BookClient;

@RestController
public class BooksController {

	@Autowired
	BookClient bookClient;

	@PostMapping("/save")
	public ResponseEntity<Books> saveBook(@RequestBody Books book) {
		return bookClient.save(book);
	}

	@GetMapping("/getall")
	public ResponseEntity<List<Books>> getAll() {
		return new ResponseEntity<List<Books>>(bookClient.getAll(), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Books> update(@RequestBody Books book) {
		return new ResponseEntity<Books>(bookClient.update(book), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id) {
		return new ResponseEntity<String>(bookClient.deleteById(id), HttpStatus.OK);
	}
}
