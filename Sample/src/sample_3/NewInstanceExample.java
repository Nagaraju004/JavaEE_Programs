package sample_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 public class NewInstanceExample
{
      
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String name=reader.readLine();
        System.out.println(name);
     }
}
 