package test.java.thread.Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureTaskTest {
	public static void main(String[] args) {
		FutureTask<Long> future = new FutureTask<Long>(new Callable<Long>(){
	           @Override
	           public Long call() throws Exception {
	              System.out.println("call==========");
	              return 1000L;
	           }
	       });
	       Executors.newSingleThreadExecutor().execute(future);
	       try {
	           System.out.println(future.get());
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       } catch (ExecutionException e) {
	           e.printStackTrace();
	       }
	}
}
