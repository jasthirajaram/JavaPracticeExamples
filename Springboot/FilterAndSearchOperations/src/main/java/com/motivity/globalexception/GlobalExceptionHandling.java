package com.motivity.globalexception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandling {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> globalException(){
		 ErrorDetails result=new ErrorDetails(new Date(), 403, "Execption Handling", "this is from global exception");
		return new ResponseEntity<ErrorDetails>(result,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(UserNotAvailable.class)
	 public ResponseEntity<ErrorDetails> UserNotAvailableExeception(){
		 ErrorDetails errordtls=new ErrorDetails(new Date(), 404, "user not fouund", "user not available with your input");
		return new ResponseEntity<>(errordtls,HttpStatus.BAD_REQUEST);
		 
	 }
	@ExceptionHandler(ExistsByID.class)
	 public ResponseEntity<ErrorDetails> existsById(){
		 ErrorDetails errordtls=new ErrorDetails(new Date(), 404, "ID not fouund", "Exists by id is not Availble");
		return new ResponseEntity<>(errordtls,HttpStatus.BAD_GATEWAY);
		 
	 }


}
