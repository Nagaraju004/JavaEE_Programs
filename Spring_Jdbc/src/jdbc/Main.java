package jdbc;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Main {
	
  public static void main(String[] args) {
	 Resource res=new ClassPathResource("spconfig.xml");
	 BeanFactory factory = new XmlBeanFactory(res);
	 Object obj = factory.getBean("id3");
	 Table t=(Table) obj;
	 
	 
	 
	 while(true)
	 {
		 System.out.println("Choose operation 0.Create 1.Add 2.Update 3.Delete 4.Show 5.Exit ");
		 Scanner sc=new Scanner(System.in);
		 int s=sc.nextInt();
		 switch(s)
		 {
		 
		  case 0:
			  System.out.println("This is for Create table into the table");
			  t.create();
			  break;  
		  case 1:
			  System.out.println("This is for Adding data into the table");
			  t.add();
			  break;
		  case 2:
			  System.out.println("This is for Upadting data into the table");
			  t.update();
			  break;
		  case 3:
			  System.out.println("This is for Deleting data into the table");
			  t.delete();
			  break;
		  case 4:
			  System.out.println("This is for Display data from the table");
			  t.show();
			  break;
		  case 5:
			  System.out.println("Exit");
			  System.exit(0);
			  break;
		 }
	 }
}

}
