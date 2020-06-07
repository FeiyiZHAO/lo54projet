<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Page d'accueil</title>
</head>
<body>
	<h1 style="color:blue; text-align:center">Welcome to the course selection system</h1>
	<table border="1" cellspacing="0" align="center">
	<tr align="center">
            <td>Course Code</td>
            <td>Start Date</td>
            <td>End Date</td>
            <td>Capacity</td>
	</tr>
	<c:forEach items="${sessionList}" var="node">
		<tr> 
		     <td>${node.courseCode}</td>
		     <td>${node.startDate}</td>
		     <td>${node.endDate}</td>
		     <td>${node.max}</td>
		</tr>
	</c:forEach>
   	</table><br>
</body>
<form method="post" action="/course/getCourse">
	<center>
		<input name="enter" type="submit" value="Enter" style='font-size:20px'/>
	</center>
</form>
</html>