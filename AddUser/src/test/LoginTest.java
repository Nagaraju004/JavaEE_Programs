package test;

import java.io.IOException;

import java.sql.*;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginTest
 */
//@WebServlet("/LoginTest")
public class LoginTest extends HttpServlet {
	 static String name;
	 static String psword;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginTest() {
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
		  
		
		if(uname.equals("naga")&&pword.equals("3761"))
		{
			ArrayList  items=new ArrayList ();  
			int arr=0;
			
			String driver="com.mysql.jdbc.Driver";

			String url="jdbc:mysql://localhost:3306/test";

			String db="root";

			String dbpass="3761";

			try 
			{
				Class.forName(driver);
			 
			 

			Connection con = null;
			Statement sta = null;
			ResultSet rs = null;
			 
				con = DriverManager.getConnection(url,db,dbpass);
				sta=con.createStatement();
			 
		
			String sql ="SELECT * FROM login";
			
			rs=sta.executeQuery(sql);
			int total=rs.getRow();
			int i=0;
			String nextPage = null;

			while(rs.next() && i<=total)
			{
				
				name=rs.getString("username");
				
				 psword=rs.getString("password");
				 
				 System.out.println(name+psword);
				 
				  if(i==0)
				  {
					  name=rs.getString("username");
						
						 psword=rs.getString("password");
				  }
				  if(i==1)
				  {
					  name=rs.getString("username");
						
						 psword=rs.getString("password");
				  }
						 
				  
				  items.add(name);
				  items.add(psword);
			            		
			}
			request.setAttribute("availableData",items);
			
		    nextPage = "Login/Success.jsp";
		    
		    RequestDispatcher rd=request.getRequestDispatcher(nextPage);

		    rd.forward(request, response);
		
			}
			catch (SQLException e) 
			{	 
				e.printStackTrace();
			} 
			catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
 
	    }
		else
		{
			 response.sendRedirect("Login/Failure.jsp");
		}
	}
}

