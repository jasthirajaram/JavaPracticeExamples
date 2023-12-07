package com.motivity.globalexception;

import java.util.Date;


public class ErrorDetails {
 
	Date timestamp;
	int  statuscode;
     String error;
     String message;
     
     
	public ErrorDetails(Date timestamp, int statuscode, String error, String message) {
		super();
		this.timestamp = timestamp;
		this.statuscode = statuscode;
		this.error = error;
		this.message = message;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ErrorDetails [timestamp=" + timestamp + ", statuscode=" + statuscode + ", error=" + error + ", message="
				+ message + "]";
	}     
}
