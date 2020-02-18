

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

 
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		List arr = new ArrayList();
		PrintWriter  out = response.getWriter();
		
		 try {
			 String name=request.getParameter("uname");
				String pword=request.getParameter("pass");
				String ages=request.getParameter("age");
				
			Class.forName("com.mysql.jdbc.Driver");
		 
	     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
	     String query = " insert into db_test (username,password,age) values (?, ?, ?)";
	     PreparedStatement st=conn.prepareStatement(query); 
	     st.setString(1,name);
		 st.setString(2,pword);
		 st.setString(3, ages);
		 st.executeUpdate();
	     
	    
	    	 
					 System.out.println("The data was added successfully");
					 System.out.println("USERNAME: "+name+"PASSWORD: "+pword+"AGE: "+ages);
					 out.print("The data added Succefully");
					 out.println("<a href=\"index.html\"><button>index page</button></a>");	
				 
		 }
	    	 
	 		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	}

}
