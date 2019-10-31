package com.daxiami101.jvm.volatileTest;

public class RecordExample {
	int a=0;
	boolean flag=false;
	
	public synchronized void writer(){
		System.out.println("writer");
		a=1;//1
		flag=true;//2
	}
	
	public synchronized void reader(){
		System.out.println("reader");
		if(flag){//3
			System.out.println("rewrite i");
			int i=a*a;//4
		}
	}
	public static void main(String[] args) {
		RecordExample example=new RecordExample();
		new Thread(new Runnable() {
			@Override
			public void run() {
				example.writer();
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				example.reader();
			}
		}).start();
		
	}

}
