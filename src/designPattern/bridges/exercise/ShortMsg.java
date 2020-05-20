package designPattern.bridges.exercise;

public class ShortMsg extends AbstractMessage{

	public ShortMsg(MsgSend send, String msg) {
		super(send, msg);
	}

	@Override
	public void send() {
		this.setMsg("¶ÌÐÅ£º"+this.getMsg());
		super.send();
	}
	
}
