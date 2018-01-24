/**
 * Ajax para agregar filas
 */

alert("Si Jalo, Ingresa Los Datos Solicitados!!");

	var xhr = new XMLHttpRequest();
	var num = 1;

	document.getElementById("btnAgregar").onclick = function(evnt)
	{

		xhr.open("GET", "index.jsp", true);
		xhr.onreadystatechange = function ()
		{
			var nombre = document.getElementById("no").value;
			var usuario = document.getElementById("us").value;
			var correo = document.getElementById("em").value;
			
			
			if (xhr.readyState ==4 && xhr.status==200)
			{
				document.getElementById("tcuerpo").innerHTML+= "<tr><td>" + nombre +"</td><td>" + usuario + "</td><td>" + correo +"</td></tr>"
			
				document.getElementById("no").value= " ";
				document.getElementById("us").value= " ";
				document.getElementById("em").value= " ";
			}
		}
	xhr.send();
	
	}
