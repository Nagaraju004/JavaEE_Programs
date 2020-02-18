package sample_1;
import java.util.Scanner;
public class Arr_List 
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 Add ob=new Add();
	 Rem ob2=new Rem();
	 Show_Data ob3=new Show_Data();
	 while(true)
	 {
	 System.out.println("Choose option to perform");
	 int g=sc.nextInt();
	
	 switch(g)
	 {
	 
	 case 1:
		 ob.add();
		 break;
	 case 2:
		ob2.remove();
		break;
	 case 3:
		 ob3.show();
		 break;
	 case 4:
		 System.exit(0);
	 }
	 
	}
 }
	 
}
