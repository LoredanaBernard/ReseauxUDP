package exercice_1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Client {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket s = new DatagramSocket();
			String msg = new String();
			msg="Je suis vivant";
			byte[] data = msg.getBytes();
			InetSocketAddress sa = new InetSocketAddress("localhost", 6789);
			DatagramPacket paquet = new DatagramPacket(data,data.length,sa);	// Creation paquet de données
			s.send(paquet);
			
			msg="Oui je suis";
			byte[] data2 = msg.getBytes();
			DatagramPacket paquet2 = new DatagramPacket(data2,data2.length,sa);	// Creation paquet de données
			s.send(paquet2);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

	}

}
