package socketDemo.test.copy;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	public static void main(String[]args){
		String host="127.0.0.1";
		int port=55533;
		try {
			Socket socket = new Socket(host,port);
			String message="你好！！";
			socket.getOutputStream().write(message.getBytes("UTF-8"));
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
