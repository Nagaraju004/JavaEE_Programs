package net;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Sender {
	


		public static void main(String[] args) throws IOException {
			 
			Scanner sc = new Scanner(System.in);
			
			DatagramSocket ds=new DatagramSocket();
			
			byte[] barr;
			
			InetAddress ipaddress=InetAddress.getLocalHost();
			ipaddress=InetAddress.getByName("192.168.0.109");
			
			while(true) {
				
				System.out.println("enter String:");
				String str=sc.nextLine();
				
				barr=str.getBytes();
				
				DatagramPacket dp=new DatagramPacket(barr,barr.length,ipaddress,1136);
				
				ds.send(dp);
				
				
				
				
				
			}

		}

	}

