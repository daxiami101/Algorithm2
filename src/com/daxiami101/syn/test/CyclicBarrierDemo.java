package com.daxiami101.syn.test;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		CyclicBarrier cb=new CyclicBarrier(4, new MyMainTask());
		new MySubTask("A", cb).start();
		new MySubTask("B", cb).start();
		new MySubTask("C", cb).start();
		new MySubTask("D", cb).start();
		new MySubTask("E", cb).start();
	}
}
