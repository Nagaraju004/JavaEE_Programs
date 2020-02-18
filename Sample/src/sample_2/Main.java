1package sample_2;
import java.util.Scanner;
public class Main 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  Get obj1=new Get();
	  Show obj2=new Show();
	  Search obj3=new Search();
	  System.out.println("Enter your option 1.get 2.show 3.exit");
	  int get=sc.nextInt();
	  switch(get)
	  {
	  case 1:
		   obj1.get_value();
		    
	  case 2:
           obj2.show_value();
		   System.out.println("Enter no for search");
		   int k=sc.nextInt();
		   if(k==1)
		   {
			   System.out.println("Enter no to find");
			   int t=sc.nextInt();
			   obj3.binary_search(t);
		   }
	  case 3:
		  System.exit(0);
		  break;
	  default:
		  break;
	  }
	  
  }
}
