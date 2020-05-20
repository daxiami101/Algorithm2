package designPattern.bridges.exercise;

public class EmailSend implements MsgSend{

	@Override
	public void send(AbstractMessage message) {
		System.out.println("Email·¢ËÍ£º"+message.getMsg());
	}

	

}
