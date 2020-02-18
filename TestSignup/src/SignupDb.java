import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SignupDb {
     String sql="INSERT INTO signup (`firstname`, `lastname`, `age`, `password`, `confirm password`) VALUES (?,?,?,?,?)";
	public boolean add(String fname,String lname,String age,String pword,String cpass)
	{
		 
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","3761");
			PreparedStatement st=con.prepareStatement(sql); 
			st.setString(1,fname);
			st.setString(2,lname);
			st.setString(3,age);
			st.setString(4,pword);
			st.setString(5,cpass);

			int rs=st.executeUpdate();
			 
				return true;
			 
			
		}		
		catch(Exception ex)
		{
			System.out.println("Error:" +ex);
			ex.printStackTrace();
		}
		return false;
		 		
		
		
	}
}
