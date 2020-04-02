package designPattern;

public abstract class AbstractMessage {
	protected Message message;

	public AbstractMessage(Message message) {
		this.message = message;
	}
	
	protected void operate(){
		message.send();
	}
	
}