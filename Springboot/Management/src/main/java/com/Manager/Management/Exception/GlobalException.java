package com.Manager.Management.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(ManagerNotFound.class)
	public ResponseEntity<Error> managerNotFoundException(){
		Error error= new Error(LocalDateTime.now(),404,"manager not found","hello...! user manager not found");
		return new ResponseEntity<Error>(error, HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Error> globalException(){
		Error error1 = new Error(LocalDateTime.now(),404 , "Global Exception", "this is global exception");
		return new ResponseEntity<Error>(error1,HttpStatus.NOT_FOUND);	
	}
}
