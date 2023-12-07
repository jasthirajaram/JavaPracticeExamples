package com.jdk8;
class Man extends Thread {
	public void run() {
		try {
		System.out.println("Man is running");
	}
		catch(Exception e) {
			System.out.println("Throws an exception");
		}	
	}
}
public class MultiThreading {
	public static void main(String []args) {
	Man manObj = new Man();
		for (int i = 0; i <= 5; i++) {
		//Man manObj = new Man();
		manObj.start();
	}
}
}

