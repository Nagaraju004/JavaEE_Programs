import java.io.IOException;
import java.io.*;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class View extends HttpServlet {
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
		    String query="select * from jdbc";
			ResultSet rs=sta.executeQuery(query);
			System.out.println("result from database");
			
			out.println("<html><body>");
			out.print("<form><table>");
			out.print("<tr><th>Name</th><th>Property</th><th>country</th></tr>");
			
			while(rs.next())
			{
				String un=rs.getString("name");
				int pr=rs.getInt("prop");
				String co=rs.getString("country");
			
			
			
			out.print("<tr><td>"+ un +"</td><td>"+pr+"</td><td>"+co+"</td></tr>");
	    }
			out.println("</table></form>");
			out.println("</body></html>");
	    }
         catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
	}

}
