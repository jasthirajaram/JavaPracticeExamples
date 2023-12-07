package com.phones.exceptions;

import java.time.LocalDateTime;

public class Error {

	LocalDateTime timestamp;
	int status;
	String error;
	String message;

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public Error() {
		super();
	}

	public Error(LocalDateTime localDateTime, int status, String error, String message) {
		super();
		this.timestamp = localDateTime;
		this.status = status;
		this.error = error;
		this.message = message;
	}

	@Override
	public String toString() {
		return "Error [timestamp=" + timestamp + ", status=" + status + ", error=" + error + ", message=" + message
				+ "]";
	}
}
