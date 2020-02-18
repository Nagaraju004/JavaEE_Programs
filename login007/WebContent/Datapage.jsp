
<%@page language="java" import="java.util.*" %>
<html>
<head>
<title>Data Page</title>

<script>
function fun(){
	var dateObject = new Date();
	//document.getElementById("vj").innerHTML=dateObject;
	setTimeout(fun1,20000);
	
	

}
function fun1(){
	//alert("hai");
	// window.location="index.html";
	 document.getElementById("out").click();

}


</script>

 <style>
       header, footer {
    
    padding: 10px;
    color: white;
    font-size:20px;
    background-color: orange  ;
    letter-spacing: 6px;
              }


header{
    position: sticky;
}
h1{
	color:white;
}
input {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 3px solid #ccc;
    box-sizing: border-box;
    border-radius:20px;
    
}
b{

    color:orange;
    font-size: 25px;

}
.button {
    background-color: #ffa500;
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




.container {
    padding: 250px;
    width: 400px;
    
    top:100px;
    
    
}
.bo{
  background-color:gray; 
  width:100%;
  height:80%;

}


table {
    border-collapse: collapse;
    border-spacing: 0;
    width: 100%;
    border: 1px solid #ddd;
}

th, td {
    text-align: left;
    padding: 16px;
}

tr:nth-child(even) {
    background-color: #f2f2f2
}
tr:nth-child(odd) {
    background-color:orange;
}
tr:nth-child(1){
	background-color:orangered;
}
th{
	color:white;

}
</style>
</head>
<body onload="fun()" class="bo"> 
 
        <header>
            <center>
             <h1>Data  Page</h1>
           </center >
        </header>
        <center>
         <div class="container">
<table >
<tr>
  <th>Name</th>
  <th>password</th>
   <th>Age</th>
  <th>Department</th>
   <th>Address</th>
  
</tr> 
<%Iterator itr;%>
<% List data= (List)request.getAttribute("data");

if (session != null) {
	if (session.getAttribute("user") != null) {
		String name = (String) session.getAttribute("user");
		//out.print("hai <h1> " + name + "</h1>!!");
%>
<h1><%out.print("hai  "+name+"!!"); %></h1>

<% 	

for (itr=data.iterator(); itr.hasNext(); )
{
	
	
%>
<tr>

	<td><%=itr.next()%></td>
	<td><%=itr.next()%></td>
	<td><%=itr.next()%></td>
	<td><%=itr.next()%></td>
	<td><%=itr.next()%></td>
	

</tr>

<%
}
} else {
		response.sendRedirect("index.html");
	}
}%>
</table>
 </br>
	</br>
	<form action="Logout" method="post">
		<input type="submit" value="Logout" id="out" class="button">
	</form>     </div></center>
	 <footer>
        <marquee>
            <center>
                <p>&copy;vijay </p>
            </center>
        </marquee>

    </footer>  
</body>
</html>