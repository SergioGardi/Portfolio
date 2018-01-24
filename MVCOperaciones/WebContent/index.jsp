<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/style.css" rel="stylesheet" type"text/css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MVC Operaciones</title>
</head>
<body>
	
	<h1>MVC Operaciones</h1>
	
	<form action="ServletOperaciones" method="post">
		<label>Input a number:</label>
		<input type="text" name="txtNumber1"/><br>
		
		<label>Input a number:</label>
		<input type="text" name="txtNumber2"/><br>
		
		<input type="submit"value="Accept">
	</form>
		<table>
			<thead><th> Usuarios </th><th> Contraseñas </th></thead>
			<tbody>
			<tr><td>
			<%for(int i=1; i<=100;i++) 
			{
				out.println("<tr><td><input type=\"text\" name=\"admin"+i+"\" placeholder=\"admin"+i+ "\"></td><td>admin"+i+"</td></tr>");
			}
			
			%>
			<!--  
			<tr><td>admin</td><td>admin</td></tr>
			<tr><td>admin2</td><td>admin2</td></tr>
			<tr><td>admin3</td><td>admin3</td></tr>
			<tr><td>admin4</td><td>admin4</td></tr>
			</tbody>
			</table>
			<%
			out.println("Estees mi testo");
			%>	-->
</body>
</html>