package designPattern.momemtoTest;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento>list=new ArrayList<>();
	
	public void add(Memento e){
		list.add(e);
	}
	public Memento get(int index){
		return list.get(index);
	}

}
