package designPattern.bridges;

public class UrgencyFunction implements MessageFunction{

	final String LEVEL="加急：";
	@Override
	public void realSend() {
		System.out.println("本消息"+LEVEL);
	}

}
