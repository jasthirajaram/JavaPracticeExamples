package com.concurrency.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	
	public static void executorInvoke()
	{
		Executor executor=new Caller();
		executor.execute(() -> System.out.println("execute executorInvoke"));
			
			
	}
	
	public static void executerServiceInvoke()
	{
		 ExecutorService executorService=Executors.newCachedThreadPool();
		 executorService.submit(()-> System.out.println("execute executerServiceInvoke"));
	}
	public static void main(String[] args)
	{
		
		executorInvoke();
		executerServiceInvoke();
		
	}

}
