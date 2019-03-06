package designPattern.momemtoTest;

public class Demo {
	public static void main(String[] args) {
		Originator originator=new Originator();
		CareTaker careTaker=new CareTaker();
		
		originator.setState(1);
		careTaker.add(originator.saveToMemento());
		
		originator.setState(2);
		careTaker.add(originator.saveToMemento());
		
		originator.setState(3);
		originator.setState(4);
		careTaker.add(originator.saveToMemento());
		
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("1:"+originator.getState());
		
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("2:"+originator.getState());
		
		originator.getStateFromMemento(careTaker.get(2));
		System.out.println("3:"+originator.getState());
	}
}
