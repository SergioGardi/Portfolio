package anagramasProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnagramasApplication 
{
	
	public static void main(String[] args) 
	{
		//Entrada
		String[] palabras = {"AMOR", "ARMO", "ESPONJA", "JAMON", "JAPONES", "MARO", "MONJA", "MORA", "RAMO", "ROMA","OMAR"};
		
		ArrayList<String> otrasPalabras = new ArrayList<String>();
		otrasPalabras.add("ARMO");
		otrasPalabras.add("ESPONJA");
		otrasPalabras.add("JAMON");
		otrasPalabras.add("JAPONES");
		otrasPalabras.add("MARO");
		otrasPalabras.add("MONJA");
		otrasPalabras.add("MORA");
		otrasPalabras.add("RAMO");
		otrasPalabras.add("ROMA");

		
		
		//Proceso
		System.out.println("------Se visualiza el vector----------");
		DameAnagramas(palabras);
		System.out.println("---------Se visualiza el arraylist-----");
		AnagramasLista(otrasPalabras);
		
		
		//salida
	}
	
	public static void DameAnagramas(String[] palabras)
	{
		for (int i=0;i<palabras.length;i++)
		{
			System.out.println(palabras[i]);
		}
	}
	
	public static void AnagramasLista(ArrayList<String> otrasPalabras)
	{
		
		
		System.out.println(otrasPalabras.size());
		for(int elementos=0; elementos<=otrasPalabras.size();elementos++)
		{
			Iterator iterador = otrasPalabras.iterator();
			String palabraPrimera="";
			String palabraSiguiente="";
			char caracter;
			boolean isAnagrama=true;
			int indice=0;
			
			System.out.print("\n");
			palabraPrimera=(String) iterador.next();
			iterador.remove();
			indice++;
			System.out.println("Vuelta:"+elementos);
			System.out.print(palabraPrimera+"-");
			while (iterador.hasNext()) {
				palabraSiguiente = (String) iterador.next();
				if (palabraPrimera.length() == palabraSiguiente.length()) {
					// System.out.println("Verdadero");
					for (int i = 0; i < palabraPrimera.length(); i++) {
						caracter = palabraPrimera.charAt(i);

						if (palabraSiguiente.indexOf(caracter) == -1) // Si es igual a -1 entonces no se encontr� el
																		// caracter
						{
							isAnagrama = false;
						}
					}
					if (isAnagrama == true) {
						System.out.print(palabraSiguiente+"-");
						iterador.remove();
						// System.out.println(palabraSiguiente);
						// otrasPalabras.remove(indice);
					} 
					else
					{
						//System.out.println("No es un anagrama");
					}
				} 
				else {
					//System.out.println("No es un anagrama");
				}
			}
		}
		
		/*
		System.out.println(palabraPrimera);
		System.out.println(palabraSiguiente);
		while(iterador.hasNext())
		{
			//System.out.println(iterador.next());
		}*/
	}
	public static void Scenario(String[] args) 
	{
		//Entrada
		String[] palabras = {"AMOR", "ARMO", "ESPONJA", "JAMON", "JAPONES", "MARO", "MONJA", "MORA", "RAMO", "ROMA","OMAR"};
		
		ArrayList<String> otrasPalabras = new ArrayList<String>();
		otrasPalabras.add("CASA");
		otrasPalabras.add("SACA");
		otrasPalabras.add("REMERA");
		otrasPalabras.add("CARPIO");
		otrasPalabras.add("REARME");
		otrasPalabras.add("REMARE");
		otrasPalabras.add("PICARO");
		otrasPalabras.add("COPIAR");


		
		
		//Proceso
		System.out.println("------Se visualiza el vector----------");
		DameAnagramas(palabras);
		System.out.println("---------Se visualiza el arraylist-----");
		AnagramasLista(otrasPalabras);
		
		
		//salida
	}
	
	public static void DameAnagramas(String[] palabras)
	{
		for (int i=0;i<palabras.length;i++)
		{
			System.out.println(palabras[i]);
		}
	}
	
	public static void AnagramasLista(ArrayList<String> otrasPalabras)
	{
		
		
		System.out.println(otrasPalabras.size());
		for(int elementos=0; elementos<=otrasPalabras.size();elementos++)
		{
			
			Iterator iterador = otrasPalabras.iterator();
			String palabraPrimera="";
			String palabraSiguiente="";
			char caracter;
			boolean isAnagrama=true;
			int indice=0;
			
			System.out.print("\n");
			palabraPrimera=(String) iterador.next();
			iterador.remove();
			indice++;
			System.out.println("Vuelta:"+elementos);
			System.out.print(palabraPrimera+"-");
			while (iterador.hasNext()) {
				palabraSiguiente = (String) iterador.next();
				if (palabraPrimera.length() == palabraSiguiente.length()) {
					// System.out.println("Verdadero");
					for (int i = 0; i < palabraPrimera.length(); i++) {
						caracter = palabraPrimera.charAt(i);

						if (palabraSiguiente.indexOf(caracter) == -1) // Si es igual a -1 entonces no se encontr� el
																		// caracter
						{
							isAnagrama = false;
						}
					}
					if (isAnagrama == true) {
						System.out.print(palabraSiguiente+"-");
						iterador.remove();
						// System.out.println(palabraSiguiente);
						// otrasPalabras.remove(indice);
					} 
					else
					{
						//System.out.println("No es un anagrama");
					}
				} 
				else {
					//System.out.println("No es un anagrama");
				}
			}
		}
		
		/*
		System.out.println(palabraPrimera);
		System.out.println(palabraSiguiente);
		while(iterador.hasNext())
		{
			//System.out.println(iterador.next());
		}*/
	}
}
