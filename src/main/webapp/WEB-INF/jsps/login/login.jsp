<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<form action="login" method="post">
<pre>
<h2>User Login Page</h2>
User Name: <input type="text" name="email"/>
Password: <input type="password" name="password"/>
<input type="submit" value="Login"/>
${msg}
</pre>
</form>


</body>
</html>