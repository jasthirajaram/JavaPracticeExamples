package com.thread.demo;

class YeildDemo extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class ThreadYeildMain {
	public static void main(String[] args) {
		YeildDemo demo = new YeildDemo();
		// demo.setPriority(7);
		demo.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.yield();
		}
	}
}