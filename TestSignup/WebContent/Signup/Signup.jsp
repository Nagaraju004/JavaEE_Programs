<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form  method="post" action="SignupCheck">
	First Name:
	<input type="text" name="fname">
    <br>
    Last Name:
	<input type="text" name="lname"> 
	<br>
	Age:
	<input type="text" name="age"> 
	<br>
	Password:
	<input type="password" name="pword"> 
	<br>
	Confirm Password:
	<input type="password" name="cpass">
	<br>
	<input type="submit" value="Sign Up">
  </form>
</body>
</html>