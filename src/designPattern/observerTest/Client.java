package designPattern.observerTest;

public class Client {

	public static void main(String[] args) {
		NewsPaper paper=new NewsPaper("����Ϣ");
		paper.attach(new ReaderA());
//		paper.attach(new ReaderB());
		paper.setContent("������Ϣ");
	}
}
