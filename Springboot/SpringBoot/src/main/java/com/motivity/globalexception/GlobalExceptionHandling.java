package com.motivity.globalexception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandling {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> globalExceptin(){
		ErrorDetails result=new ErrorDetails(new Date(), 403, "global Exception Handling", "This is from Global Exception");
		return new ResponseEntity<ErrorDetails>(result, HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(UserIDNotAvailable.class)
	public ResponseEntity<ErrorDetails> userIDnot(){
		ErrorDetails result=new ErrorDetails(new Date(), 400, "enter correct user id", "given user id is not available");
		return new ResponseEntity<ErrorDetails>(result, HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(UserNameNotAvailableException.class)
	public ResponseEntity<ErrorDetails> userfname()
	{
	ErrorDetails e=new ErrorDetails(new Date(), 404, "name not found", "the provided name is not found from GE");
	return new ResponseEntity<ErrorDetails>(e,HttpStatus.BAD_REQUEST);
	}
	
}
