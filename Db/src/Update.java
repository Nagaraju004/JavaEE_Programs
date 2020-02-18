

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		  String name=request.getParameter("name");
		  String age=request.getParameter("age");
		  PrintWriter out=response.getWriter();
		 try {
			 
			Class.forName("com.mysql.jdbc.Driver");
		  
	     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
		 
			
	     PreparedStatement st=conn.prepareStatement("UPDATE db_test set username=? where age=?"); 
	     st.setString(1, name);
	     st.setString(2, age);
	     st.executeUpdate();
	     out.println("Record updated Successfully");
		 }
	     catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
