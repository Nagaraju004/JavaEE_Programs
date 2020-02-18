package select;

import org.hibernate.*;
import org.hibernate.cfg.*;

 

public class Main extends Table{
	public static void main(String[] args) {
		
	/*	Configuration cfg = new Configuration();
		cfg.configure("hibernat.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Object o=session.load(Table.class,new Integer(3));
		Table s=(Table)o;
		
		System.out.println("Object loaded successfully!!!"+s.getName());
		System.out.println(s.getCity());
		System.out.println(s.getId());
		
		session.close();
		factory.close();
	*/ Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml"); 

	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();	

	Table p=new Table();
	p.setId(1);  // 104 must be in the DB
	p.setName("Someting");		

	Transaction tx = session.beginTransaction();
		session.update(p);
	tx.commit();

	System.out.println("Object Updated successfully.....!!");
	session.close();
	factory.close();
	        
		
		
		
	}
}
