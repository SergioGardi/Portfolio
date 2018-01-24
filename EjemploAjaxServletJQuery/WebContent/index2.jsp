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

	<form method="post" action="EjemploAJAXServletJQueryServlet">
	
	<h1>Practica de AJAX con Servlets y JQuery 2</h1>
	<label>Introduce un Texto:</label>
		<input type="text" id="txttexto" placeholder="Ingresa texto"><br>
	 	<input type="button" id="btnAcepta" value="Acepta"><br>
	 </form>
	 <div id="divTextoBienvenida"></div>
	 	

</body>
<script src="jquery/jquery-3.2.1.min.js" ></script>
<script src="js/script2.js"></script>

</html>