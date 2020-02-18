package net;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class My_Address {

	public static void main(String[] args) {
		
		try {
			String url="https://www.w3schools.com/htmL/tryit.asp?filename=tryhtml_default";
			URL obj=new URL(url);
			System.out.println(obj.getProtocol());
			System.out.println(obj.getPort());
			System.out.println(obj.getQuery());
			System.out.println(obj.getHost());
			System.out.println(obj.getPath());
		/*	InetAddress my_ip=InetAddress.getLocalHost();
			System.out.println(my_ip.getHostAddress());
			System.out.println(my_ip.getHostName());
			my_ip=InetAddress.getByName("172.217.26.196");
			System.out.println(my_ip.getHostName());
			InetAddress[] myhost=InetAddress.getAllByName("DESKTOP-6SHH78N");
			for(int i=0;i<myhost.length;i++)
			{
				System.out.println(myhost[i]);
			} */
 		} 
	 /*	catch (UnknownHostException e) {
			 
			e.printStackTrace();
		} 
		*/catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
