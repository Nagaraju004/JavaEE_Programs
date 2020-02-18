package sample_2;
import java.util.*;

public class New_Array {
	public static void main(String args[])
	{
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Ant");
		obj.add("ball");
		obj.add("cat");
		obj.add("doll");
		obj.add("elephnat");
		obj.add("friend");
		obj.add("girl");
		obj.add("high");
		obj.add("ice");
		obj.add("joker");
		obj.add("kite");
		obj.remove(2);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	
	}

}
