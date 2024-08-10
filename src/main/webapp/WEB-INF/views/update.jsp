<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
<script src="<c:url value="/resources/JS/home.js" />"></script>
</head>
<body>
	<jsp:include page="NavBar.jsp" />

	<div class="c">
		<h1>Update Employee Form</h1>
		<form name="frm" action="FinalUpdate" method="post">
			<input type="hidden" name="id" value="${e.getId()}"><br>
			<br> <input type="text" name="name" value="${e.getName()}"
				placeholder="Plz Enter the Name" onkeyup="setName(this.value)"><br>
			<br> <span id="span"></span> <input type="text" name="email"
				value="${e.getEmail()}" placeholder="Plz Enter the Email"
				onkeyup="validateEmail(this.value)"><br> <br> <span
				id="s"></span> <input type="text" name="contact"
				value="${e.getContact()}" placeholder="Plz Enter the Contact"
				onkeyup="setMobile(this.value)"><br> <br> <span
				id="m"></span> <input type="submit" name="s" value="UPDATE"><br>
			<br>

		</form>
	</div>
</body>
</html>