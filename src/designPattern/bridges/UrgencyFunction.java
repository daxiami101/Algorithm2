package designPattern.bridges;

public class UrgencyFunction implements MessageFunction{

	final String LEVEL="�Ӽ���";
	@Override
	public void realSend() {
		System.out.println("����Ϣ"+LEVEL);
	}

}
