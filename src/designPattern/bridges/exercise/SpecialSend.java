package designPattern.bridges.exercise;

public class SpecialSend implements MsgSend{

	@Override
	public void send(AbstractMessage message) {
		System.out.println("�Ӽ����ͣ�"+message.getMsg());
	}

	

}
