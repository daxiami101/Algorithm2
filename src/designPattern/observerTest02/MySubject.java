package designPattern.observerTest02;

import java.util.ArrayList;
import java.util.List;

public class MySubject {
	private List<MyObserver>observers=new ArrayList<>();
	private int state;

	public MySubject(int state) {
		super();
		this.state = state;
	}
	private void publishInfo(MySubject sub){
		for(MyObserver ob:observers){
			ob.update(sub);
		}
	}
	public void addObserver(MyObserver observer){
		observers.add(observer);
	}
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		publishInfo(this);
	}
	
}
