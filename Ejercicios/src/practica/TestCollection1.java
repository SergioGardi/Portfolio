package practica;
import java.util.*;

public class TestCollection1 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
//System.out.println("Estamos en la práctica 1");
		
// Creamos la Coleccion
		
	ArrayList<String> list= new ArrayList<String>();
	
// Crear los elementos del Arraylist
	
	list.add("Testo");
	list.add("TestoOtraVez");
	list.add("TestoNuevamente");
	list.add("TestoUnaVezMas");		
	
	Iterator itr = list.iterator();
	
	while(itr.hasNext());
	{
	System.out.println(itr.next());
	}
	
	}

}
