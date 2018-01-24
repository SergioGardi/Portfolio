import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import jdk.internal.dynalink.beans.StaticClass;

public class evaluacionGeneration {


	 public static void color(byte iColor) { switch (iColor) { case 1:
	  System.out.print(" Rojo"); break; case 2: System.out.print(" Amarillo");
	  break; case 3: System.out.print(" Verde"); break; case 4:
	  System.out.print(" Azúl"); break; default:
	  System.out.print(" Calificación no válida"); } }
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  
	  String name; byte mentalidadDeCrecimiento=0; byte persistencia=0; byte
	  responsabilidadPersonal=0; byte orientacionAlFuturo=0; byte comunicación=0;
	  byte trabajoEnEquipo=0; byte gestiónDelTiempo=0; byte orientaciónAlDetalle=0;
	  float promGeneral=0; float promGeneration=0; float promJava=0; int
	  sumatotal=0; final int ROJO=1; final int AMARILLO=2; final int VERDE=3; final
	  int AZUL=4;
	  
	  Scanner datos= new Scanner(System.in);
	  System.out.println("Nombre del Alumno: "); name=datos.nextLine();
	  
	  System.out.println("Ingresa tu calificacion con valor del 1 al 4");
	  
	  do { System.out.println("Calificacion Mentalidad de Crecimiento: ");
	  mentalidadDeCrecimiento=datos.nextByte(); } while (mentalidadDeCrecimiento<1
	  || mentalidadDeCrecimiento>4); do {
	  System.out.println("Calificacion de Persistencia: ");
	  persistencia=datos.nextByte(); } while (persistencia<1 || persistencia>4); do
	  { System.out.println("Calificacion Responsabilidad Personal: ");
	  responsabilidadPersonal=datos.nextByte(); } while (responsabilidadPersonal<1
	  || responsabilidadPersonal>4); do {
	  System.out.println("Calificacion Orientacion al Futuro: ");
	  orientacionAlFuturo=datos.nextByte(); } while (orientacionAlFuturo<1 ||
	  orientacionAlFuturo>4); do {
	  System.out.println("Calificacion Comunicacion: ");
	  comunicación=datos.nextByte(); } while (comunicación<1 || comunicación>4); do
	  { System.out.println("Calificacion Trabajo en Equipo: ");
	  trabajoEnEquipo=datos.nextByte(); } while (trabajoEnEquipo<1 ||
	  trabajoEnEquipo>4); do {
	  System.out.println("Calificacion Gestion del Tiempo: ");
	  gestiónDelTiempo=datos.nextByte(); } while (gestiónDelTiempo<1 ||
	  gestiónDelTiempo>4); do {
	  System.out.println("Calificacion Orientación al Detalle: ");
	  orientaciónAlDetalle=datos.nextByte(); } while (orientaciónAlDetalle<1 ||
	  orientaciónAlDetalle>4);
	  
	  sumatotal=mentalidadDeCrecimiento+persistencia+responsabilidadPersonal+
	  orientacionAlFuturo+comunicación+trabajoEnEquipo+gestiónDelTiempo+
	  orientaciónAlDetalle;
	  promGeneral=(mentalidadDeCrecimiento+persistencia+responsabilidadPersonal+
	  orientacionAlFuturo+comunicación+trabajoEnEquipo+gestiónDelTiempo+
	  orientaciónAlDetalle )/8f;
	  promGeneration=(mentalidadDeCrecimiento+persistencia+responsabilidadPersonal+
	  orientacionAlFuturo)/4f;
	  promJava=(comunicación+trabajoEnEquipo+gestiónDelTiempo+orientaciónAlDetalle)
	  /4f;
	  
	  
	  System.out.println("Nombre del Alumno: \t Numero \t\t Color");
	  
	  System.out.print("Mentalidad de Crecimiento: "+mentalidadDeCrecimiento
	  +"\t"); color(mentalidadDeCrecimiento); System.out.println(" ");
	  System.out.print("Persistencia: "+persistencia + "\t"); color(persistencia);
	  System.out.println(" ");
	  System.out.print("Responsabilidad Personal: "+responsabilidadPersonal +
	  "\t"); color(responsabilidadPersonal); System.out.println(" ");
	  System.out.print("Orientación al Futuro: "+orientacionAlFuturo + "\t");
	  color(orientacionAlFuturo); System.out.println(" ");
	  System.out.print("Comunicación: "+comunicación + "\t"); color(comunicación);
	  System.out.println(" ");
	  System.out.print("Trabajo en Equipo: "+trabajoEnEquipo + "\t");
	  color(trabajoEnEquipo); System.out.println(" ");
	  System.out.print("Gestión del Tiempo: "+gestiónDelTiempo + "\t");
	  color(gestiónDelTiempo); System.out.println(" ");
	  System.out.print("Orientacion al Detalle: "+orientaciónAlDetalle + "\t");
	  color(orientaciónAlDetalle); System.out.println(" ");
	  
