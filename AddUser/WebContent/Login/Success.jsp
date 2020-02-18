<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page  import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%
  
     if(request.getAttribute("availableData")!=null)
     {
    	 ArrayList itemsArray = (ArrayList) request.getAttribute("availableData");
    	 out.println(itemsArray);
    	   
    	  for (int i=0; i < itemsArray.size(); i++) 
    	  {
    		  out.println(itemsArray.get(i)); 

    	  }

     }
     else
     {
    	 out.println("no data in array");
     }
  
  %>
</body>
</html>
