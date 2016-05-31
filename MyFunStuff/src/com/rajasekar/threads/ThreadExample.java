package com.rajasekar.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public class ThreadExample {

	public static void main(String[] args) throws Exception{
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		//executorService.
		List<Future> listFuture = new ArrayList<Future>();
		for(int i=0;i<3;i++){
			listFuture.add(executorService.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					if(true){
						throw new ArrayIndexOutOfBoundsException();
					}
					return null;
				}
			})
			);
		}
		executorService.shutdown();
		for(int i=0;i<3;i++){
			try{
				Future future = listFuture.get(i);
				future.get();
			}catch (ExecutionException ex) {
				ex.getCause().printStackTrace();
				//throw new Exception();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}

	}

}
