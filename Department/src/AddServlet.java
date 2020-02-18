

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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
	 
		PrintWriter  out = response.getWriter();
		
		 try {
			 String name1=request.getParameter("fname");
			 String name2=request.getParameter("lname");
			 String age=request.getParameter("age");
			 String dept=request.getParameter("dep");
			 
			 
			 
			 int dep=Integer.parseInt(dept);
			 
			 Class.forName("com.mysql.jdbc.Driver");
		     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
		     
		     String query="INSERT INTO student_details(firstName,lastName,age,department) VALUES (? ,? ,? ,?)";
		     PreparedStatement st=conn.prepareStatement(query); 
		     
		     st.setString(1, name1);
		     st.setString(2, name2);
		     st.setString(3, age);
		     st.setInt(4, dep);
		     
		     st.executeUpdate();
		     
		     System.out.println("The data was added successfully");
			 out.print("The data added Succefully");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception is"+e);
			 e.printStackTrace();
		 }
	}

}
