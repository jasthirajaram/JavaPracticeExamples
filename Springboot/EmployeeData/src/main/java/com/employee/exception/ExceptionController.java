package com.employee.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Error> userNotFoundException() {
		Error error = new Error(LocalDateTime.now(), 504, "User not found", "Enter valid user details");
		return new ResponseEntity<Error>(error, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(EnterFullDetailsException.class)
	public ResponseEntity<Error> fullDetailsNotFoundException() {
		Error error = new Error(LocalDateTime.now(), 504, "Something went wrong", "Enter full details to save data");
		return new ResponseEntity<Error>(error, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Error> globalException() {
		Error error1 = new Error(LocalDateTime.now(), 504, "Something went wrong", "Please try again");
		return new ResponseEntity<Error>(error1, HttpStatus.NOT_FOUND);
	}
}
