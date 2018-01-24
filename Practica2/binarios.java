import java.util.*;
public class binarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, exp, digito;
		double binario;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		
	do{  
	System.out.println("Introduce un numero entero: ");
	numero = sc.nextInt();
	}

	while(numero==0);

	exp=0;
	binario=0;
	while(numero!=0){
	digito = numero % 2;            
	binario = binario + digito * Math.pow(10, exp);   
	exp++;
	numero = numero/2;
		        }
		        System.out.printf("Binario: %.0f %n", binario);
		    }

		
		
		
		
		
		
		
		
		
		
		
		
	}

