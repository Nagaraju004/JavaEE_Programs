package file;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class File_folder {
	public static void main(String[] args) throws IOException {
	  File f=new File("D:\\Sample");
	  FileWriter fw=new FileWriter("D:\\Sample\\get.txt");
      BufferedWriter bw=new BufferedWriter(fw);
      bw.write("Welcome naga!");
      bw.flush();
      bw.close();
	}
}
 