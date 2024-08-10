<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="NavBar.jsp"/>

<table align="center" border="5" width="60%">

<tr>
<th>NAME</th>
<th>EMAIL</th>
<th>CONTACT</th>
<th>DELETE</th>
<th>UPDATE</th>
</tr>

<c:forEach var="e"  items="${list}">
<tr>
<td>${e.getName() }</td>
<td>${e.getEmail() }</td>
<td>${e.getContact() }</td>


<td><a href='del?delete=${e.getId()}'>DELETE</a></td>
<td><a href='upd?update=${e.getId()}'>UPDATE</a></td>
<!-- pass multiple paramiter in uri-rewriting -->
<%-- <td><a href='upd?update=${e.getId()}&name=${e.getName()}&email=${e.getEmail()}&contact=${e.getContact()}'>DELETE</a></td> --%>
</tr>
</c:forEach>

</table>
</body>
</html>