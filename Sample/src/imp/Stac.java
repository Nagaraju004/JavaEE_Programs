package imp;

import java.util.*;
import java.io.*;

public class Stac {
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
		 while(itr.hasNext()) {
		 int y=stack.pop();
		 System.out.println(y);
		 }
		 

}
}