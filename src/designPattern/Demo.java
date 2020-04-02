package designPattern;

public class Demo {
	public static void main(String[] args) {
		Message message=new MessageImpl();
		AbstractMessage mes=new Messager(message);
		mes.operate();
	}

}
