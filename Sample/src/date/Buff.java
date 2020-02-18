package date;
import java.io.*;
public class Buff {
	
	 
	    public static void main (String[] args)throws IOException {
	         BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
	         System.out.println("Enter an integer");
	         int a=Integer.parseInt(s.readLine());
	         System.out.println("Enter an string");
	         String d=s.readLine();
	         System.out.println("The string is"+d+"The integer is"+a);
	        
	     
	}
}
