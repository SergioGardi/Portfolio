package com.ejercicioTest;

import java.util.Scanner;

public class parentesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//importar libreria de escaner
	//inicializar objeto
		//Declarar objeto y como va a funcionar
		Scanner teclado = new Scanner(System.in);
 // imprimir instruccion para el ususario
	// iniciarlizar objeto en donde se guardará 
	//la informacion que ingrese el usuario
		
		System.out.println("Introduce una cadena con parentesis: ");
		String cadena=teclado.next();
		
		int cantAb=0, cantCe=0;
		
		
		for(int i=0; i<cadena.length();i++);
		{
			
			if(cadena.charAt(i)=='(')
			{
				cantAb++;
			}
			if(cadena.charAt(i)==')')
			{
				cantCe++;
			}
		}
		if(cantAb!=cantCe)
		{
			System.out.println(false);
		}
		else
		{
			System.out.println(true);
		}
	}

}
