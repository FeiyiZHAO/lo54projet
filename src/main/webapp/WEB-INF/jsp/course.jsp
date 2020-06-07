<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course</title>
</head>
<body>
<h1>Courses</h1>
<table border="1" width="100%" class="imagetable">
    <tr>
        <th>code</th>
        <th>title</th>
    </tr>
    <c:if test="${not empty courses}">
        <c:forEach items="${courses}" var="course" >
            <tr>
                <td>${course.courseCode}</td>
                <td>${course.title}</td>
            </tr>
        </c:forEach>
    </c:if>
</table>
</body>
</html>