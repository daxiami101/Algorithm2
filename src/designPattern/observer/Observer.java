package designPattern.observer;
public abstract class Observer {
	   
	protected Subject subject;//observer关注的subject
	   
	public abstract void update();//观察者各自的业务实现
	
}