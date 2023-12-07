package com.concurrency.executor;

import java.util.concurrent.Executor;

public class ExecutorDemo  implements Executor{

	@Override
	public void execute(Runnable command) 
	{

		command.run();
	}

  
}
