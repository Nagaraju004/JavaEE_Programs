package hiber;

import org.hibernate.Query;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
		
		Configuration con=new Configuration();
	    con.configure("hibernate.cfg.xml");
	    SessionFactory sf=con.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction t=session.beginTransaction();
	    
	    System.out.println("Choose operation: 1.Add 2.Update 3.Delete 4.Show 6.Exit");
		int g=sc.nextInt();
		
		switch(g)
		{
     		case 1:
     			System.out.println("Enter to add details");
     			Customer c=new Customer();
     			System.out.println("enter name:");
				String name=sc.next();
				System.out.println("enter city:");
				String city=sc.next();
				
				c.setId(1);
				c.setName(name);
				c.setCity(city);
				
				session.save(c);
				t.commit();
			 break;
     		case 2:
     			System.out.println("Enter id to update");
     			int s=sc.nextInt();
     			Customer update=(Customer)session.get(Customer.class, s);
     			System.out.println("Enter name to update");
     			String Name=sc.next();
     			update.setName(Name);
     			
     			t.commit();
     		 break;
     		case 3:
     			System.out.println("Enter id to delete");
     			int i=sc.nextInt();
     			Customer delete=(Customer)session.get(Customer.class,i);
     			session.delete(delete);
     			t.commit();
     		 break;
     		case 4:
     			System.out.println("Enter id to get");
     			int id=sc.nextInt();
     			Customer se=(Customer)session.get(Customer.class,id);
     			System.out.println(se.getId()+""+se.getName()+""+se.getCity());
     		 break;
     		case 5:
     			
     			session.close();
     			session.flush();
     			System.exit(0);
     			break;
     			
		}
	  }
	    
		
	}

}
