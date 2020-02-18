package thread;

public class Threads 
{
  static int i;
  static int j;

  public static void looping()
  {
	  for(i=0;i<10;i++)
	  {
			System.out.println(i);  
	  }
	  System.out.println("");  
	  if(j<5)
	  {
		  j++;
	  looping();
	  }
  }
  public static void main(String args[])
  {
	  looping();
	  looping();
  }
}
