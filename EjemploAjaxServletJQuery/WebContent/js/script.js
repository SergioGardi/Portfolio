/**
 * 
 */
alert("Si Jala 1");

document.getElementById("btnAcepta").onclick = function(evnt)
{
	var xhr = new XMLHttpRequest();
	var contenidoCajaTexto = document.getElementById("txttexto")
	xhr.onreadystatechange = function()
	{
		if(xhr.readyState == 4 && xhr.status == 200)
			{
			 document.getElementById("divTextoBienvenida").innerHTML = 
				 contenidoCajaTexto.value+"Contenido del Json: "+xhr.responseText;
			}
	}
	xhr.open("POST", "data/data.json",true);
	xhr.send();
}