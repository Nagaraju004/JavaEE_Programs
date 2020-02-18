import java.io.*;

import java.util.*;

import java.sql.*;

import javax.servlet.*;

import javax.servlet.http.*;


public class DataServlet extends HttpServlet{


	private static final long serialVersionUID = 1L;

private ServletConfig config;

  public void init(ServletConfig config)

  throws ServletException{

 this.config=config;

 }

  public void doPost(HttpServletRequest req, HttpServletResponse res)

    throws ServletException,IOException
{

		

  PrintWriter out = res.getWriter();

  Connection connection = null;

  ResultSet rs;

  res.setContentType("text/html");

  List dataList= new ArrayList(); 

  try {
final String driver="com.mysql.jdbc.Driver";
		final String dbURL="jdbc:mysql://localhost:3306/test";
		final String db="root";
		final String dbpass="3761";
		
		
		
		Class.forName(driver);  
		 connection=DriverManager.getConnection(  
		dbURL,db,dbpass);  
		String str=req.getAttribute("dataname").toString();	

 String sql="select * from register where name!='" + str + "'";

  Statement s = connection.createStatement();

  s.executeQuery (sql);

  rs = s.getResultSet();

  while (rs.next ()){


  dataList.add(rs.getString("name"));

  dataList.add(rs.getString("pass"));
  
  dataList.add(rs.getInt("age"));

  }
  //dataList.remove(0);
  rs.close ();

  s.close ();

  }catch(Exception e){

  System.out.println("Exception is ;"+e);

  }



  //Disptching request
  
 
	// session if exist
	// or create one
  req.setAttribute("data",dataList);


  RequestDispatcher dispatcher = req.getRequestDispatcher("Print.jsp");

  if (dispatcher != null){

  dispatcher.forward(req, res);

  } 

  }

}