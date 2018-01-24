package practica;
import java.util.*;

public class ListaAleatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ListaAleatorios = new ArrayList<Integer>();
		Random numeroAleatorio = new Random ();
		numeroAleatorio.setSeed(38765);

		for(int i=0;i<5;i++) {
			ListaAleatorios.add(numeroAleatorio.nextInt(100));
		}
		Iterator iterador = ListaAleatorios.iterator();
		
		while(iterador.hasNext())
		{
			System.out.println(iterador.next());
		}
		iterador = ListaAleatorios.iterator();
		for(Integer entero:ListaAleatorios) {
			System.out.println(entero);}
		
		
		
	}

}
