<%@page import="java.sql.*"%>
<%
String driver="com.mysql.jdbc.Driver";

String url="jdbc:mysql://localhost:3306/test";

String db="root";

String dbpass="3761";

Class.forName(driver);

Connection con = null;
Statement sta = null;
ResultSet rs = null;
%>

<table align="center" border="1px solid grey">

<tr>
	<td><b>username</b></td>
	<td><b>password</b></td>
	 
</tr>

<%
try{ 
con = DriverManager.getConnection(url,db,dbpass);
sta=con.createStatement();
String sql ="SELECT * FROM login";

rs = sta.executeQuery(sql);

while(rs.next()){
%>

<tr>

	<td><%=rs.getString(1) %></td>
	<td><%=rs.getString(2) %></td>

</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>