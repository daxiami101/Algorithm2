package designPattern.bridges.exercise;

public class ShortMsgSend implements MsgSend{

	@Override
	public void send(AbstractMessage message) {
		System.out.println("�Ӽ����ͣ�"+message.getMsg());
	}

	

}
