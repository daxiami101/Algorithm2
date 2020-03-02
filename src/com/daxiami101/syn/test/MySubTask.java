package com.daxiami101.syn.test;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MySubTask extends Thread{

	private String name;
	private CyclicBarrier cb;
	
	public MySubTask(String name, CyclicBarrier cb) {
		super();
		this.name = name;
		this.cb = cb;
	}

	@Override
	public void run() {
		System.out.println("[����"+name+"]"+"��ʼִ��");
		try {
			sleep(new Random().nextInt(4)*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("[����"+name+"]"+"ִ�н���,�ȴ������߳�");
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
