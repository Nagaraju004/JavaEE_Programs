package sql;
import java.sql.*;

public class Prep_Stat {
   public static void main(String[] args) throws Exception {
      Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
      PreparedStatement updateemp = con.prepareStatement(
         "insert into emp values(?,?,?)");
      
      updateemp.setInt(1,39);
      updateemp.setString(3,"Worker");
      updateemp.setString(2, "sunil");
      updateemp.executeUpdate();
      
      Statement stmt = con.createStatement();
      String query = "select * from emp";
      ResultSet rs =  stmt.executeQuery(query);
      System.out.println("Id   Name    Job");
      
      while (rs.next()) {
         int id = rs.getInt("id");
         String name = rs.getString("name");
         String job = rs.getString("job");
         System.out.println(id + "  " + name+"   "+job);
      }  
      con.close();
   }
}