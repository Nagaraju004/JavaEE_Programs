

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class Top extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	    String db_url="jdbc:mysql://localhost:3306/java";
	    String db_name="root";
	    String db_pass="3761";
	    try {
	    	
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection(db_url,db_name,db_pass);
			Statement sta=conn.createStatement();
		    String query="select * from jdbc where prop>10000";
			ResultSet rs=sta.executeQuery(query);
			System.out.println("result from database");
			
			out.println("<html><body text-align:center>");
			out.println("<br><br><br>");
			out.println("<table border=1 width=30% height=30% margin-left:200px>");
			out.println("<tr><th>Name</th><th>Country</th><th>Property</th></tr>");
			
			
			while(rs.next())
			{
				String un=rs.getString("name");
				int pr=rs.getInt("prop");
				String co=rs.getString("country");
			
			
			
			out.print("<tr><td>"+ un +"</td><td>"+pr+"</td><td>"+co+"</td></tr>");
	    }
			out.println("<h2>The data was added successfully</h2>");
			out.println("</table></body></html>");
			out.println("<a href=\"index.html\"><button>index page</button></a>");	

		    
	    }
        catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
	}

}
