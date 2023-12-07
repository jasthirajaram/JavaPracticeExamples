package com.concurrency.countdownlache;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String[] args) {

		CountDownLatch latch = new CountDownLatch(3);

		Thread thread = new Thread(new Task("Task1", latch));
		Thread thread2 = new Thread(new Task("Task2", latch));
		Thread thread3 = new Thread(new Task("Task3", latch));

		try 
		{
			latch.await();
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
			

		}

		System.out.println("all tasks have completed...");

	}

}
