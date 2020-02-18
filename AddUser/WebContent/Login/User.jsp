<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
String username=request.getParameter("uname");

String password=request.getParameter("pword");

 
Connection con = null;
Statement sta = null;
ResultSet rs = null;
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "3761");
Statement st=conn.createStatement();

st.executeUpdate("insert into login(username,password)values('"+username+"','"+password+"')");

String sql ="SELECT * FROM login";
rs = st.executeQuery(sql);

while(rs.next()){
%>

<tr>

<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>

</tr>

<% 
}


}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>