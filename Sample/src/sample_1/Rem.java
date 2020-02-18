package sample_1;
import java.util.Scanner;
public class Rem extends Show_Data
{
 void remove()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter no of index to be delete");
	 int o=sc.nextInt();
	 obj.remove(o);
	 sc.close();
	 System.out.println("After deletion of given index");
	 for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
 }
}
