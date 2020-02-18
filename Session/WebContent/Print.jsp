<%@page language="java" import="java.util.*" %>
<html>
<head>
<title>Data Printing Page</title>

<script>
function fun(){
	var dateObject = new Date();
	setTimeout(fun1,120000);
}
function fun1(){
	 document.getElementById("out").click();
}
</script>

 <style>
     
header, footer {
    font-size:30px;
    color: white;
    background-color: #d966ff;
    letter-spacing: 6px;
    text-align:center;
}
h1{
	color:white;
}
input {
    width: 100%;
    padding: 12px 20px;
    display: inline-block;
    border: 3px solid #ccc;
    box-sizing: border-box;
    border-radius:25px;
    
}
.button {
    background-color: #4dff4d;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    font-size: 16px;
}
.button:hover {
    opacity: 0.8;
}
.sub 
{
    padding: 250px;
    width: 400px;
    top:100px;  
}
.bo{
  background-color:#ccccff; 
  width:100%;
  height:80%;
}
b{
    color:orange;
    font-size: 25px;
}
table {
    border-collapse: collapse;
    border-spacing: 0;
    width: 100%;
    border: 2px solid black;
}
th, td {
    text-align: left;
    padding: 16px;
}
</style>
</head>
<body onload="fun()" class="bo">

	<header>
		<h2>Data Print Page</h2>	
	</header>
	<center>
		<div class="sub">
			<table>
				<tr>
					<th>Name</th>
					<th>password</th>
					<th>Age</th>
				</tr>
				<%Iterator itr;%>
				<% String img=(String)request.getAttribute("img2"); %>
				<% List data= (List)request.getAttribute("data");
				 

          if (session != null) {
	       if (session.getAttribute("user") != null) {
		    String name = (String) session.getAttribute("user");
		 
           %>
			<h1>
				<%out.print("hai "+name); %>
			</h1>
			<img src="<%=img%>" height:250px; width:250px;>

			<% 	

           for (itr=data.iterator(); itr.hasNext(); )
           {
%>
				<tr>
					<td><%=itr.next()%></td>
					<td><%=itr.next()%></td>
					<td><%=itr.next()%></td>
				</tr>

				<%
}
} 
else{
		response.sendRedirect("index.html");
}
}
%>
</table>
			</br>
			<form action="Logout" method="post">
				<input type="submit" value="Logout" id="out" class="button">
			</form>
		</div>
	</center>
	<footer>
		 @E2 Infosystems
	</footer>
</body>
</html>