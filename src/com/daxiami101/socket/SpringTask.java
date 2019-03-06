package com.daxiami101.socket;

public class SpringTask implements Runnable{

	@Override
	public void run() {
		try {
			while(true){
				Thread.sleep(1000);
				System.out.println("timer----spring");
				Thread.currentThread().setName("spring task");
				System.out.println("spring thread name is:"+Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			System.out.println("spring ----timer stop");
		}
		
	}

}
