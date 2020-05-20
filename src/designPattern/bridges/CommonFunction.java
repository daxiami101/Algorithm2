package designPattern.bridges;

public class CommonFunction implements MessageFunction{

	final String LEVEL="普通";
	@Override
	public void realSend() {
		System.out.println("本消息"+LEVEL);
	}

}
