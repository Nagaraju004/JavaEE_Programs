package Book;
import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Lib obj1=new Lib();
		Cse obj2=new Cse();
		Ece obj3=new Ece();
		It obj4=new It();
		obj1.lib();
		while(true)
		{
		System.out.println("Enter department code to search CSE-101 ECE-102 IT-103 EXIT-0");
		int get=sc.nextInt();
		switch(get)
		{
		case 101:
			System.out.println("CSE");
			obj2.cse();
			break;
		case 102:
			System.out.println("ECE");
			obj3.ece();
			break;
		case 103:
			System.out.println("IT");
			obj4.it();
			break;
		case 0:
			System.out.println();
		}
	 }
	}

}
