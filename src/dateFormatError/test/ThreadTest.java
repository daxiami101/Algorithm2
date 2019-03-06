package dateFormatError.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest {
	public static void main(String[] args) throws Exception {
		ExecutorService es=Executors.newFixedThreadPool(10);
		List<Future<String>>result=new ArrayList<>();
		for(int i=0;i<10;i++){
			result.add(es.submit(new Callable<String>() {
				@Override
				public String call() throws Exception {
					return new Random().nextInt(10)+"";
				}
			}))
			;
		}
		
	}
}
