package designPattern.observerTest02;

import java.util.Observable;

import designPattern.observer.Observer;

public class DemoObserver {
	public static void main(String[] args) {
		MySubject sub=new MySubject(5);
		FirstObserver observer=new FirstObserver(sub);
		SecondObserver observer2=new SecondObserver(sub);
		sub.addObserver(new MyObserver() {
			@Override
			public void update(MySubject sub) {
				System.out.println("inner get info :"+sub.getState());
			}
		});
		sub.setState(6);
	}
}
