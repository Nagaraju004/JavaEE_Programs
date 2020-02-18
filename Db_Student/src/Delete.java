

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		 try {
			 String s=request.getParameter("id");
			 int d=Integer.parseInt(s);
			Class.forName("com.mysql.jdbc.Driver");
		  
	     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
		 
			
	     PreparedStatement st=conn.prepareStatement("DELETE FROM db_test2 WHERE id=?"); 
	     st.setInt(1, d);
	     st.executeUpdate();
	     out.println("Record deleted succefully");
	     out.println("<a href=\"index.html\"><button>index</button></a>");
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
