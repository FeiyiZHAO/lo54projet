<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
<font size="6">
<form action="update" method="POST">
	<h2>&nbsp;&nbsp;Sign Up</h2>
		<ul style="list-style-type:none">
			<li>Last name : <input type="text" name="lastname"></li>
			<li>First name : <input type="text" name="firstname"></li>
			<li>Address : <input type="text" name="address"></li>
			<li>Phone : <input type="text" name="phone"></li>
			<li>Email : <input type="text" name="email"></li>
			<li><input type="submit" value="Sign Up" style='font-size:20px'/></li>
  			<li><input type="reset" value="Reset" style='font-size:20px'/></li>	
		</ul>
</form>
</font> 
</body>
</html>
