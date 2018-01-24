<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet">


<title>Insert title here</title>
</head>
<body>
	<form action="EjemploAjaxServlet" method="post">
	<div> <p> Titulo de mi Formulario </p></div>
	
	<!--  Forma 1 -->
	<input id="botoncito" type="button"  value="Acepta"/></input>
	<div id="datos"></div>
	
	<!--  Forma 2 
	<input type="button" onclick="ejecutaCodigo()" value="Acepta"/>-->

	</form>


</body>
<script  src="js/script.js"></script>
</html>