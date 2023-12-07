package com.thread.demo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class TryLockDemo extends Thread {
	static ReentrantLock l = new ReentrantLock();

	// String name;
//	TryLockDemo(String name) { 
//		super(name);
//	}
//
	public void run() {
		try {
			if (l.tryLock(10, TimeUnit.SECONDS)) {
				try {
					for (int i = 0; i < 5; i++) {
						System.out.println(Thread.currentThread().getName() + " got the lock");
						Thread.sleep(2500);
					}
				} catch (Exception e) {
				}
				l.unlock();
			} else {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() + " didn't got the lock");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class TryLockExample {
	public static void main(String[] args) {
		TryLockDemo demo1 = new TryLockDemo();
//		TryLockDemo demo2 = new TryLockDemo("Second Thread");

		Thread t = new Thread(demo1, "First Thread");
		Thread t1 = new Thread(demo1, "Second Thread");
		t.start();
		t1.start();
		// demo2.start();
	}
}