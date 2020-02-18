package raga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Add 
{
static ArrayList<String> obj = new ArrayList<String>();
static HashMap<Integer,ArrayList<String>> value = new HashMap<Integer,ArrayList<String>>();

	void add()
	{
		Scanner sc=new Scanner(System.in);
	 //  Add obj=new Add();
	    System.out.println("Enter string to add in a-list");
	    String n=sc.nextLine();
	    obj.add(n);
	    System.out.println("Enter key to add in map");
	    int m=sc.nextInt();
	    value.put(m, obj);
	    
	     
	}
	    
}
