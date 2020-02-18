package file;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class File_Java {
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		 try
		 {
		File f=new File("D:\\file1.txt");
 
		 FileWriter fw=new FileWriter(f,true);
		//FileWriter fw1=new FileWriter(f);
		// fw1.write("hi hello \n");
		 f.delete();
		 if(!f.exists())
		 {
			 f.createNewFile();
		 }
	 	 System.out.println("enter no of strings to added");
		 
		int n=sc.nextInt();
			for(int i=0;i<=n;i++)
			{
				String str=sc.nextLine();
			    fw.write("\n"+str);
			    fw.flush();
			    fw.write(System.lineSeparator());
			}
			
			 fw.close();
			 
		   
		 }		
		 catch(Exception e)
		 {
			 System.out.println("Exception");
		 }
		 
		/*try {
			File f=new File("sample.txt");
			System.out.println(f.exists());
			f.createNewFile();
		} catch (IOException e) {
 			e.printStackTrace();
		} */
 		
		 
		/*if(f.exists())
		{
			System.out.println("Already exists");
		}
		else
		{
		
		} */
		
		/*String[] filename=f.list();
		for(String files:filename)
		{
		System.out.println("files are "+ files);
		}
		*/
		
		/*if(f.isFile())
		{
		System.out.println("yes its file");
		}
		else
		{
			System.out.println("not a file");
		}
		 */
		
		/*
		
		*/
		/*String[] filename=f.list();
		for(String name:filename)
		{
			File n=new File(f,name);
			if(n.isFile())
			{
				System.out.println(name);
			}
			else
			{
				System.out.println("nothing");
			}
		}
		*/
	}

}
