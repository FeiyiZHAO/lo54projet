<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Filter</title>
</head>
<body>
<form action="sessions" method="POST">
<h4>Filter by</h4>
<ul>
  <li>Keyword: <input type="text" name="keyword"></li>
  <li>Lieu: 
  	<select name="location">
  		<option value="All">All
		<c:if test="${not empty list}">
	        <c:forEach items="${list}" var="location" >
				<option value="${location.getLocationCity()}">${location.getLocationCity()}
	        </c:forEach>
	    </c:if>
	</select>
  </li>
  <li>Date: <input type="date" name="date"></li>
  <li><input type="submit" value="submit" /></li>
  <li><input type="reset" value="reset" /></li>
</ul>
</form>
</body>
</html>