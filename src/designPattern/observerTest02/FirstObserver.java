package designPattern.observerTest02;

public class FirstObserver extends MyObserver{

	
	public FirstObserver(MySubject sub) {
		this.subject=sub;
		this.subject.addObserver(this);
	}

	@Override
	public void update(MySubject sub) {
		System.out.println("first收到通知："+sub.getState());
	}

}
