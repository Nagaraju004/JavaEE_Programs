package hib;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hib.User;

 
public class Client extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Client() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 

        String id1 = request.getParameter("id");
        String name = request.getParameter("name");
        String city = request.getParameter("city");
        String salary1 = request.getParameter("salary");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println("kjgshbgsa");
        int id=Integer.parseInt(id1);
        int salary=Integer.parseInt(salary1);
 
        HttpSession session = request.getSession(true);
        try {
            User user  = new User();
            user.addUser(id,name,city,salary,username,password);
            response.sendRedirect("Success");
        } catch (Exception e) {
 
            e.printStackTrace();
        }
	 
	}   

}
