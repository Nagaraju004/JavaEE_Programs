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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public View() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      ResultSet rs;
		      Statement sta;
		      Connection con;
		      List arr=new ArrayList();
		      PrintWriter out=response.getWriter();
		 try
		    {
			 Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
			 sta=con.createStatement();
			 String query="select * from db_test";
			 rs=sta.executeQuery(query);
			 System.out.println("result from database");
			/* while(res.next())
			 {
				 String name=res.getString("username");
				 String pass=res.getString("password");
				 int age=res.getInt("age");
				 System.out.println("USERNAME:"+name+" "+"PASSWORD:"+pass+" "+"AGE:"+age);
				 arr.add(name);
				 arr.add(pass);
				 arr.add(age);
				 
			 } */
			 out.println("<html><body text-align:center>");
			 out.println(); 
			 out.println("<br><br><br>");
			 out.println("<table border=1 width=30% height=30% margin-left:200px>");
			 out.println("<tr><th>Username</th><th>Password</th><th>Age</th><tr>");
			 while (rs.next()) {
			 String na = rs.getString("username");
			 String ps = rs.getString("password");
			 int ag = rs.getInt("age");
			 
			 out.println("<tr><td>" + na + "</td><td>" + ps + "</td><td>" + ag + "</td></tr>"); 
			 }
			 out.println("</table>");
			 out.println("</html></body>");
			 con.close();
			 }
			 
		    
		    catch(Exception ex)
		    {
			   System.out.println("Exception"+ex);
		    }
		 out.println("<a href=\"index.html\"><button>index</button></a>");
	}

}
 