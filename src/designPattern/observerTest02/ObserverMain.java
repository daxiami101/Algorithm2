package designPattern.observerTest02;

public class ObserverMain {
	public static void main(String[] args) {
		Subject sub=new Subject();
//		OctObserver oct=new OctObserver();
//		HexObserver hex=new HexObserver();
//		sub.attach(oct);
//		sub.attach(hex);
//		
		sub.notifyThem();
	}

}
