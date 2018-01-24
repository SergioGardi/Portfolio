import java.util.*;
public class Clase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner datos=new Scanner(System.in);
		byte bMeses;
		
	do
	{
		System.out.println("Introduce el numero de mes:" );
		bMeses=datos.nextByte(); 
		String sRespuesta;
				
		switch (bMeses) {
		case 1: System.out.println("Enero");
		break;		
		case 2: System.out.println("Febrero");
		break;
		case 3: System.out.println("Marzo");
		break;
		case 4: System.out.println("Abril");
		break;
		case 5: System.out.println("Mayo");
		break;
		case 6: System.out.println("Junio");
		break;
		case 7: System.out.println("Julio");
		break;
		case 8: System.out.println("Agosto");
		break;
		case 9: System.out.println("Septiembre");
		break;
		case 10: System.out.println("Octubre");
		break;
		case 11: System.out.println("Noviembre");
		break;
		case 12: System.out.println("Diciembre");
		break;
		default: System.out.println("Numero Incorrecto");
		break;
	}
	System.out.println("Otro Número? ");
	sRespuesta=datos.nextLine();
	} while (sRespuesta.equals("s") || sRespuesta.equal("S"));
	
	try {
		do {
		System.out.println("Desea ingresar otro numero (S=Si/N=No): ");
		bMeses = sRespuesta.readLine();
		} while(bMeses.compareToIgnoreCase("S")!=0 && numero.compareToIgnoreCase("N")!=0);
		
		} catch (Exception e) {}
	repetir=false;
	if (bMeses.compareToIgnoreCase("S")==0)
		repetir=true;
	}
	while (repetir);			
}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
		
		
		
		
		
		
		
		
	}

}
