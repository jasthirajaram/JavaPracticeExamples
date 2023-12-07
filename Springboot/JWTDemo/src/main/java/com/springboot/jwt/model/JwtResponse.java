package com.springboot.jwt.model;

public class JwtResponse {
	private String jwttoken;

	public JwtResponse() {
		super();
	}

	public JwtResponse(String jwttoken) {
		super();
		this.jwttoken = jwttoken;
	}

	public String getJwttoken() {
		return jwttoken;
	}

	public void setJwttoken(String jwttoken) {
		this.jwttoken = jwttoken;
	}
}
