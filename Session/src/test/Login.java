package test;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
public class Login extends HttpServlet {
	 
	  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
        PrintWriter out = response.getWriter();
        
        String uname = request.getParameter("name");
        String pword = request.getParameter("pass");
        String image = request.getParameter("foto");
        
        if(Check.test(uname,pword))
        {
        	HttpSession session = request.getSession(true);  
        	session.setAttribute("user", uname);
        	session.setMaxInactiveInterval(120); 
        	request.setAttribute("re_data",uname);
        	request.setAttribute("foto",image);
            RequestDispatcher rd = request.getRequestDispatcher("Get_Data");
            rd.forward(request, response);
        }
        else
        {
           out.println("<div style='"
           		+ "background-color:yellow;"
           		+ "font-size:80px;color:white;'>"
           		+ "<center><h4>Username or Password incorrect</h4></center>"
           		+ "</div>");
           RequestDispatcher rd = request.getRequestDispatcher("index.html");
          
        }
	}

}
