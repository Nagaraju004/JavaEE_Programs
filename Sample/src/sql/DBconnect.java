package sql;
import java.sql.*;

public class DBconnect {
	private Connection con;
	private Statement kk;
	private ResultSet rs;
	public DBconnect() throws SQLException, ClassNotFoundException
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
			kk=con.createStatement();
			
		}		
		catch(Exception ex)
		{
			System.out.println("Error:" +ex);
		}
	}               
	public void GetData()
	{
	try{
		String query="select*from e2";
		rs=kk.executeQuery(query);
		System.out.println("Records from database");
		while(rs.next())
		{
			String name=rs.getString("name");
			int id=rs.getInt("id");
			String age=rs.getString("age");
			System.out.println("name:"+name+" "+"Age:"+age+" "+"id:"+id);

		}
		
	}catch(Exception ex){
		System.out.println(ex);
		
	}
	}

}
