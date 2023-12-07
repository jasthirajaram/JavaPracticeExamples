package com.phones.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

	@ExceptionHandler(EnterFullSpecificatiponException.class)
	public ResponseEntity<Error> fullDataException() {
		Error error = new Error(LocalDateTime.now(), 504, "All fields are required",
				"Enter full details to save phone data");
		return new ResponseEntity<Error>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Error> idNotFoundException() {
		Error error = new Error(LocalDateTime.now(), 504, "Id not exists",
				"Enter valid Id to manipulate phone data");
		return new ResponseEntity<Error>(error, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Error> globalException() {
		Error error1 = new Error(LocalDateTime.now(), 504, "Something went wrong", "Please try again");
		return new ResponseEntity<Error>(error1, HttpStatus.NOT_FOUND);
	}
}