	  System.out.println("Promedio General: "+promGeneral);
	  System.out.println("Promedio Generation: "+promGeneration);
	  System.out.println("Promedio Java: "+promJava); }
	  
	 
	// Ejercicio 1 __________________________________________________________________

 {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader leer = new BufferedReader(isr);
	boolean repetir=false;
		do {
			String numero = "";
		try {
			System.out.println("Ingresa un numero:");
			numero = leer.readLine();
		} catch (Exception e) {} //salto de carro 
		int num = Integer.parseInt(numero);
		if (esPrimo(num))
			System.out.println("Es primo");
		else
			System.out.println("No es primo");
		try {
			do {
			System.out.println("Desea calcular otro numero (S=Si/N=No): ");
			numero = leer.readLine();
			} while(numero.compareToIgnoreCase("S")!=0 && numero.compareToIgnoreCase("N")!=0);
			} catch (Exception e) {}
		repetir=false;
		if (numero.compareToIgnoreCase("S")==0)
			repetir=true;		}
		while (repetir);	}
	public static boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
				primo = false;
			contador++;		}
		return primo;	}


	// Ejercicio 2___________________________________________________________
	
 {
		Scanner leer = new Scanner(System.in);
	System.out.println("Ingresa la Base del Triangulo: ");
	int base = Integer.parseInt(leer.nextLine());
	System.out.println("Ingresa la Altura del Triangulo: ");
	int altura = Integer.parseInt(leer.nextLine());
	System.out.println("Area: " + (base * altura));
	}

	// Ejercicio 3___________________________________________________________
	
{
		Scanner leer= new Scanner (System.in);
	System.out.println("Ingresa cuantas veces quieres calcular los datos: ");
	int cant= Integer.parseInt(leer.nextLine());
	int contador=0;
	while (contador< cant) {
		System.out.println("Ingresa la base del rectangulo: ");
		int base= Integer.parseInt(leer.nextLine());
		System.out.println("Ingresa la altura del rectangulo: ");
		int altura= Integer.parseInt(leer.nextLine());
		
		System.out.println("Area: " +base*altura); //area
		System.out.println("Perimetro: " +((base*2)+(altura*2))); //perimetro
		
	contador++;
	} 
	} 


	//Ejercicio 4 _______________________________________________________________
	
{
		Scanner leer= new Scanner (System.in);
	System.out.println("Ingresa cuantas veces quieres calcular los datos: ");
	int cant= Integer.parseInt(leer.nextLine());
	int contador=0;
	while (contador< cant) {
		System.out.println("Ingresa la medida de un lado del cuadrado: ");
		int lado= Integer.parseInt(leer.nextLine());

		
		System.out.println("Area: " +lado*lado); //area
		System.out.println("Perimetro: " +(lado*4)); //perimetro
		
	contador++;
	} 
	}

   //Ejercicio 5______________________________________________________________
	
{
		InputStreamReader isr = new InputStreamReader(System.in);
		Scanner leer= new Scanner (System.in);
		String decision = "";
		boolean repetir = false;
		do {
		System.out.println("Ingresa un numero base: ");
		int base= Integer.parseInt(leer.nextLine());
		System.out.println("Ingresa una potencia: ");
		int potencia= Integer.parseInt(leer.nextLine());
		int resultado=1; //se pone 1 para evitar la multiplicacion por 0 
		for(int exp=potencia; exp>=1;exp--)
		{
			resultado *=base;
		}
		System.out.println(resultado);
		try {
			do {
			System.out.println("Desea calcular otro numero (S=Si/N=No): ");
			decision = leer.nextLine();
			} while(decision.compareToIgnoreCase("S")!=0 && decision.compareToIgnoreCase("N")!=0);
			} catch (Exception e) {}
		repetir= (decision.compareToIgnoreCase("S")==0);
		} while (repetir);
	}  	
	
 // Ejercicio 6 _____________________________________________________________________________
	
	
 {
		InputStreamReader isr = new InputStreamReader(System.in);
		Scanner leer= new Scanner (System.in);
		String decision = "";
		int suma=0;
		int resta=0;
		int multiplicacion=1;
		
		System.out.println("Ingresa un numero: ");
		int indicador= Integer.parseInt(leer.nextLine());
		resta=indicador*2;
		for(int cont=indicador; cont>=1;cont--)
			
		{
			suma+=cont;
			resta-=cont;
			multiplicacion*=cont;
		}
			System.out.println(suma);
			System.out.println(resta);
			System.out.println(multiplicacion);
				}
	



}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

