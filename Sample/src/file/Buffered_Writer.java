package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import sample_3.Test;

public class Buffered_Writer {
	public static void main(String[] args) throws IOException {
	 File f=new File("D:\\writer.txt");
		FileWriter fw1=new FileWriter(f);
		FileWriter fw=new FileWriter("D:\\write.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		fw1.write("H");
		bw.newLine();
		char[] arr= {'s','n','a','k'};
		bw.write(arr);
		bw.newLine();
		bw.write("naga");
		bw.newLine();
		bw.write("raga");
		bw.newLine();
		bw.flush();
		bw.close();  
		//File fr=new File("t");
	    
	    
		
		 
	}

}
