package designPattern.bridges;

public class CommonFunction implements MessageFunction{

	final String LEVEL="��ͨ";
	@Override
	public void realSend() {
		System.out.println("����Ϣ"+LEVEL);
	}

}
