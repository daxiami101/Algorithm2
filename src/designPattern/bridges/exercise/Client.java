package designPattern.bridges.exercise;

public class Client {

	public static void main(String[] args) {
		String msgStr="收到消息请回复！！";
		MsgSend specialSend=new SpecialSend();
		AbstractMessage msg=new CommonMsg(specialSend,msgStr);
		msg.send();
		//-----------------------------------
		msg.setSendImpl(new EmailSend());
		msg.send();
		
		//-----------------------------------
		msg.setSendImpl(new ShortMsgSend());
		msg.send();
		
		//----------------------------------------
		msg=new ShortMsg(specialSend, msgStr);
		msg.setSendImpl(new EmailSend());
		msg.send();
	}
}
