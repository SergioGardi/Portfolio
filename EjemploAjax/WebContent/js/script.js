/**
 * Este ejemplo de JavaScript es para mostrar una
 * PRACTICA DE AJAX
 */

alert("Si estoy corriendo!!!");


		var xhr = new XMLHttpRequest();//objeto AJAX
		//Forma 1
			document.getElementById("botoncito").onclick = 
				function (evnt) 
				{
				xhr.open("GET", "data/usuarios.xml", true);
				xhr.onreadystatechange = function()
				{
					if (xhr.readyState == 4 && xhr.status == 200)
						{
						document.getElementById("datos").innerHTML = xhr.responseText;
						}
				}		
				xhr.send();
						
				}
			

