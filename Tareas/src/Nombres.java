import java.util.*;

public class Nombres {

//  Hacer un proyecto en Java que pida al usuario, 
//	cuantos nombres desea capturar. 
//	Leyenda de ingreso por cada nombre (1…5). 
//	Mostrar los nombres capturados por el usuario en una sola línea  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada;
		entrada = new Scanner(System.in);
				int nNames=0;
				ArrayList<String> lstNames =new ArrayList<String>();	
				
		System.out.println
		("Cuantos nombres quieres ingresar?");
		nNames=entrada.nextInt();
		for(int i=0;i<nNames;i++)
		{
			System.out.println("Ingresa un Nombre:" );
			lstNames.add(entrada.next());
		}
		Iterator contador= lstNames.iterator();
		
		while (contador.hasNext())
		{
			System.out.print(contador.next()+" ");
		}
		
		entrada.close();
		contador=null;
		lstNames=null;
		}

}
