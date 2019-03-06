package socketDemo.test.copy;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args) {
		int port=55533;
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			Socket socket = serverSocket.accept();
			InputStream inputStream = socket.getInputStream();
			int len;
			byte[]bytes=new byte[1024];
			StringBuilder sb=new StringBuilder();
			while((len=inputStream.read(bytes))!=-1){
				sb.append(new String(bytes,0,len,"UTF-8"));
			}
			System.out.println("receive:"+sb.toString());
			inputStream.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
