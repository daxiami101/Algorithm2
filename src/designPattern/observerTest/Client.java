package designPattern.observerTest;

public class Client {

	public static void main(String[] args) {
		NewsPaper paper=new NewsPaper("新消息");
		paper.attach(new ReaderA());
//		paper.attach(new ReaderB());
		paper.setContent("最新消息");
	}
}
