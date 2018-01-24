/**
 * 
 */
//alert("Testo");
document.getElementById('btnAcepta').onclick = function (evnt)
{
	//var contenidoCajaTexto = document.getElementsByName('txtUser').value;
	var contenidoCajaTexto = document.getElementById('txtUser').value;
	//alert(contenidoCajaTexto);
	var datosAEnviar = new FormData();
	datosAEnviar.append('Usuario',contenidoCajaTexto);
	
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function()
	{
		if(xhr.readyState == 4 && xhr.status==200)
		{
			console.log(xhr.responseText);
			document.getElementById('welcometext').innerHTML = xhr.responseText;
		}
	};
	xhr.open('POST','EjemploAjaxServidorServlet',true);
	xhr.send(datosAEnviar);
}