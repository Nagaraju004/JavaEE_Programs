package hib;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class Connection extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
	 	PrintWriter out=response.getWriter();
	 	
	 	String name=request.getParameter("username");
	 	String pass=request.getParameter("password");
	 	
	 	User us=new User();
	 	 us.getuserdetails(name, pass);
	}

}
