<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<h1 style="color:green; text-align:center">You have successfully selected the course(s) ! </h1>
	<h3 style="color:black; text-align:center">Click the button below to go back to the search page...</h3>
</body>
	<center>
	<h4>Dear: </h4>
	<h4>         ${lastname}</h4>
	<form method="post" action="/filter">
		<input name="enter" type="submit" value="Return" style='font-size:20px'/>
	</form>
	</center>
</html>