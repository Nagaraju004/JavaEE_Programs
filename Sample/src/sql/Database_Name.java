package sql;

import java.sql.*;

public class Database_Name {
	  private Connection conn;
	  private Statement stat;
	  private ResultSet resu;
      public Database_Name() throws SQLException, ClassNotFoundException
      {
          try
    	  {
    	   Class.forName("com.mysql.jdbc.Driver");
    	   conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
    	   stat=conn.createStatement();
    	   stat.execute("INSERT INTO hotel (name,pass) VALUES ('karthi','2020')");
    	   stat.execute("INSERT INTO hotel (name,pass) VALUES ('sarath','2010')");
    	  } 
    	  catch(Exception e)
    	  {
    		  System.out.println("Exception"+e);
    	  }
    	   
      }
	 public void getData()
	 {
		try
		{
			String query="select *from hotel";
			resu=stat.executeQuery(query);
			System.out.println("Records from database");
			while(resu.next())
			{
				 String name=resu.getString("name");   
				 String pass=resu.getString("pass");
				 System.out.println("Name:"+name+" Pass: "+pass);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
	 }
	
}
