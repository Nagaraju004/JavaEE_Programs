

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

/**
 * Servlet implementation class AddServlet
 */
//@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		 
		//String id=request.getParameter("uname");
		String name=request.getParameter("pass");
		String age=request.getParameter("age");
	//	int id2=Integer.parseInt(id);
		
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		 
	     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
	     Statement sta=conn.createStatement();
	     sta.execute("INSERT INTO employee(name,job)VALUES('name','job')");
	     String query="select *from employee";
	     ResultSet res=sta.executeQuery(query);
	     while(res.next())
	     {
	    	// int id1 = res.getInt("id");
	         String uname = res.getString("name");
	         String ages = res.getString("age");
	         out.println(uname+"   "+ages);
	         out.println("<br>"); 
	        		
	     }
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
