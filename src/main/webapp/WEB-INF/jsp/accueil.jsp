<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Page d'accueil</title>
</head>
<body>
	<h1 style="color:blue; text-align:center">Welcome to the course selection system</h1>
	<table border="1" cellspacing="0" align="center" width="900">
	<tr align="center">
            <td width="150">Course Code</td>
            <td width="150">Title</td>
            <td width="150">Start Date</td>
            <td width="150">End Date</td>
            <td width="150">Capacity</td>
            <td width="150">Location</td>
	</tr>
	<c:forEach items="${sessionList}" var="node">
		<tr> 
		     <td width="150">${node.courseCode}</td>
		     <td width="150">${node.title}</td>
		     <td width="150">${node.startDate}</td>
		     <td width="150">${node.endDate}</td>
		     <td width="150">${node.max}</td>
		     <td width="150">${node.locationCity}</td>
		</tr>
	</c:forEach>
   	</table><br>
</body>
<form method="post" action="/filter">
	<center>
		<input name="enter" type="submit" value="Enter" style='font-size:20px'/>
	</center>
</form>
</html>