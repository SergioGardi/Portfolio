package com.algoritmo2;

public class ManejoCadenas {
	
	//Contar Vocales
	
	public int contarVocales(String txt)
	{
		txt=txt.toLowerCase();
		int numeroVocales=0;
		for (int i=0;i<txt.length();i++)
		{
			if (txt.charAt(i)== 'a' || 
				txt.charAt(i)== 'e' ||
				txt.charAt(i)== 'i' ||
				txt.charAt(i)== 'o' ||
				txt.charAt(i)== 'u')
					{
				numeroVocales++;
					}
		}
		return numeroVocales;
		
	}
	public int contarSignos(String txt)
	{
		txt=txt.toLowerCase();
		int numeroVocales=0;
		for (int i=0;i<txt.length();i++)
		{
			if (txt.charAt(i)== '.' ||
				txt.charAt(i)== ';' ||
				txt.charAt(i)== ',')

					{
				numeroVocales++;
					}
		}
		return numeroVocales;
	}
	public boolean isPalindromo(String cadena)
		{
		boolean isPalindroma=false;
		
		
		cadena = cadena.replace(" ","");
		System.out.println(cadena);
		
		for(int i=0; i<Math.floor(cadena.length()/2);i++)
		
			
		return isPalindroma;
		return isPalindroma;
		}
	
			
}


