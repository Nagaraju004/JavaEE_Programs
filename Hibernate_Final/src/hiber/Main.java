package hiber;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class Main {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.println("Choose operation: 1.Add 2.Update 3.Delete 4.Show 5.Hql 6.Exit");
		int g=sc.nextInt();
		
		 
		switch(g)
		{
		 case 1:
			 System.out.println("Enter the add details:");
				User u = new User();
				System.out.println("enter name:");
				String name=sc.next();
				System.out.println("enter email:");
				String email=sc.next();
				
				u.setId(22);
				u.setName(name);
				u.setEmail(email);
				session.save(u);
				tx.commit();
			 break; 
	 	case 2:
			 System.out.println("Enter delete id:");
			 int id=sc.nextInt();
			 User usr=(User)session.get(User.class, id);
			 session.delete(usr);
		     tx.commit();
			 break;
		 case 3:
			 System.out.println("Enter update Details:");
			 int upid=sc.nextInt();
			 User update=(User)session.get(User.class, upid);
			 System.out.println("enter name to update:");
			 String Name=sc.next();
			 update.setName(Name);	
			 tx.commit();
			 break;  
		 case 4:
			 System.out.println("enter id to get:");
			 int id1=sc.nextInt();
			 User us=(User)session.get(User.class, id1);
			// User us=(User)session.get(User.class, id1);
			 System.out.println(us.getId()+"   "+us.getName()+"   "+us.getEmail());
			 break;
		 case 5:
			 Query qry = session.createQuery("from User p");
          //   session.createSQLQuery("");
				List l =qry.list();
				System.out.println("Total Number Of Records : "+l.size());
				Iterator it = l.iterator();

				while(it.hasNext())
				{
					Object o = (Object)it.next();
					User p = (User)o;
					System.out.println("User id : "+p.getId());
					System.out.println("User Name : "+p.getName());
					System.out.println("User mail : "+p.getEmail());
				}		
		 case 6:

			 System.out.println("Exit");
			 session.close();
			 session.flush();
			 System.exit(0);
			 break;
			
		}
		 
		
		}
		
	}

	 
		
	}


