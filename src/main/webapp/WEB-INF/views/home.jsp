<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link href="<c:url value="/resources/style.css" />" rel="stylesheet">
        <script src="<c:url value="/resources/JS/home.js" />"></script>
    </head>
    <body>
    <div class="c">
    <h1>LOGIN PAGE</h1>
       <form name="frm" action="login" method="post">
       <input type="text" name="uname" value=""  onkeyup="setName(this.value)"><br><br>
       <span id="span"></span>
          <input type="text" name="pass" value=""  onkeyup="password(this.value)"><br><br>
                 <span id="s5"></span>
             <input type="submit" name="s" value="LOGIN"><br><br>
            <h1> <a href='reg'>REGISTER</a></h1>
                 ${msg}
       </form>
  
      </div>	
    </body>
</html>
