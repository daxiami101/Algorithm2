package designPattern.bridges;

public abstract class AbstractMsg {
	protected MessageFunction sendMethod;

	public AbstractMsg(MessageFunction sendMethod) {
		super();
		this.sendMethod = sendMethod;
	}
	
	public void send(){
		sendMethod.realSend();
	}

}
