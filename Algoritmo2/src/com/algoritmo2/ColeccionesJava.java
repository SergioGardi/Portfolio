package com.algoritmo2;

import java.util.ArrayList;
import java.util.Iterator;

public class ColeccionesJava 
{
	public void PracticaListas()
	{
		ArrayList<String> lista1 = new ArrayList();
		
		lista1.add("Elemento1");
		lista1.add("Elemento2");
		lista1.add("Elemento3");
		lista1.add("Elemento4");
		lista1.add("Elemento5");
		
		Iterator contador = lista1.iterator();
		
		while(contador.hasNext())
		{
			System.out.println("Elemento: " + contador.next());
		}
	}

	
}
