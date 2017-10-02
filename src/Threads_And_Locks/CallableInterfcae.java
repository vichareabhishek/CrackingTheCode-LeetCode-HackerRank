package Threads_And_Locks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterfcae implements Callable<String> {

	@Override
	public String call() throws Exception {
		
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}
	
	public static void main(String args[]){
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		List<Future<String>> list = new ArrayList<Future<String>>();
		
		CallableInterfcae obj = new CallableInterfcae();
		
		for(int i=0 ; i<100; i++){
			Future<String> future = executor.submit(obj);
			list.add(future);
		}
		
		for(Future<String> fun: list){
			
			try {
				System.out.println(new Date()+ "::"+fun.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		executor.shutdown();
		
		
	}

}
