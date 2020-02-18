package Stack;
import java.util.*;
public class queuee {
	public static void main(String[] args)
	{
	Queue<String> s=new LinkedList<String>();
	 s.offer("naga");
	 s.add("kk");
	 s.add("vj");
	 s.add("raga");
	System.out.println( s.poll());
	 System.out.println(s);
	 System.out.println(s.peek());
	 s.remove("kk");
	 System.out.println(s.peek());
	 System.out.println(s);
	 
	}
}
