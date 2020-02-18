package file;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class File_Switch {
	static Scanner sc=new Scanner(System.in);

	static void writer() throws IOException
	{
		File f=new File("D:\\Eclipse\\Text\\test1.txt");
		File f1=new File("D:\\Eclipse\\Text\\test2.txt");
		FileWriter fw=new FileWriter(f);
		FileWriter fw1=new FileWriter(f1,true);
		fw.write("naga");
		fw.close();
		System.out.println("enter no of strings to added"); 
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			String str=sc.nextLine();
			fw1.write("\n"+str);
			fw1.flush();
			fw1.write(System.lineSeparator());
		}
			
			 fw1.close();
			 
		
	}
	static void operation()
	{
		File f=new File("D:\\Eclipse\\Text\\test3.txt");
		File f1=new File("D:\\Eclipse\\Sample\\src");
		System.out.println(f1.getAbsolutePath());
		
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.length());
		System.out.println(f.isFile());
		System.out.println(f.getName());
		String[] filename=f1.list();
		for(String files:filename)
		{
		System.out.println("files are "+ files);
		}


	}
	static void reader() throws IOException
	{
		File f=new File("D:\\Eclipse\\Text\\test4.txt");
		FileReader fr=new FileReader(f);
		FileReader fr1=new FileReader("D:\\Eclipse\\Text\\test5.txt");
        System.out.println(fr1.read());
        long ch=f.length();
        for(int i=0;i<ch;i++)
        {
        	 System.out.print((char)fr.read());
        }
        fr.close();
        
	}
	public static void main(String[] args) throws IOException {
		while(true)
		{
		  System.out.println("\nEnter the choice to done 1.writer 2.operations 3.reader");
		  int n=sc.nextInt();
		  switch(n)
		  {
		   case 1:
			   writer();
			   break;
		   case 2:
			   operation();
			   break;
		   case 3:
			   reader();
			   break;
		   default
		   :
			   System.out.println("Choose valid one");
			   break;
			 
			
			
		}
		}
	}

}
