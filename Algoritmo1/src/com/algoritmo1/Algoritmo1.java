package com.algoritmo1;

import java.util.Scanner;

public class Algoritmo1 {

	public static void main(String[] args) {
		
		//Declarando variables primitivas
		byte numero1;
		int numero2;
		short numero3;
		long numero4;
		float numero5;
		double numero6;
		boolean isVariable;
		char letra;
		final int numero7=10;
		
		//Inicializamos variables primitivas
		numero1=127;
		numero2=128;
		numero3=129;
		numero4=200;
		numero5=0.200f;
		numero6=3.1416;
		isVariable=true;
		letra='x';
		
		//Mostramos el valor de las variables primitivas
		System.out.println("El valor de la variable byte es:"+numero1+" que chilo");
		System.out.println("El valor de la variable int es:"+numero2+" que chilo");
		System.out.println("El valor de la variable short es:"+numero3+" que chilo");
		System.out.println("El valor de la variable long es:"+numero4+" que chilo");
		System.out.println("El valor de la variable float es:"+numero5+" que chilo");
		System.out.println("El valor de la variable double es:"+numero6+" que chilo");
		System.out.println("El valor de la variable boolean es:"+isVariable+" que chilo");
		System.out.println("El valor de la variable char es:"+letra+" que chilo");
		System.out.println("El valor de la constante es:"+numero7+" que chilo");
				
		//Declarando objetos
		String cadena;
		
		//Inicializamos objetos (Instanciar o concretizar una clase)
		cadena = new String();
		cadena = "Chilo";
		
		System.out.println("El valor del objeto String es:"+cadena+" que chilo");
		
		int operacion1 = numero1+numero2;
		System.out.println("El valor de la suma es:"+operacion1);
		
		//-------------------------------------
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de numeros a sumar:");
		int numero=0;
		numero = teclado.nextInt();
		System.out.println("La cantidad de numeros a sumar es:"+numero);
		int suma=0;
		int numeroIntroducido=0;
		
		for (int i=0;i<numero;i++)
		{
			System.out.println("Digita el numero:");
			numeroIntroducido= teclado.nextInt();
			suma=suma+numeroIntroducido;
		}
		System.out.println("La sumatoria de los numeros es:"+suma);
		
		suma=0;
		numeroIntroducido=0;
		isVariable=true;
		int contador=0;
		int vueltas;
		System.out.println("Ingrese la cantidad de numeros a sumar:");
		vueltas = teclado.nextInt();
		while(isVariable)
		{
			System.out.println("Digita el numero:");
			numeroIntroducido=teclado.nextInt();
			suma=suma+numeroIntroducido;
			contador++;
			if(contador>=vueltas)
			{
				isVariable=false;
			}
		}
		System.out.println("La sumatoria de los numeros es:"+suma);
		
		
		suma=0;
		numeroIntroducido=0;
		isVariable=true;
		contador=0;
		vueltas=0;
		System.out.println("Ingrese la cantidad de numeros a sumar:");
		vueltas = teclado.nextInt();
		do
		{
			System.out.println("Digita numero:");
			numeroIntroducido=teclado.nextInt();
			suma+=numeroIntroducido; //suma=suma+numeroIntroducido;
			contador++;
			if(contador>=vueltas)
			{
				isVariable=false;
			}
		}while(isVariable);
		System.out.println("El resultado de la suma es:"+suma);
		
		suma=0;
		int cantidadCincos=0;
		System.out.println("Sumar los multiplos del 5 desde el 0 hasta el 100");
		for(int i=0;i<=1530;i++)
		{
			if(i%5==0)
			{
				suma=suma+i;
				cantidadCincos=cantidadCincos+1;
			}
		}
		System.out.println("La suma de los cincos es:"+suma);
		System.out.println("La cantidad de cincos es:"+cantidadCincos);
		
		// Algoritmo de los numeros primos
		boolean isPrimo=true; 
		System.out.println("Introduce un numero y te diré si es primo:");
		numeroIntroducido=teclado.nextInt();
		for(int i=2;i<numeroIntroducido;i++)
		{
			if(numeroIntroducido%i==0)
			{
				isPrimo=false;
			}
		}
		System.out.println("El numero es primo?:"+isPrimo);
		//Algoritmo para pedir un numero al usuario y preguntar
		char respuesta='s';
		double numeroIntroducidoDouble;
		do
		{
			System.out.println("Introduce un numero:");
			numeroIntroducidoDouble=teclado.nextDouble();
			System.out.println("La raiz cuadrada es:"+Math.sqrt(numeroIntroducidoDouble));
			System.out.println("El cuadrado es:"+Math.pow(numeroIntroducidoDouble, 2));
			System.out.println("El cubo es:"+Math.pow(numeroIntroducidoDouble, 3));
			System.out.println("El redondeo hacia arriba es:"+Math.ceil(numeroIntroducidoDouble));
			System.out.println("El redondeo hacia abajo es:"+Math.floor(numeroIntroducidoDouble));
			System.out.println("El redondeo es:"+Math.round(numeroIntroducidoDouble));
			System.out.println("El absoluto es:"+Math.abs(numeroIntroducidoDouble));
			
			System.out.println("Desea ingresar otro numero?");
			respuesta=teclado.next().charAt(0);
		}while(respuesta=='s');
		
		//Ejercicios sobre cadenas
		String cadenita="Una mañana, tras un sueño intranquilo, Gre" + 
				"gorio Samsa se despertó convertido en un " + 
				"monstruoso insecto. Estaba echado de espald" + 
				"as sobre un duro caparazón y, al alzar la " + 
				"cabeza, vio su vientre convexo y oscuro, surcado " + 
				"por curvadas callosidades, sobre el cual " + 
				"casi no se aguantaba la colcha, que estaba a pun" + 
				"to de escurrirse hasta el suelo. Numerosas " + 
				"patas, penosamente delgadas en comparación al" + 
				" grosor normal de sus piernas, se agitaban " + 
				"sin concierto.";
		String cadenita2 ="Gregorio miró hacia la ventana; estaba nubla" + 
				"do, y sobre el cinc del " + 
				"alféizar repiqueteaban " + 
				"las gotas de lluvia, lo que le hi" + 
				"zo sentir una gran melancolía.";
		System.out.println(cadenita);
		
		System.out.println(cadenita2);
		System.out.println("La cantidad de caracteres en cadenita es:"+cadenita.length());
		System.out.println("La cantidad de caracteres en cadenita2 es:"+cadenita2.length());
		System.out.println("Esta la cadenita vacia?"+cadenita.isEmpty());
		System.out.println("Caracter en la posicion 10:"+cadenita.charAt(10));
		System.out.println("Cadenita en mayusculas:"+cadenita.toUpperCase());
		System.out.println("Cadenita en minusculas:"+cadenita.toLowerCase());
		System.out.println("La palabra mir de cadenita 2 comienza en:"+cadenita2.indexOf("miró"));
		
		//Ejercicios con vectores de cadena
		int[] vectorNumeros= {45,32,67,81,24,1,7,85,23,18,48,84,32};
		int menor=vectorNumeros[0];
		int mayor=vectorNumeros[1];
		int temp=0;
		System.out.println("Vector Desordenado:");
		for (int i=0; i<vectorNumeros.length;i++)
		{
			System.out.print(vectorNumeros[i]+" ");
		}
		
		for (int i=0; i<vectorNumeros.length;i++)
		{
			for(int j=0;j<vectorNumeros.length;j++)
			{
				if(vectorNumeros[i]>vectorNumeros[j])
				{
					temp=vectorNumeros[j];
					vectorNumeros[j]=vectorNumeros[i];
					vectorNumeros[i]=temp;
				}
			}
		}
		System.out.println("Vector Ordenado:");
		for (int i=0; i<vectorNumeros.length;i++)
		{
			System.out.print(vectorNumeros[i]+" ");
		}
		//System.out.println("Vector Ordenado:"+vectorNumeros);
		
		System.out.println("Introduce una cadena");
		String cadenitas= teclado.next();
		
		int cantidadAbiertos=0, cantidadCerrados=0;
		
		for(int i=0; i<cadenitas.length();i++)
		{
			if(cadenitas.charAt(i)=='(')
			{
				cantidadAbiertos++;
			}
			if(cadenitas.charAt(i)==')')
			{
				cantidadCerrados++;
			}
		}
		if(cantidadAbiertos!=cantidadCerrados)
		{
			System.out.println(false);
		}
		else
		{
			System.out.println(true);
		}
	}
	
	
}
