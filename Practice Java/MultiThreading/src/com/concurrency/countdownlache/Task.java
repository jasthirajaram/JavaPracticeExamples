package com.concurrency.countdownlache;

import java.util.concurrent.CountDownLatch;

public class Task implements Runnable {

	private String name;
	private CountDownLatch latch;

	public Task(String string, CountDownLatch latch) {
		this.name = name;
		this.latch = latch;

	}

	@Override
	public void run() {
		System.out.println(name + "started...");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + "completed...");
		latch.countDown();
	}

}
