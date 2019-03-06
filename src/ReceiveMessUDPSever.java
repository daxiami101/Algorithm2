/**
 * 
 */


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;



/**
 * @author ltx
 * @date 2016年8月26日
 * @E_mail lantx@mail.taiji.com.cn
 */
public class ReceiveMessUDPSever{

	private DatagramSocket socket;
	
	DatagramPacket packet = null;
	
	
	public void connect(int port) throws SocketException{
		socket = new DatagramSocket(port);
		socket.setReceiveBufferSize(512);
	}
	
	public void disconnect(){
		socket.close();
	}
	
	public void receive() throws IOException{
		// 默认缓冲区大小，如果设置的缓冲区大小小于客户端发送的数据大小，怎么办？？
		byte[] buf = new byte[2048];
		packet = new DatagramPacket(buf, buf.length);
		socket.receive(packet);
		System.out.println("Received package = " + new String(packet.getData())); 
	}
	
	public static void main(String[] args) {
		ReceiveMessUDPSever server = new ReceiveMessUDPSever();
		try {  
            server.connect(8888);  //连接
            while(true){
            	System.out.println("hello");
            	server.receive();          //接收请求 
            }
            
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
	}
}
