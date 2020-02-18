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

  public void doPost(HttpServletRequest request, HttpServletResponse response)

    throws ServletException,IOException
{

		

  PrintWriter out = response.getWriter();

  Connection connection = null;

  ResultSet rs;

  response.setContentType("text/html");

  List dataList= new ArrayList(); 

  try {
final String driver="com.mysql.jdbc.Driver";
		final String dbURL="jdbc:mysql://localhost:3306/test";
		final String db="root";
		final String dbpass="";
		
		
		
		Class.forName(driver);  
		 connection=DriverManager.getConnection(  
		dbURL,db,dbpass);  
		String str=request.getAttribute("dataname").toString();	

 String sql="select * from register where name!='" + str + "'";

  Statement s = connection.createStatement();

  s.executeQuery (sql);

  rs = s.getResultSet();

  while (rs.next ()){


  dataList.add(rs.getString("name"));

  dataList.add(rs.getString("pass"));
  
  dataList.add(rs.getInt("age"));

  dataList.add(rs.getString("department"));
  
  dataList.add(rs.getString("address"));

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
  request.setAttribute("data",dataList);


  RequestDispatcher dispatcher = request.getRequestDispatcher("Datapage.jsp");

  if (dispatcher != null){

  dispatcher.forward(request, response);

  } 

  }

}