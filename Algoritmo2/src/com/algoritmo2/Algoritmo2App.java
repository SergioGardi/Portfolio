package com.algoritmo2;

public class Algoritmo2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt1 = "Una ma�ana, tras un sue�o intranquilo, Gregorio Samsa" + 
				" se despert� convertido en un " + 
				"monstruoso insecto. Estaba echado de espaldas" + 
				" sobre un duro caparaz�n y, al alzar la " + 
				"cabeza, vio su vientre convexo y oscuro, surcado " + 
				"por curvadas callosidades, sobre el cual " + 
				"casi no se aguantaba la colcha, que estaba a punto" + 
				" de escurrirse hasta el suelo. Numerosas " + 
				"patas, penosamente delgadas en comparaci�n al" + 
				" grosor normal de sus piernas, se agitaban " + 
				"sin concierto.";
		
		String txt2 = "Gregorio mir� hacia la ventana; estaba nublado," + 
				" y sobre el cinc del " + 
				"alf�izar repiqueteaban " + 
				"las gotas de lluvia, lo que le hizo" + 
				" sentir una gran melancol�a.";
		
		String txt3= "Aaeiou";
		String txt4= "Anita la gorda lagarta traga la droga latina";
		
		ManejoCadenas objCadena = new ManejoCadenas();
		System.out.println("Cantidad de Vocales: "+objCadena.contarVocales(txt2));
		System.out.println("Cantidad de signos de puntuacion: "+objCadena.contarSignos(txt2));
		System.out.println("Es la frase : "+txt4+ "palindroma?"+objCadena.isPalindromo(txt4));

	}

}
