package com.Manager.Management.Exception;

public class ManagerNotFound extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ManagerNotFound(String msg)
	{
		super(msg);
	}
}