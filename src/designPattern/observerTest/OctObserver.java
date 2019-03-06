package designPattern.observerTest;

public class OctObserver extends Observer{

	public OctObserver(Subject subject) {
		this.subject=subject;
		subject.attach(this);
	}
	public void update(){
		System.out.println("oct:"+Integer.toOctalString(subject.getState()));
	}
}
