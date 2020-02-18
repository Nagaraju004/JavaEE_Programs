package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_Java2 {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\file.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
	 
	 /*	long ch=f.length();
		for(int i=0;i<ch;i++)
		{
		 System.out.print((char)fr.read());
		}
	 
	    int ch=fr.read();
		while(ch != -1)
		{
			System.out.println((char)ch);
			ch=fr.read();
		}
	*/
		System.out.println(br.read());
	}

}
