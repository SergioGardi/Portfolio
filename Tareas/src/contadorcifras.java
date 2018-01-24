import java.util.*;
public class contadorcifras {

	
	public static void main(String[] args) {
		int cifra=0;
		int numero;
		String cadena;
		Scanner sc=new Scanner (System.in);
		System.out.println("Cuantas cifras vas a ingresar? :");
		cifra=sc.nextInt();
		for(int i=0;i<cifra;i++) {
			System.out.println("Ingrese la cifra: "+(i+1));
			numero=sc.nextInt();
			cadena=Integer.toString(numero);
			System.out.println("El Numero "+numero+" tiene "+cadena.length()+" digitos");
			
		}
	}
	
	
	
}
