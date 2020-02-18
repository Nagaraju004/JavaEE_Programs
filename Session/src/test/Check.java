package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Check {
	public static boolean test(String uname,String pword)
	{
		boolean value=false;
		try
		{
			final String driver="com.mysql.jdbc.Driver";
			final String url="jdbc:mysql://localhost:3306/servlet";
			final String db="root";
			final String dbpass="3761";
			Class.forName(driver);  
			Connection conn=DriverManager.getConnection(url,db,dbpass);  
			PreparedStatement ps =conn.prepareStatement("select * from data where uname=? and pword=?");
            ps.setString(1, uname);
            ps.setString(2, pword);
            ResultSet rs =ps.executeQuery();
            value = rs.next();

		}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
		return value;
		
	}

}
