package Book;

import java.util.Scanner;

public class Ece extends Lib {
	void book1()
	{
		System.out.println(ece1);
	}
	void book2()
	{
		System.out.println(ece2);
	}
	void book3()
	{
		System.out.println(ece3);
	}
	void book4()
	{
		System.out.println(ece4);
	}
	void ece()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose your year");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
		  book1();
		  break;
		case 2:
			book2();
			break;
		case 3:
			book3();
			break;
		case 4:
			book4();
			break;
		}
		
	}

}
