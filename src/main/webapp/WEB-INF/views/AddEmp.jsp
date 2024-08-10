<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
 <script src="<c:url value="/resources/JS/home.js" />"></script>
</head>
<body>
<jsp:include page="NavBar.jsp"/>
<h1>Employee Form</h1>
<div class="c">
<h1>Employee Form</h1>
<form name="frm" action="AddEmployee" method="Post">
<input type="text" name="name" value="" placeholder="Plz Enter the Name" onkeyup="setName(this.value)"><br><br>
  <span id="span"></span>
   <input type="text" name="email" value="" placeholder="Plz Enter the Email" onkeyup="validateEmail(this.value)"><br><br>
            <span id="s"></span>
          <input type="text" name="contact" value="" placeholder="Plz Enter the Contact" onkeyup="setMobile(this.value)"><br><br>
          <span id="m"></span>
             <input type="submit" name="s" value="REGISTER"><br><br>
             ${msg}
</form>
</div>
</body>
</html>