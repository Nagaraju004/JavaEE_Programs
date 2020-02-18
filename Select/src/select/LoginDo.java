package select;


import java.sql.*;


public class LoginDo {
	
	 
	public void check()
	{
		
		try{
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
			 Statement sta=con.createStatement();
			 String query="select * from signup";

			ResultSet rs=sta.executeQuery(query);
			if(rs.next())
			{
				System.out.println("hiii");
			}
			
		}		
		catch(Exception ex)
		{
			System.out.println("Error:" +ex);
			ex.printStackTrace();
		}
		 
	}

}
