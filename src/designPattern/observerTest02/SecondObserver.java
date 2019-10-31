package designPattern.observerTest02;

public class SecondObserver extends MyObserver{

	
	public SecondObserver(MySubject sub) {
		this.subject=sub;
		this.subject.addObserver(this);
	}

	@Override
	public void update(MySubject sub) {
		System.out.println("second收到通知："+sub.getState());
	}

}
