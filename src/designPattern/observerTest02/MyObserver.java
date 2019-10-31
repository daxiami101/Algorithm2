package designPattern.observerTest02;

public abstract class MyObserver {

	public abstract void update(MySubject sub);
	
	protected MySubject subject;
}
