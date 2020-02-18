package Book;

import java.util.Scanner;

public class It extends Lib{
	void book1()
	{
		System.out.println(it1);
	}
	void book2()
	{
		System.out.println(it2);
	}
	void book3()
	{
		System.out.println(it3);
	}
	void book4()
	{
		System.out.println(it4);
	}
	void it() {
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
