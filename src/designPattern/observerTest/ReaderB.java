package designPattern.observerTest;

public class ReaderB implements Observer{

	@Override
	public void update(Subject subject) {
		System.out.println("B收到由客户端发来的变更通知");
	}

}
