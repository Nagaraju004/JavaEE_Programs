package sql;
import java.sql.*;
import java.util.Scanner;
public class Data_Balance {
    static Connection con;
	static PreparedStatement pst=null;
    static ResultSet res;
    static Scanner sc=new Scanner(System.in);
    
	 void add_column() throws SQLException,ClassNotFoundException
	 {
		 
	  String sql="ALTER TABLE employee_details ADD COLUMN names varchar(20)";
	  
  	  pst=con.prepareStatement(sql);
  	  
  	  pst.executeUpdate(); 
  	  
  	  System.out.println("Successfully added column\n");
  	  
	 }
	 
	 
	 void insert() throws SQLException,ClassNotFoundException
	 {
		 
		 PreparedStatement pst = con.prepareStatement(
		         "insert into employee_details values(?,?,?,?,?,?)");
		 
		System.out.println("Enter id");
		
		int id=sc.nextInt();
		
		System.out.println("Enter name"); 
		
		String name=sc.next();
		
		System.out.println("Enter salary");
		
		int salary=sc.nextInt();
		
		System.out.println("Enter city");
		
		String city=sc.next();
		
		System.out.println("Enter country");
		
		String country=sc.next();
		
		System.out.println("Enter state");
		
		String state=sc.next();
		  
	      pst.setInt(1,id);
	      
	      pst.setString(2,name);
	      
	      pst.setInt(3,salary);
	      
	      pst.setString(4,city);
	      
	      pst.setString(5,state);
	      
	      pst.setString(6,country);
	      
	      pst.executeUpdate();
	      
		  System.out.println("Successfully insert data");
		 
		  
	 }
	 
	 void update() 
	 {
			
			String sql="UPDATE employee_details SET name= ? WHERE id= ?";
			
			try {
				pst=con.prepareStatement(sql);
				
				System.out.println("enter id to update");
				int id=sc.nextInt();
				System.out.println("enter name to update");
				String str=sc.next();
			
				pst.setString(1, str);
				pst.setInt(2, id);
				pst.executeUpdate();
				System.out.println("Successfully record uptaded");
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
			
			
		}
	 
	 void select() 
	 {
		     
		     
		 try
		    {
			 
			 String query="select * from employee_details";
			 
			 Statement stmt=con.createStatement();
			 
			 res=stmt.executeQuery(query);
			 
			 System.out.println("result from database");
			 
			 while(res.next())
			 {
				 
				 int id=res.getInt("id");
				 
				 String name=res.getString("name");
				 
				 int salary=res.getInt("salary");
				 
				 String city=res.getString("city");
				 
				 String state=res.getString("state");
				 
				 String country=res.getString("country");
				 
				 System.out.println("  Id: "+id+"   Name: "+name+"   Salary: "+salary+"   City: "+city+"   State: "+state+"   Country: "+country);
			 }
			 
		    }
		    catch(Exception ex)
		    {
		    	
			   System.out.println("Exception"+ex);
			   
		    }
	 }
	 
     void delete() throws SQLException
	 {			
		 
				String sql2="DELETE FROM employee_details WHERE id= ?";
				
				try {
					
					pst=con.prepareStatement(sql2);
				
				System.out.println("enter id to delete:");
				
				int delete=sc.nextInt();
				
				pst.setInt(1, delete);
				
				pst.executeUpdate();
				
				System.out.println("Successfully record deleted");
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			 
			
	 }
	 
	  void drop_column() throws SQLException,ClassNotFoundException
	 {
		 
	  String sql="ALTER TABLE employee_details DROP names";
	  
  	  pst=con.prepareStatement(sql);
  	  
  	  pst.executeUpdate(); 
  	  
	  System.out.println("Successfully droped column");
  	  
	 }
	 
	  
	 public static void main(String[] args) throws ClassNotFoundException, SQLException
	 {
		 
		
		 Data_Balance db=new Data_Balance();
		 Class.forName("com.mysql.jdbc.Driver");
		 
	     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","3761");
	      
	    /*  System.out.println("Do you want to create table 1.yes 2.no");
	     
	     int ans=sc.nextInt();
	     
	     switch(ans)
	     {
	       case 1:
	    	  
	    	 String sql="CREATE TABLE employee_details(id int,name varchar(20),salary int(5),city varchar(20),state varchar(20),country varchar(20))";
	    	 
	    	 pst=con.prepareStatement(sql);
	    	 
	    	 pst.executeUpdate();
	       case 2:
	    	   break;
	    	 
	     }   */
	     
	     while(true)
	     {
	    	 
	       System.out.println("Choose the operation to perform 1.add-column 2.insert 3.delete 4.update 5.select 6.column-drop");
	       
	       int get=sc.nextInt();
	       
	       switch(get)
	       {
	          case 1:
	        	  System.out.println("This is for add column to the database\n");
	        	  db.add_column();
	        	  break;
	          case 2:
	        	  System.out.println("This is for insert row into the table\n");
	        	  db.insert();
	        	  break;
	          case 3:
	        	  System.out.println("This is for delete row from table\n");
	        	  db.delete();
	        	  break;
	          case 4:
	        	  System.out.println("This is for update in table\n");
	        	  db.update();
	        	  break;
	          case 5:
	        	  System.out.println("This is for select from table\n");
	        	 db.select();
	        	  System.out.println("after");
	        	  break;
	          case 6:
	        	  System.out.println("This is for drop column\n");
	        	  db.drop_column();
	        	  break;
	          default:
	        	  con.close();  
	        	  System.exit(0);
	        	  break;
	        	  
	          
	       }
	     }
	}
}
