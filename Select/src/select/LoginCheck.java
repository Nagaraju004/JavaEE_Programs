package select;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginCheck
 */
//@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String uname=request.getParameter("uname");
		 String pword=request.getParameter("pword");
		 System.out.println("testing");
		 
	 
		 if(uname.equals("naga")&&pword.equals("3761"))
		 {
			 System.out.println();
			 try{
				 Class.forName("com.mysql.jdbc.Driver");
				 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","3761");
				 Statement sta=con.createStatement();
				 String query="select * from signup";
				ResultSet rs=sta.executeQuery(query);
				if(rs.next())
				{
					 String fname=rs.getString("firstname");
					 String lname=rs.getString("lastname");
					 int age=rs.getInt("age");
					 String pword1=rs.getString("password");
					 String cpass=rs.getString("confirm_password");
					 
					 System.out.println("firstname: "+fname+"lastname: "+lname+"age: "+age+"password: "+pword1+"confirm password: "+cpass);

				}
				
			}		
			catch(Exception ex)
			{
				System.out.println("Error:" +ex);
				ex.printStackTrace();
			}
			 


		 }
		 else
		 {
			response.sendRedirect("Failure.jsp"); 
		 }
	}

}








