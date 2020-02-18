package raga;
import java.util.*;
import java.util.Scanner;
 

public class Hash 
{
 public static void main(String args[])
 {   
	 int get;
	 Add ob=new Add();
	 View ob1=new View();
	 Scanner sc=new Scanner(System.in);
	
    while(true)
    {
    	 System.out.println("Choose option to perform");
    	 get=sc.nextInt();
    	switch(get)
    	{
    	case 1:
    		ob.add();
    		break;
    	case  2:
    		ob1.view();
    		break;
    	case 3:
    		System.exit(0);
    		
    	}
    }
   
    
 }

}
