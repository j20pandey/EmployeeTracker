<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<h1>LogIn</h1>
${SPRING_SECURITY_LAST_EXCEPTION.message}
<form action="login" method ="post">
	User Name: <input type="text" name="username"><br> User
	Password: <input type="text" name="password"><br> <input
		type="submit" value="Log In">
</form>
<body>
</body>
</html>