<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet">

<title>EJEMPLO AJAX SERVIDOR SERVLET</title>
</head>
<body>
	<form action="EjemploAjaxServidorServlet" method="post">
		<h1>AJAX DEMO</h1>
		<label> Escribe tu Nombre: </label>
		<input type="text" id="txtUser" placeholder="Escribe tu texto"> <br>
		<input id="btnAcepta" type="button" value="Acepta el texto"> <br>
		<div id="WelcomeText"></div>
	
	
	
	</form>

</body>
<script src="js/script.js" type="text/javascript"></script>
</html>