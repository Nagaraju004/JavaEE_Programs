package sample_2;

import java.util.Scanner;

public class Get {
	static int[] arr1=new int[10];

	public static void get_value()
	{
				Scanner sc=new Scanner(System.in);
	System.out.println("This is for get value");
	
	for(int i=0;i<10;i++)
	{
		arr1[i]=sc.nextInt();
	}
	for(int i=0;i<10;i++)
	{
		 System.out.println(arr1[i]);
	}
	sc.close();
	}
}
