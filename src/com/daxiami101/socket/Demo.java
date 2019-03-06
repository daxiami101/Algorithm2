package com.daxiami101.socket;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		new Thread(new SpringTask()).start();//stimulate one spring task
		System.out.println("finish");
//		while(true){//show the status of main thread 
//			Thread.sleep(1000);
//			System.out.println("main is alive：name is："+Thread.currentThread().getName());
//		}
	}

}
