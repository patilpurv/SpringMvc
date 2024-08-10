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
 <div class="c">
    <h1>REGISTER PAGE</h1>
<form name="frm" action="register" method="Post">
          <input type="text" name="name" value=""  placeholder="Plz Enter the Name" onkeyup="setName(this.value)"><br><br>
             <span id="span"></span>
          <input type="text" name="email" value="" placeholder="Plz Enter the Email" onkeyup="validateEmail(this.value)"><br><br>
            <span id="s"></span>
          <input type="text" name="contact" value="" placeholder="Plz Enter the Contact" onkeyup="setMobile(this.value)"><br><br>
          <span id="m"></span>
          <input type="text" name="uname" value="" placeholder="Plz Enter the UName" onkeyup="setUName(this.value)"><br><br>
              <span id="u"></span>
            <input type="text" name="pass" value="" placeholder="Plz Enter the Password" onkeyup="password(this.value)"><br><br>
                <span id="s5"></span>
             <input type="submit" name="s" value="REGISTER"><br><br>
</form>
<h1><a href="login">LOGIN</a></h1>
${msg}
</div>
</body>
</html>
