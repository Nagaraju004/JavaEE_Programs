

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name=request.getParameter("name");
		  String prop=request.getParameter("pro");
		  
		  int prop1=Integer.parseInt("prop");
		  PrintWriter out=response.getWriter();
		 try {
			 
			Class.forName("com.mysql.jdbc.Driver");
		  
	     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
		 
			
	     PreparedStatement st=conn.prepareStatement("UPDATE jdbc set prop=? where name=?"); 
	     st.setString(1, name);
	     st.setInt(2, prop1);
	     st.executeUpdate();
	     out.println("Record updated Successfully");
	     out.println("<h2>The data was added successfully</h2>");
			out.println("<a href=\"index.html\"><button>index page</button></a>");	

		 }
	     catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
