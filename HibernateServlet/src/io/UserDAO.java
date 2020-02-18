package io;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import io.User;

public class UserDAO {

   public void addUserDetails(int id, String first_name, String last_name,
         int salary) {
	   
	   Configuration configuration = new Configuration().configure();

	     
       SessionFactory sessionFactory = configuration.buildSessionFactory();

      
       Session session = sessionFactory.openSession();
	   
       try {
           
           Transaction transaction = session.beginTransaction();
           Employee user = new Employee();
           user.setId(id);
           user.setFirst_name(first_name);
           user.setLast_name(last_name);
    
           user.setSalary(salary);
           
           session.save(user);
           transaction.commit();
           System.out.println("\n\n Details Added \n");

       } catch (HibernateException e) {
           System.out.println(e.getMessage());
        
           System.out.println("error");
       }
       finally {
    	   sessionFactory.close();  
    	   session.close();
       }
        
   }

}
