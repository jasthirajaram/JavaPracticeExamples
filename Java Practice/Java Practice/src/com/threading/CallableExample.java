package com.threading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		// CallableExample ce = new CallableExample() ;
		Random random = new Random();
		Integer randomNo = random.nextInt(1000);
		Thread.sleep(500);
		return randomNo;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<Integer> f = es.submit(new CallableExample());
		System.out.println(f.get());
	}

}
