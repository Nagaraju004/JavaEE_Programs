import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import dao.employee;

public class Application {

	public static void main(String[] args) {
		SessionFactory factory =null;
		Session session =null;
	  try {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("dao//Hibernat.cfg.xml").build(); 
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build(); 

		 factory = meta.getSessionFactoryBuilder().build(); 
		 session = factory.openSession(); 
		Transaction t = session.beginTransaction();
		
		employee emp=new employee();
		
		emp.setid(02);
		emp.setname("Naga");
		emp.setage(21);
		emp.setcity("PPM");
		
		System.out.println(session.save(emp));
		
		t.commit();
		factory.close();
		session.close();
		
	  }
	  catch(Exception e)
	  {
		  
		  System.out.println(e);
	  }
	   
		
	}

}
