import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args)
	{
		 int r,sum=0,temp;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the no to check palindrome");
 		 int n=sc.nextInt();
 		 temp=n;
 		 while(n>0)
 		 {
 		 	r=n%10;
 		 	n=n/10;
 		 	sum=sum+(r*r*r);
 		 }
 		 if(temp == sum)
 		 {
 		 	System.out.println("The given no is armstrong" + sum);
 		 }
 		 else

 		 {
 		 	System.out.println("The given no is not a armstrong");
 		 }
        			
	}
}