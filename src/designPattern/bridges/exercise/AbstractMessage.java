package designPattern.bridges.exercise;

public class AbstractMessage {

	protected MsgSend sendImpl;

	protected String msg;
	public AbstractMessage(MsgSend send,String msg) {
		super();
		this.msg = msg;
		this.sendImpl = send;
	}
	public void send(){
		this.sendImpl.send(this);
	}
	public MsgSend getSendImpl() {
		return sendImpl;
	}
	public void setSendImpl(MsgSend sendImpl) {
		this.sendImpl = sendImpl;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
