package simple;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String uname=request.getParameter("uname");
		String upass=request.getParameter("pword");
		 System.out.println("db");

	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","3761");
		Statement stmt=con.createStatement(); 	

		PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from form where uname=? and upass=?");
		ps.setString(1,uname);
		ps.setString(2,upass);
 
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			response.sendRedirect("Login/index.jsp");
			return;
		}
		response.sendRedirect("Login/error.jsp");
		return;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();



}

}

}
