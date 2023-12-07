package com.motivity.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_GATEWAY)
public class UserNameNotAvailableException extends RuntimeException 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2924945464576938519L;
	

}
