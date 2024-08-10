<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 
 <script src="<c:url value="/resources/JS/home.js" />"></script>
 <link rel="stylesheet" href="<c:url value="/resources/style.css" />">
</head>
<body>
<jsp:include page="NavBar.jsp"/>
<br>

<input type='text' name='name' onkeyup="searchname(this.value)"/>

<p id="p1"></p>
</body>
</html>