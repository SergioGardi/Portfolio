<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Examen</title>
</head>
<body>
<% 
	for (int i=0; i<=30; i++){
		System.out.println("Alumnos de Generation: " + (i+1) + "numero");
			}
%>

	<form action="Nombre"  metod="get">
	<h1>EXAMEN</h1>
	
	<form action="ExamenServlet.java"  id=form1 method=post name=form1>
		<label>Ingresa tu nombre:</label>
		<input id="nombre" name="nombre"/><br>
		
		<label>Ingresa tu dirección:</label>
		<input id="direccion" name="direccion"/><br>
		
		<label>Ingresa tu telefono:</label>
		<input type="telefono" name="telefono"/><br>
		
		<input type="submit"value="Accept">
	</form>
	


</body>
</html>