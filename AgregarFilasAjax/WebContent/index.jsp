<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet"/>

<title>Insert title here</title>
</head>

<body onload="limpiar">
<h1> Agregar Filas en Ajax</h1>
	<table>
		<input onFocus=clear_textbox type="textbox" placeholder="Nombre" id="no">
		<input onFocus=clear_textbox type="textbox" placeholder="Usuario" id="us">
		<input onFocus=clear_textbox type="textbox" placeholder="Correo" id="em">
		
		<input type="button" value="Agregar Registro" id="btnAgregar">
		<theader>
		<th>Nombre</th><th>Usuario</th><th>Email</th>
		</theader>
	
		<tbody id="tcuerpo">
			<tr>
				<td> Sergio García</td>
				<td> Sergardi </td>
				<td> sergadi@gmail.com </td>
			</tr>
			
			<tr>
				<td> Mauricio Gonzalez</td>
				<td> Mautze </td>
				<td> mautze@gmail.com </td>
			</tr>
			
			<tr>
				<td> Ivette Sierra</td>
				<td> Ivetts </td>
				<td> ivetts@gmail.com </td>
			</tr>
			
			<tr>
				<td> Andres Huerta</td>
				<td> Androh </td>
				<td> andh@gmail.com </td>
			</tr>
			
			<tr>
				<td> Mario Cardenas</td>
				<td> Macaza </td>
				<td> macaza@gmail.com </td>
			</tr>
	
		</tbody>
	</table>

</body>

<script src="js/script.js" type="text/javascript"></script>
</html>