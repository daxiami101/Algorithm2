package designPattern.bridges.exercise;

public class ShortMsg extends AbstractMessage{

	public ShortMsg(MsgSend send, String msg) {
		super(send, msg);
	}

	@Override
	public void send() {
		this.setMsg("���ţ�"+this.getMsg());
		super.send();
	}
	
}
