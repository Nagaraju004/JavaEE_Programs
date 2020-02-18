package sample_2;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class File_hand 
{
	public static void main(String args[]) throws IOException
	{
	  Scanner sc=new Scanner(System.in);
      File text=new File("file1.txt");
      if(! text.exists())
      {
    	text.createNewFile();  
      }
      /*boolean name=text.createNewFile();
      if(name)
      {
      System.out.println("file in(true)");
      }
      else
      {
    	  System.out.println("file in false");
      }
      Scanner fileIn = new Scanner(new File('D:\\file.txt'));
      String d=fileIn.nextLine();
      System.out.println(d); */
      /*System.out.println(text.canRead());
      System.out.println(text.canWrite());
  
      System.out.println(text.getAbsolutePath());
      System.out.println(text.isHidden());
      System.out.println(text.list());
     /* String []arr=text.list();
      for(int i=0;i<arr.length;i++)
      {
          System.out.println(arr[i]);
         System.out.println(text.length());
      }  */
       System.out.println("enter the string");
       String str=sc.nextLine();
       
      byte bar[]=str.getBytes();
      FileOutputStream os=new FileOutputStream(text);
      os.write(bar);
      os.flush();
  
      Writer wr=new FileWriter(text);
      BufferedWriter bf=new BufferedWriter(wr);
     // System.out.println("enter the string");
      //str=sc.next();
      bf.write(str);
      if(bf!=null)
      {
    	  bf.close();
      }
     

      // System.out.println(text.delete());


	}
}
