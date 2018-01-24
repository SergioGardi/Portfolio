<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="css/style.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>

	<form id="form1" name="form1" action="EjemploJDBCServlet" method="get">
	
	<h1>Login Session</h1>
	<form action="BDConnectionStringServlet"> </form>
	
	
		<p>
		<label>Username:</label> 
		<input type="text" name="txtUsername" id="usuarioE"> <br>
		</p>
		
		<p>
		<label>Password:</label> 
		<input text="password" name="Password" id="password"> <br>
		</p>
		
		<p class="subm-rest">
		<input type="submit" value="Login">
		<input type="reset" name="Cancel" id="Cancelar" value="Cancel" />
		</p>
		
	</form>
	
</body>

<script src="js/script.js">
</script>

</html>