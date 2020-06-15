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
<div class="text" style=" text-align:center;">
<div class="text" style="text-align:left;padding-left:500px;">
<form action="sessions" method="POST">
	<h1 style="color:green;">&nbsp;&nbsp;&nbsp;&nbsp;Search courses</h1>
	  <h3> Keyword : <input type="text" name="keyword"></h3>
	  <br>
	  <h3> Location : 
	  	<select name="location">
	  		<option value="All">All
			<c:if test="${not empty list}">
		        <c:forEach items="${list}" var="location" >
					<option value="${location.getLocationCity()}">${location.getLocationCity()}
		        </c:forEach>
		    </c:if>
		</select>
		</h3>  
	  <br>
	  <h3> Date :  
	  <input type="date" name="date"></h3>
	  <br>
	  <input type="submit" value="Search" style='font-size:20px'/>   <input type="reset" value="Reset" style='font-size:20px'/>
	</form>
	</div>
</div>
</body>
</html>