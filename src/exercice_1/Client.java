package exercice_1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Client {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket s = new DatagramSocket();
			byte[] data = args[0].getBytes();
			InetSocketAddress sa = new InetSocketAddress("localhost", 6789);
			DatagramPacket paquet = new DatagramPacket(data,data.length,sa);	// Creation paquet de données
			s.send(paquet);			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

	}

}
