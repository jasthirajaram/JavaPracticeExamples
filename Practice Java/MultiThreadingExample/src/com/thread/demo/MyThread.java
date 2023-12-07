package com.thread.demo;

public class MyThread extends Thread {
	public void run() {
		System.out.println("Run method executed");
		Thread.currentThread().setPriority(MAX_PRIORITY);
		Thread.yield();
		System.out.println("run method is executed by Thread: "+Thread.currentThread().getName());
	}
	
//	@Override
//	public void start() {
//		System.out.println("In start method");
//		super.start();
//		
//		
//		
//	}
}