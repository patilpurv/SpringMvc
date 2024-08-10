<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>
 <div class="navi">
<ul>
 
<li><a href='add'>Add Employee</a></li>
<li><a href='view'>View All Employee</a></li>
<li><a href='search'>Search Employee</a></li>
<li>
<select name="name">
        <!-- Iterate through the list and generate options -->
        <c:forEach items="${list}" var="employee">
            <option value="${employee.id}">${employee.name}</option>
        </c:forEach>
    </select>
</li>
	
</ul>
</div>
</body>
</html>