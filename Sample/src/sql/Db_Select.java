 package sql;
import java.sql.*;
import java.util.Scanner;
public class Db_Select {
  
	 static private Connection con;
	static private Statement sta;
	static private ResultSet res;
	Scanner  sc=new Scanner(System.in); 
		public static void main(String args[]) throws SQLException, ClassNotFoundException
		{
			Db_Select s=new Db_Select();
			try
			{
				 Class.forName("com.mysql.jdbc.Driver");
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
				 sta=con.createStatement();
				 sta.execute("INSERT INTO friends('id','name','age') VALUES ('NULL','sarath','30')");
			}
			catch(Exception ex)
			{
				System.out.println("Exception"+ex);
			}
			s.getdata();
		}
			public void getdata() throws SQLException
			{ 
				    try
				    {
					 String query="select *from friends";
					 res=sta.executeQuery(query);
					 System.out.println("result from database");
					 while(res.next())
					 {
						 String name=res.getString("name");
						 int id=res.getInt("id");
						 String age=res.getString("age");
						 System.out.println("name:"+name+" "+"Age:"+age+" "+"id:"+id);
					 }
					 
				    }
				    catch(Exception ex)
				    {
					   System.out.println("Exception"+ex);
				    }
				  con.close();
			}
		}
 

