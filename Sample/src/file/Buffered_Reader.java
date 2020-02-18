package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffered_Reader {
	public static void main(String[] args) throws IOException {
		 
	FileReader fr1=new FileReader("D:\\Eclipse\\Text\\test.txt");
	BufferedReader br=new BufferedReader(fr1);
	String line=br.readLine();
	while(line !=null)
	{
		System.out.println(line);
		line=br.readLine();
	}
	br.close();
	
	
}
}
