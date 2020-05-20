package designPattern.bridges;

public class EmailMsg extends AbstractMsg{

	public EmailMsg(MessageFunction sendMethod) {
		super(sendMethod);
	}

	@Override
	public void send() {
		super.send();
	}
}
