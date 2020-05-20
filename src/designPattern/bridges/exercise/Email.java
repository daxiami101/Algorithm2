package designPattern.bridges.exercise;

public class Email extends AbstractMessage{

	public Email(MsgSend send, String msg) {
		super(send, msg);
	}

	

}
