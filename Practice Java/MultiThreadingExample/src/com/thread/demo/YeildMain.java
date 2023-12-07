package com.thread.demo;

class YeildMethod implements Runnable {
	@Override
	public void run() {
		Thread.yield();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread");
		}
		Thread.yield();
	}
}

class YeildMethod1 implements Runnable {
	@Override
	public void run() {
		for(int i =0; i<=5; i++) {
			System.out.println("Child Thread 2");
		}
	}	
}
public class YeildMain {
	public static void main(String[] args) {
		YeildMethod y = new YeildMethod();
		YeildMethod1 y1 = new YeildMethod1();
		Thread t1 = new Thread(y1);
		Thread t = new Thread(y);
		t.start();
		t1.start();
		for (int i = 1; i<=5;i++) {
			System.out.println("Main Thread");
		}
	}
}