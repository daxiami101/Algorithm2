package designPattern;

public class MessageImpl implements Message{

	@Override
	public void send() {
		System.out.println("真正的发送消息");
	}

}
