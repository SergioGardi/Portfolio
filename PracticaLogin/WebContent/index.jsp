<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>My First Java Server Page</title>
	</head>
	<body>
		<form action="LoginServlet" method="post">
		<label>Input your Email:</label>
		<input type="text" name="txtEmail" placeholder="Capture your email"/>
		</br>
		<label>Input your Password:</label>
		<input type="password" name="txtPass" placeholder="Capture your password"/>
		</br>
		<input type="submit" value="Accept"/>
	</form>
	</body>
</html>