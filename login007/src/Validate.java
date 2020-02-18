import java.sql.*;

public class Validate
 {
     public static boolean checkUser(String name,String pass) 
     {
      boolean st =false;
      try{


			final String driver="com.mysql.jdbc.Driver";
			final String dbURL="jdbc:mysql://localhost:3306/test";
			final String db="root";
			final String dbpass="";
			
			
			
			Class.forName(driver);  
			  Connection con=DriverManager.getConnection(  
			dbURL,db,dbpass);  
			
	 
	      
         PreparedStatement ps =con.prepareStatement
                             ("select * from register where name=? and pass=?");
         ps.setString(1, name);
         ps.setString(2, pass);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   
}
