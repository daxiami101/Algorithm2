package designPattern.observerTest;

public class ReaderA implements Observer{

	@Override
	public void update(Subject subject) {
		System.out.println("A收到由客户端发来的变更通知");
	}

}
