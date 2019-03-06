package test.java.thread.simpleDateFormat;

import java.util.Date;
import java.util.concurrent.Callable;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Callable<Date> callBack=new Callable<Date>(){
			@Override
			public Date call() throws Exception {
				System.out.println("call");
				return null;
			}
		};
	}
}
