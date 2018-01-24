import java.util.*;
public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        int n;
	        System.out.print("Introduce un número: ");
	        n = sc.nextInt();
	        System.out.println("Tabla del " + n);
	        for(int i = 1; i<=12; i++){
	             System.out.println(n + " * " + i + " = " + n*i);
	        }
	    }
	}