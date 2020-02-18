package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 
public class Insert_Row {
	 
	  
 public static void main(String[] args) throws ClassNotFoundException, SQLException 
 {
	 Class.forName("com.mysql.jdbc.Driver");
     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
     Statement sta=conn.createStatement();
     sta.execute("INSERT INTO emp(id,name,job)VALUES('3','naga','Manager')");
     String query="select *from emp";
     ResultSet res=sta.executeQuery(query);
     while(res.next())
     {
    	 int id = res.getInt("id");
         String name = res.getString("name");
         String job = res.getString("job");
         System.out.println(id + "  " + name+"   "+job);
     }
 }
	
}
