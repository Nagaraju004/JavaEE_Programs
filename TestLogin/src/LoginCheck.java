


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginCheck() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String uname=request.getParameter("uname");
		 String pword=request.getParameter("pword");
		 System.out.println("testing");
		 
		 LoginDo log=new LoginDo();
	   
		 if(log.check(uname,pword))
		 {
			 HttpSession session=request.getSession();
			 session.setAttribute("username", uname);
			 response.sendRedirect("Success.jsp");
		 }
		 else
		 {
			response.sendRedirect("Fail.jsp"); 
		 }
	}

}
