package maths;
import java.util.Scanner;
public class Inclusion {
 	static Scanner sc=new Scanner(System.in);
 	static int lcm(int g,int h,int y)
 	{
 		int lcm;
 		int mod_mn;
 		lcm=(g>h)?g:h;
 		while(true)
 		{
 			if(lcm%g==0 && lcm%h==0)
 			{
 				System.out.println("LCM of this to is"+lcm);
 				mod_mn=y/lcm;
 				return mod_mn;
 			}
 			++lcm;
 		}
		   
 		
 	}
 	static int lcm(int g,int h,int i,int y)
 	{
 		int lcm;
 		int mod_mn;
 		lcm=(g>h)?g:h;
 		while(true)
 		{
 			if(lcm%g==0 && lcm%h==0)
 			{
 				System.out.println("LCM of this to is"+lcm);
 				mod_mn=y/lcm;
 				return mod_mn;
 			}
 			++lcm;
 		}
		   
 		
 	}

	static void test_1(int x,int y)
	{
		System.out.println("Enter two numbers to find divisible property");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("Formulae for 2var to find Inclusion is");
		System.out.println("|AUB|={|A|+|B|} - {|A&B|}");
		int ans=0;
		int mod_mn=0;
	    int mod_u=y;
	    if(m%2==0 && n%2==0)
	    {
	     	mod_mn=lcm(m,n,y);
	    }
	    else
	    {          
	    mod_mn=y/(m*n);
	    } 
	    ans=(((y/m)+(y/n))-mod_mn);
	    System.out.println("Inclusion for this "+ans);
	    int exc=y-ans;
	    System.out.println("Exclusion for this "+exc);
	}
	static void test_2(int x,int y)
	{
		System.out.println("Enter three numbers to find divisible property");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int o=sc.nextInt();
		System.out.println("Formulae for 2var to find Inclusion is");
		System.out.println("|AUB|={|A|+|B|+|c|} - {|A&B|+|A&C|+|B&C|}+{|A&B&C|}");
		int ans=0;
		int mod_mn=0;
	    int mod_u=y;
	    if(m%2==0 && n%2==0 && o%2==0)
	    {
	     	mod_mn=lcm(m,n,o,y);
	    }
	    else
	    {          
	    mod_mn=y/(m*n);
	    } 
	    ans=(((y/m)+(y/n))-mod_mn);
	    System.out.println("Inclusion for this "+ans);
	    int exc=y-ans;
	    System.out.println("Exclusion for this "+exc);
	}

	public static void main(String[] args) {
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("This is for inclusion and exclusion");
		System.out.println("Enter two no to find not divisible");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the no to find by divisible");
		int c=sc.nextInt();
		int d=sc.nextInt();
		int mod_u=b;
		int mod_cd=(((b/c)+(b/d))-(b/(c*d)));
		System.out.println("Inclusion "+mod_cd);
		int mod_1cd=b-mod_cd;
		System.out.println("Exclusion "+mod_1cd);
	*/
		
     	System.out.println("This is for inclusion and exclusion");
		System.out.println("Enter two no n umber for intermediate");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Choose no of variables 1->2var or 2->3var");
		int get=sc.nextInt();
		switch(get)
		{
		case 1:
			test_1(a,b);
			break;
		case 2:
			test_2(a,b);
			break;
		default:
			System.out.println("Choose correct one");
			System.exit(0);
			
		}
     	

	}
}
