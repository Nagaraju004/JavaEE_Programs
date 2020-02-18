package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_writer {
	public static void main(String[] args) throws IOException {
		       PrintWriter pw=new PrintWriter("D:\\Eclipse\\Text\\print.txt");
		       BufferedReader br=new BufferedReader(new FileReader("D:\\Eclipse\\Text\\write.txt"));
		       BufferedReader br1=new BufferedReader(new FileReader("D:\\Eclipse\\Text\\writer.txt"));
		       String naga=br.readLine();
		       String naga1=br1.readLine();
		       while (naga != null)
		       {
		    	    pw.println(naga);
		    	    naga=br.readLine();
		       }
		       while (naga1 != null)
		       {
		    	    pw.println(naga1);
		    	    naga1=br1.readLine();
		       }
		       pw.flush();
		       br.close();
		       br1.close();
		       pw.close();
	}

}
