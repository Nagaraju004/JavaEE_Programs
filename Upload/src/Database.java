import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	String image="";
	String take(String path)
	{
	 
		Connection conn;
		ResultSet rs;
		
		try {
			final String driver = "com.mysql.jdbc.Driver";
			final String url = "jdbc:mysql://localhost:3306/test";
			final String db = "root";
			final String dbpass = "3761";
			System.out.println("sss");
			Class.forName(driver);
			conn = DriverManager.getConnection(url, db, dbpass);
			
			
			String st="insert into db (path) values('"+path+"')";
			PreparedStatement ps=conn.prepareStatement(st);
			ps.executeUpdate();
			String sql1 = "select * from db where path='" + path + "'";
			Statement s = conn.createStatement();
			ResultSet r=ps.executeQuery(sql1);
		
			System.out.println("sss");
			while(r.next())
			{
				image=r.getString("path");
			}
			 System.out.println(image);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return image;

	}
	}

