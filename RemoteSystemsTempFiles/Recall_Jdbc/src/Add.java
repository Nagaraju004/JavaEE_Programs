

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 


public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Add () {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
	    String p=request.getParameter("pro");

		String coun=request.getParameter("country");
		
		int prop2=Integer.parseInt(p);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	    String db_url="jdbc:mysql://localhost:3306/java";
	    String db_name="root";
	    String db_pass="3761";
	    try {
	    	
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection(db_url,db_name,db_pass);
			String query="INSERT INTO jdbc(name,prop,country) VALUES (?,?,?)";
		    PreparedStatement st=conn.prepareStatement(query); 
			st.setString(1, name);
			st.setInt(2,prop2);
			st.setString(3, coun);
			st.executeUpdate();
			
			
			out.println("<h2>The data was added successfully</h2>");
			out.println("<a href=\"index.html\"><button>index page</button></a>");	
		} 
	    catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
	    
		
		
		
	}

}
