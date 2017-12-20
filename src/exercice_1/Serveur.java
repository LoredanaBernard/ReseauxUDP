package exercice_1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Serveur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket s = new DatagramSocket(6789);
			byte[] data = new byte[100];
			DatagramPacket paquet = new DatagramPacket(data, data.length);
			while (true) {
				s.receive(paquet); // Reception du paquet
				String st = new String(paquet.getData(),0,paquet.getLength());
				System.out.println("J'ai reçu : " + st);				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

}
