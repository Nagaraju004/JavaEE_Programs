<%@ page isErrorPage="true" %>  
<html>  
<body>  
<%!
int cube(int n){  
return n*n*n;  
}  
%>  
<%!
int squ(int s)
{
	return s*s;
}
%>
<%= "Cube of 3 is:\n"+cube(3) %>  
<%= "Square of 3 is:\n"+squ(3) %>  
Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
<%@ page contentType="application/msword" %>    
Today is: <%= new java.util.Date() %>  
<% this.log("message"); %>
Sorry following exception occured:<%= exception %> 
</body>  
</html>  