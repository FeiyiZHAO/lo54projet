<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sessions</title>
</head>
<body>
<table border="1" width="100%" class="imagetable">
    <tr>
        <th>Course Code</th>
        <th>Title</th>
        <th>Start_date</th>
        <th>End_date</th>
        <th>Max</th>
        <th>Percentage</th>
        <th>Location</th>
        <th>Select</th>
    </tr>

    <c:if test="${not empty sessions}">
        <c:forEach items="${sessions}" var="session" >
            <tr>
                <td>${session.courseCode}</td>
                <td>${session.title}</td>
                <td>${session.startDate}</td>
                <td>${session.endDate}</td>
                <td>${session.max}</td>
                <td>${session.pourcentage}</td>
                <td>${session.locationCity}</td>
                <td>
	            <form action="registre" method="POST">
	        		<input type="hidden" value="${session.courseSessionId}" name="sessionId"/>
	                <input type="submit" value="select"/>
				</form>
				</td>
            </tr>
        </c:forEach>
    </c:if>
</table>
</body>
</html>