package designPattern.observerTest02;

import java.util.ArrayList;
import java.util.List;

public class Subject {
//	private String state;
	
	private List<Observer>observers=new ArrayList<>();
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	public void notifyThem(){
		for(Observer ob:observers){
	}
//			ob.say(this);
//		}
	}
	public void returnInfo(Observer observer){
		System.out.println("observer:"+observer);
	}

}
