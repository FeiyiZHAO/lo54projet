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
<font size="6">
<form action="sessions" method="POST">
<h2>&nbsp;&nbsp;Search courses</h2>
<ul style="list-style-type:none">
  <li>Keyword : <input type="text" name="keyword"></li>
  <li>Location : 
  	<select name="location">
  		<option value="All">All
		<c:if test="${not empty list}">
	        <c:forEach items="${list}" var="location" >
				<option value="${location.getLocationCity()}">${location.getLocationCity()}
	        </c:forEach>
	    </c:if>
	</select>
  </li>
  <li>Date : <input type="date" name="date"></li>
  <li><input type="submit" value="Search" style='font-size:20px'/></li>
  <li><input type="reset" value="Reset" style='font-size:20px'/></li>
</ul>
</form>
</font> 
</body>
</html>