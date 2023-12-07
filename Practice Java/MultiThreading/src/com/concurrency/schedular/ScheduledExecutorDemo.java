package com.concurrency.schedular;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorDemo {

	public static void main(String[] args) {
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

		ScheduledFuture<?> future=executorService.schedule(new Runnable() {

			@Override
			public void run() {
				System.out.println("task1 running");
			}
		},  2, TimeUnit.SECONDS);

		// schedule a task to run every 5 seconds
		ScheduledFuture<?> future1 = executorService.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				System.out.println("task2 running");

			}
		}, 0, 5, TimeUnit.SECONDS);

		ScheduledFuture<?> future2 = executorService.scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				System.out.println("still running");

			}
		}, 1, 2, TimeUnit.SECONDS);

		// wait for 30 seconds
		try {
			Thread.sleep(30000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		future.cancel(true);
		future1.cancel(true);
		future2.cancel(true);
		executorService.shutdown();

	}

}
