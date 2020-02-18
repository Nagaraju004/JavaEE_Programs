package Stack;
import java.util.*;
import java.io.*;

public class Test {
	public static void main(String args[])
	{
		 Stack<Integer> stack = new Stack<Integer>();
		 stack.push(3);
		 stack.push(4);
		 stack.push(7);
		 stack.push(1);
		 stack.push(2);
		 stack.push(9);
		 Iterator itr=stack.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 int y=stack.pop();
		 System.out.println(y);
		 Iterator itr2=stack.iterator();
		 while(itr2.hasNext())
		 {
			 System.out.println(itr2.next());
		 }
		 

}
}