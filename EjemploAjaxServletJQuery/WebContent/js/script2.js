/**
 * 
 */
alert("Si Jala 2");

$(document).ready(function () 
{    
		    $('#btnAcepta').click(function () 
		    {		
		    alert("entro al boton");
			var contenidoCajaTexto = $('#txttexto').val();
			alert("El contenido de la caja de texto: " +contenidoCajaTexto);
		    
		    /*  $.getJSON("data/data.json", function (json) {
		        alert("JSON Data: " + json.peliculas[0].nombre);
		      });*/
		    
		    $.ajax
			({
				type:'GET',
				data:{contenidoCajaTexto: contenidoCajaTexto},
				url: 'data/data.json',
				success:function(data)
				{
					$('#divTextoBienvenida').html("JQuery Result: "+data.pelicula[0].nombre);
				},
				error:function(data)
				{
					$('#divTextoBienvenida').html("Error");
				}
			});
		});
});   