package designPattern.bridges.exercise;

public class ShortMsgSend implements MsgSend{

	@Override
	public void send(AbstractMessage message) {
		System.out.println("¼Ó¼±·¢ËÍ£º"+message.getMsg());
	}

	

}
