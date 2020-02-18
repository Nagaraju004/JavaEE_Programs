package test;

import java.io.IOException;
import java.io.*;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.*;
import javax.servlet.*;

public class Get_Data extends HttpServlet {

	private ServletConfig config;

	public void init(ServletConfig config) throws ServletException {

		this.config = config;

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		HttpSession session = req.getSession(true);  
		PrintWriter out = res.getWriter();
		Connection conn;
		ResultSet rs;
		List arr = new ArrayList();
		  if (session != null) {
		       if (session.getAttribute("user") != null) {
		try
		{
			final String driver = "com.mysql.jdbc.Driver";
			final String url = "jdbc:mysql://localhost:3306/servlet";
			final String db = "root";
			final String dbpass = "3761";
			Class.forName(driver);
			conn = DriverManager.getConnection(url, db, dbpass);
			String str = req.getAttribute("re_data").toString();
			String img1 = req.getAttribute("foto").toString();
			
			String st="insert into image(img) values('"+img1+"')";
			PreparedStatement ps=conn.prepareStatement(st);
			ps.executeUpdate();
			String sql = "select * from data where uname!='" + str + "'";
			String sql1 = "select * from image where img='" + img1 + "'";
			Statement s = conn.createStatement();
			ResultSet r=ps.executeQuery(sql1);
			String image="";
			while(r.next())
			{
				image=r.getString("img");
			}
			req.setAttribute("img2",image);
			s.executeQuery(sql);
			rs = s.getResultSet();
			while (rs.next()) {
				arr.add(rs.getString("uname"));
				arr.add(rs.getString("pword"));
				arr.add(rs.getInt("age"));
			}
			rs.close();
			s.close();
		} 
		       
		  
		catch (Exception e) {

			System.out.println("Exception is ;" + e);

		}

		 req.setAttribute("data",arr);
         RequestDispatcher dispatcher = req.getRequestDispatcher("Print.jsp");
		 if (dispatcher != null){

		  dispatcher.forward(req, res);

		  } 

		 }	

}
	
}
}
