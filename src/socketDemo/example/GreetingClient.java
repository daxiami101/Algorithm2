package socketDemo.example;
// 文件名 GreetingClient.java
 
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
 
public class GreetingClient
{
   @SuppressWarnings("unused")
public static void main(String [] args)
   {
      String serverName = args[0];
      int port = Integer.parseInt(args[1]);
      try
      {
         System.out.println("连接到主机：" + serverName + " ，端口号：" + port);
         
         Socket client = new Socket(serverName, port);//连接服务器，名称和端口
         System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
         
         OutputStream outToServer = client.getOutputStream();
         DataOutputStream out = new DataOutputStream(outToServer);
         System.out.println("1");
         //out.writeUTF("Hello from " + client.getLocalSocketAddress());
         InputStream inFromServer = client.getInputStream();
         System.out.println("2");
         DataInputStream in = new DataInputStream(inFromServer);
         System.out.println("3");
         System.out.println("服务器响应： " + in.readUTF());
         client.close();
         System.out.println("4");
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}