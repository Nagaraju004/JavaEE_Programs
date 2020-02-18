package select;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ClientProgram { 

	public static void main(String[] args)
	{

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o=session.load(Product.class,new Integer(101));
		Product s=(Product)o;
		// For loading Transaction scope is not necessary...
		System.out.println("Loaded object product name is___"+s.getPname());

		System.out.println("Object Loaded successfully.....!!");
		session.close();
		factory.close();
	}

}
