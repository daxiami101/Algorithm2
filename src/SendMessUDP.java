/**
 * 
 */


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


/**
 * @author ltx
 * @date 2016年8月24日
 * @E_mail lantx@mail.taiji.com.cn
 */
public class SendMessUDP{

	private DatagramSocket client;
	private DatagramPacket dataPacket;
	private byte sendDataByte[];
	private InetAddress targetAddress;
	
	public SendMessUDP(){
	
		try {
			this.client=new DatagramSocket();
			targetAddress=InetAddress.getByName("127.0.0.1");
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	
	public void sendMessage(String mess){
		try {
			if(mess != null){
				sendDataByte=mess.getBytes("utf-8");
				dataPacket=new DatagramPacket(sendDataByte, sendDataByte.length,
						targetAddress, 8888);
				client.send(dataPacket);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void closeSend(){
		if(client!=null){
			client.close();
		}
	}
	
	public static void main(String[] args) {
		String jsonStr=
				"{\"msgId\":\"0x0B03\",\"isuCode\":\"100600664189\",\"msgNum\":0,\"taxiMeterNum\":\"0901200006\",\"position\":{\"msgId\":\"0x0B03\",\"isuCode\":\"100600664189\",\"vehicleLicense\":\"BN8450\",\"msgNum\":0,\"param\":\"00000000000000000000000000000100000010000000000\",\"vehicleLon\":6975.97062,\"vehicleLat\":2407.87842,\"speed\":0,\"direction\":3,\"time\":\"2011-01-01 09:04:05\",\"mileage\":21514,\"oilMass\":0,\"altitude\":84,\"can\":\"-1,-1,0,-1.000,0,0\",\"overSpeedExtra\":\"\",\"areaOrLineExtra\":\"\",\"roadDriveTimeExtra\":\"\",\"noDriveRoadDriveExtra\":\"\"},\"orgCode\":\"657\",\"comCode\":\"657\",\"icCardCode\":\"110228197910195412\",\"vehicleLicense\":\"BN8450\",\"powerOnTime\":\"2016-08-03 09:04:00\",\"driverExtraCount\":1,\"driverExtraList\":\"11001CFCAD85\",\"nextMeetingTime\":\"2019-02-18 10:00:00\",\"icVehicleLicense\":\"BN8450\",\"cardNo\":\"11001CFCAD85\"}";
		
		SendMessUDP s = new SendMessUDP();
		s.sendMessage(jsonStr);
		s.closeSend();
	}
}
