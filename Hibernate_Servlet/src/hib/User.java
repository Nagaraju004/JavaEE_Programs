package hib;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hib.Student;;

public class User {
	
	
	public void addUser(int id,String name,String city,int salary,String username,String password)
	{
		   Configuration configuration = new Configuration().configure();
	       SessionFactory sessionFactory = configuration.buildSessionFactory();
	       Session session = sessionFactory.openSession();
	       
	       
	       try
	       {
	    	   Transaction transaction = session.beginTransaction();
	    	   
	    	   Student student=new Student();
	    	   student.setId(id);
	           student.setName(name);
	           student.setCity(city);
	           student.setUsername(username);
	           student.setPassword(password);
	    
	           student.setSalary(salary);
	           
	           session.save(student);
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
	public Student getuserdetails(String username , String password)
	   {
		   Configuration configuration = new Configuration().configure();

		     
	       SessionFactory sessionFactory = configuration.buildSessionFactory();

	      
	       Session session = sessionFactory.openSession();
	       
	     
		   

	CriteriaBuilder builder = session.getCriteriaBuilder();

	CriteriaQuery<Student> criteria = builder.createQuery(Student.class);
	Root<Student> root = criteria.from(Student.class);
		criteria.select(root).where(builder.equal(root.get("username"), username));   
		  
		org.hibernate.query.Query<Student> q = session.createQuery(criteria);
		
		Student st = q.getSingleResult();
		
		System.out.println(st.getUsername());
		
		


	if(st!=null ) 
	{
		if(st.getPassword().equals(password)) {
			System.out.println("login Successful");
			 return st;
		}
		else {
			System.out.println("password Error");
			
		}
		
	}
	else {
		System.out.println("user not exist");
	}
	return null;


	   }
	public void update(int id,String password)
	{
		  Configuration configuration = new Configuration().configure();

		     
	       SessionFactory sessionFactory = configuration.buildSessionFactory();

	      
	       Session session = sessionFactory.openSession();
	   
	       try
	       {
	     
		   

	CriteriaBuilder builder = session.getCriteriaBuilder();

	CriteriaQuery<Student> criteria = builder.createQuery(Student.class);
	Root<Student> root = criteria.from(Student.class);
		criteria.select(root).where(builder.equal(root.get("id"), id));   
		  
		org.hibernate.query.Query<Student> q = session.createQuery(criteria);
		
		Student st = q.getSingleResult();
		
		st.setPassword(password);
		session.update(st);
	       }
	       catch(Exception e)
	       {
	    	   System.out.println("Exception is"+e);
	       }
		
	}
	
	  

}
