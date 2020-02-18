package io;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
 
public class User extends HttpServlet {
     
    private static final long serialVersionUID = 1L;
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        String id = request.getParameter("id");
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String salary = request.getParameter("salary");
        System.out.println("kjgshbgsa");
        int id1=Integer.parseInt(id);
        int salary1=Integer.parseInt(salary);
 
        HttpSession session = request.getSession(true);
        try {
            UserDAO userDAO = new UserDAO();
            userDAO.addUserDetails(id1,first_name,last_name,salary1);
            response.sendRedirect("Success");
        } catch (Exception e) {
 
            e.printStackTrace();
        }
 
    }
}
