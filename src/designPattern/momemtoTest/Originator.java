package designPattern.momemtoTest;

public class Originator {
	private int state;

	public Memento saveToMemento(){
		return new Memento(state);
	}
	public void getStateFromMemento(Memento m){
		this.state=m.getState();
	}
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
}
