package net;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
public class Reciever {

		public static void main(String[] args) throws IOException {
			 
			try {
				DatagramSocket ds=new DatagramSocket(1131);
				byte[] barr=new byte[32640];
				
				DatagramPacket dp;
				
				while(true) {
					
					dp=new DatagramPacket(barr,barr.length);
					ds.receive(dp);
					String str=new String(barr);
					System.out.println(str);
				}
				
				
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
 
