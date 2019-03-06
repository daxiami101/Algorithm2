package designPattern.observerTest;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private int state;
	private List<Observer>listObservers=new ArrayList<>();
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers(listObservers);
	}

	public void attach(Observer observer) {
		listObservers.add(observer);
	}
	
	private void notifyAllObservers(List<Observer>list){
		for(Observer ob:list){
			ob.update();
		}
	}
}
