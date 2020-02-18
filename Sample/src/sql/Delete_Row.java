package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Delete_Row {

     public static void main(String[] args) throws ClassNotFoundException, SQLException 
	 {
    	 PreparedStatement ps=null;
		 Class.forName("com.mysql.jdbc.Driver");
	     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
	      
	     String delete="DELETE FROM emp WHERE id='76'";
	     ps=conn.prepareStatement(delete);
	     ps.executeUpdate();
	     String query="select *from emp";
	     ResultSet res=ps.executeQuery(query);
	     while(res.next())
	     {
	    	 int id = res.getInt("id");
	         String name = res.getString("name");
	         String job = res.getString("job");
	         System.out.println(id + "  " + name+"   "+job);
	     }
	 }
		
	}


