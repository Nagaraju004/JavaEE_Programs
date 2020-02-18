

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
			 String name=request.getParameter("sname");
			 String s1=request.getParameter("sub-1");
			 String s2=request.getParameter("sub-2");
			 String s3=request.getParameter("sub-3");
			 String s4=request.getParameter("sub-4");
			 String s5=request.getParameter("sub-5");
				
			 int m1=Integer.parseInt(s1);
			 int m2=Integer.parseInt(s2);
			 int m3=Integer.parseInt(s3);
			 int m4=Integer.parseInt(s4);
			 int m5=Integer.parseInt(s5);
			 int total=m1+m2+m3+m4+m5;
			 int avg=total/5;
				
			Class.forName("com.mysql.jdbc.Driver");
		 
	     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
	     String query = " insert into db_test2 (student_name,sub_1,sub_2,sub_3,sub_4,sub_5,total,avg) values (?, ?, ?, ?, ?, ?, ?, ?)";
	     PreparedStatement st=conn.prepareStatement(query); 
	     st.setString(1,name);
	     st.setInt(2, m1);
	     st.setInt(3, m2);
	     st.setInt(4, m3);
	     st.setInt(5, m4);
	     st.setInt(6, m5);
	     st.setInt(7, total);
	     st.setInt(8, avg);
		 
		 st.executeUpdate();
	     
	    
	    	 
					 System.out.println("The data was added successfully");
					 
					 out.print("The data added Succefully");
					 out.println("<a href=\"index.html\"><button>index page</button></a>");	
				 
		 }
	    	 
	 		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	}

}
