

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

		  String id=request.getParameter("s_id");
		   
		  PrintWriter out=response.getWriter();
		 try {
			 
			 String s1=request.getParameter("sub-1");
			 String s2=request.getParameter("sub-2");
			 String s3=request.getParameter("sub-3");
			 String s4=request.getParameter("sub-4");
			 String s5=request.getParameter("sub-5");
			
			 int id1=Integer.parseInt(id);
			 int m1=Integer.parseInt(s1);
			 int m2=Integer.parseInt(s2);
			 int m3=Integer.parseInt(s3);
			 int m4=Integer.parseInt(s4);
			 int m5=Integer.parseInt(s5);
			 int total=m1+m2+m3+m4+m5;
			 int avg=total/5;
			 
			Class.forName("com.mysql.jdbc.Driver");
		  
	     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3761");
		 
			
	     PreparedStatement st=conn.prepareStatement("UPDATE db_test2 set sub_1=?,sub_2=?,sub_3=?,sub_4=?,sub_5=?,total=?,avg=? where id=?"); 
	     
	     st.setInt(1, m1);
	     st.setInt(2, m2);
	     st.setInt(3, m3);
	     st.setInt(4, m4);
	     st.setInt(5, m5);
	     st.setInt(6, total);
	     st.setInt(7, avg);
	     st.setInt(8,id1);
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
