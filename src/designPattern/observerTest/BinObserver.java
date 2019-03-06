package designPattern.observerTest;

public class BinObserver extends Observer{

	public BinObserver(Subject subject) {
		this.subject=subject;
		subject.attach(this);
	}
	public void update(){
		System.out.println("bin==="+Integer.toBinaryString(subject.getState()));
	}
}
