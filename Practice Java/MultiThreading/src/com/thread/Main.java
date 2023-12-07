package com.thread;

public class Main {
	
	public static void main(String[] args) {
		
		ThreadClass threadClass = new ThreadClass();
		threadClass.setDaemon(true);
		threadClass.start();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("excute main thread");
		}
		
		
	}

}
