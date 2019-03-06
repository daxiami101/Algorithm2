package test.java.thread.forkJoin;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main {
	public static void main(String[] args) {
		FutureTask<String>task=new FutureTask<String>(new Callable<String>() {
			@Override
			public String call() throws Exception {
				Thread.sleep(2000);
				System.out.println("进入调用");
				return "返回";
			}
		});
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(task);
		try {
			System.out.println(task.get(1,TimeUnit.SECONDS));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
