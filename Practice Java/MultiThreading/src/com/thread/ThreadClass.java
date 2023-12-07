package com.thread;


public class ThreadClass extends Thread{
	
	
	
	@Override
	public void run() 
	{
		
		for(int i=0; i<1000; i++)
		{
			System.out.println("excute child thread" +i);
			System.out.println("im dameon or not "+Thread.currentThread().isDaemon());
		}
		
	}
	
	
}
