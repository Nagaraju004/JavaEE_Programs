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

 
public class Above extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Above() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			 String query="select * from db_test2 where avg>=50";
			 rs=sta.executeQuery(query);
			 System.out.println("result from database");
			 
			 out.println("<html><body text-align:center>");
			 out.println(); 
			 out.println("<br><br><br>");
			 out.println("<table border=1 width=30% height=30% margin-left:200px>");
			 out.println("<tr><th>Id</th><th>Student Name</th><th>Sub-1</th><th>Sub-2</th><th>Sub-3</th><th>Sub-4</th><th>Sub-5</th><th>Total</th><th>Average</th><tr>");
			 while (rs.next()) {
				 int id = rs.getInt("id");
			     String na = rs.getString("student_name");
			     int m1=rs.getInt("sub_1");
			     int m2=rs.getInt("sub_2");
			     int m3=rs.getInt("sub_3");
			     int m4=rs.getInt("sub_4");
			     int m5=rs.getInt("sub_5");
			     int total=rs.getInt("total");
			     int average=rs.getInt("avg");
			  
			 
			 out.println("<tr><td>" + id+ "</td><td>" + na + "</td><td>" + m1 + "</td><td>" + m2 +"</td><td>" + m3 +"</td><td>" + m4 +"</td><td>" + m5 +"</td><td>" + total +"</td><td>"+average+"</td></tr>"); 
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
 