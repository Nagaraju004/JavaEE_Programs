import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.PreparedStatement;

import java.sql.Connection;

 

public class LoginDo {

	String sql="select * from login where username=? and password=?";
	public boolean check(String username,String password)
	{
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","3761");
			PreparedStatement st=con.prepareStatement(sql); 
			st.setString(1,username);
			st.setString(2,password);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				return true;
			}
			
		}		
		catch(Exception ex)
		{
			System.out.println("Error:" +ex);
			ex.printStackTrace();
		}
		return false;
	}
} 
