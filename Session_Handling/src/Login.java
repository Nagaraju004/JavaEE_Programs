import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Login extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        
        if(Validate.checkUser(name, pass))
        {
        	HttpSession session = request.getSession(true); // reuse existing
			// session if exist
			// or create one
        	session.setAttribute("user", name);
        	session.setMaxInactiveInterval(60); 

        	request.setAttribute("dataname",name);
            RequestDispatcher rs = request.getRequestDispatcher("DataServlet");
            rs.forward(request, response);
        }
        else
        {
           out.println("<div style='background-color:red;width:100%;height:100%;font-size:80px;color:white;'><center><b>Username or Password incorrect</b></center></div>");
           RequestDispatcher rs = request.getRequestDispatcher("index.html");
          // rs.include(request, response);
        }
    }  
}