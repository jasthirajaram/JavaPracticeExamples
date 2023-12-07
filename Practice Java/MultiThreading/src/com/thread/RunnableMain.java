package com.thread;

public class RunnableMain  extends Thread{
	
	public static void main(String[] args) {
		
		RunnableDemo runnableDemo = new RunnableDemo();
		
		Thread thread = new Thread(runnableDemo);
		thread.start();
		
		
		
		
		for(int i=0; i<10; i++)
		{
			System.out.println("execute my mainRunnable thread");
		}
		
	}

}
