import java.util.*;
public class binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in= new Scanner (System.in);
		System.out.println("Ingresa un numero binario:");
		long binary=in.nextLong();
		int p=0;
		long decimal=0;
		
		while(binary!=0)
		{
			long res=binary%10;
			binary =binary/10;
			decimal +=res*Math.pow(2, p);
			p++;
			
			System.out.println(res);
			System.out.println(binary);
			System.out.println(decimal);
			System.out.println("++++++++");
		}
		System.out.print("El numero decimal es: " + decimal);
			
	}

}
