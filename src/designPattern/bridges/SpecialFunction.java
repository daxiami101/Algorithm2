package designPattern.bridges;

public class SpecialFunction implements MessageFunction{

	final String LEVEL="机密";
	@Override
	public void realSend() {
		System.out.println("本消息"+LEVEL);
	}

}
