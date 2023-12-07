package com.motivity.exception;

public class PoliticianNotFound extends RuntimeException {

	private String msg;

	public PoliticianNotFound(String msg) {
		this.msg = msg;
		System.out.println(msg);
	}
	
}
