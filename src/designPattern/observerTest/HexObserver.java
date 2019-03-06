package designPattern.observerTest;

public class HexObserver extends Observer{

	public HexObserver(Subject subject) {
		this.subject=subject;
		subject.attach(this);
	}
	public void update(){
		System.out.println("hex:"+Integer.toHexString(subject.getState()));
	}

	
}
