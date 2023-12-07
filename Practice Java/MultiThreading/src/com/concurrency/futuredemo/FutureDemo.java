package com.concurrency.futuredemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureDemo {

	public static void main(String[] args) {
		
			ExecutorService executorService= Executors.newSingleThreadExecutor();
			
			
			
			Future<String> future =executorService.submit(()-> {
				Thread.sleep(10000);
				return "completed";
			});
			
			try 
			{
				while(!future.isDone())
				{
					System.out.println("task still in progress");
					Thread.sleep(500);
				}
			
			
			System.out.println("task completed");
			String result = future.get(3000, TimeUnit.MILLISECONDS);
			System.out.println(result);
			executorService.shutdown();
			} catch (InterruptedException | ExecutionException | TimeoutException e)
			{
				future.cancel(true);
				future.isDone();
				future.isCancelled();
				
			}
					
	}

}
