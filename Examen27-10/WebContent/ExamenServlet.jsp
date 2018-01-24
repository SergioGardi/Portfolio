<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		response.getWriter().append("La suma es: " 
		+cuentitas.sumar()+"</br>");
		response.getWriter().append("La resta es: " 
		+cuentitas.restar()+"</br>");
		response.getWriter().append("La division es: " 
		+cuentitas.dividir()+"</br>");
		response.getWriter().append("La multiplicacion es: " 
		+cuentitas.multiplicar()+"</br>");



</body>
</html>