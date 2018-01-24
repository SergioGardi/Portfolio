
import java.util.*;

public class nombreencaja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String eseTexto;
		
		System.out.println("Input Text:");
		eseTexto = entrada.next();
		
		cajita(eseTexto.length(), eseTexto);
	}
	
	public static void guiones(int largo)
	{
		//System.out.print("");
		for(int i=0;i<largo+1;i++)
		{
			System.out.print("-");
		}
		System.out.println("¬");
	}
	public static void espacios(int largo)
	{
		System.out.print("|");
		for(int i=0;i<largo;i++)
		{
			System.out.print(" ");
		}
		System.out.println	("|");
	}
	public static void mensaje(String mensaje)
	{
		System.out.print("|");
		System.out.print(mensaje);
		System.out.println("|");
	}
	public static void cajita(int longitud,
			String msg)
	{
		guiones(msg.length());
		espacios(msg.length());
		espacios(msg.length());
		mensaje(msg);
		espacios(msg.length());
		espacios(msg.length());
		guiones(msg.length());
	}
}