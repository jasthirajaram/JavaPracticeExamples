package com.thread.demo;

public class ThreadMain {
	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);
		System.out.println(Thread.currentThread().getPriority());
		MyThread t = new MyThread();
		System.out.println("The priority of child thread is: " + t.getPriority());
		t.start();
		ThreadMain main = new ThreadMain();
		System.out.println(main.getClass().getClassLoader());
		System.out.println("main executed");
	}
}