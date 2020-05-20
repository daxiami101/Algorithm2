package designPattern.observerTest;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> readers = new ArrayList<>();
	
	public void attach(Observer observer){
		readers.add(observer);
	}
	
	public void detach(Observer observer){
		readers.remove(observer);
	}
	public void notifyObservers(){
		for(Observer ob:readers){
			ob.update(this);
		}
	}
}
