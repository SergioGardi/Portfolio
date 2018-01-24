import java.util.*;
package listasDeMenu;

public class Escuela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		menuPrincipal();
		
	}
	public static void menuPrincipal()
	{
		Scanner entrada = new Scanner(System.in);
		byte respuesta;
		
		public static void menuAltas()
		{
			Scanner entrada = new Scanner(System.in);
			byte respuesta;
			
			do
			{
				System.out.println("1. Administrar Maestros");
				System.out.println("2. Administrar Alumnos");
				System.out.println("3. Administrar Cursos");
				System.out.println("4. Administrar Salones");
				System.out.println("5. Administrar Asignaciones");
				System.out.println("6. Salir");
				System.out.print("Ingresa una opción:");
				respuesta = entrada.nextByte();
				switch(respuesta)
				
				{
				case 1: System.out.println("Seleccionaste Administrar Maestros");
				break;
				case 2: System.out.println("Seleccionaste Administrar Alumnos");
				break;
				case 3: System.out.println("Seleccionaste Administrar Cursos");
				break;
				case 4: System.out.println("Seleccionaste Administrar Salones");
				break;
				case 5: System.out.println("Seleccionaste Administrar Asignaciones");
				break;
				case 6: System.out.println("Seleccionaste Salir");
				break;
				}
			}while(respuesta<6);
		}
	}
	public static void menuEmpleados()
	{
		Scanner entrada = new Scanner(System.in);
		byte respuesta;
		do
		{
			System.out.println("1. Agregar Empleados");
			System.out.println("2. Eliminar Empleados");
			System.out.println("3. Modificar Empleados");
			System.out.println("4. Salir");
			System.out.print("Ingresa una opción:");
			respuesta = entrada.nextByte();
			switch(respuesta)
			{
			case 1: menuAgregarEmpleados();
			break;
			case 2: System.out.println("Seleccionaste Eliminar Empleado");
			break;
			case 3: System.out.println("Seleccionaste Modificar Empleado");
			break;
			case 4: System.out.println("Seleccionaste Salir");
			break;
			}
		}while(respuesta<4);
	}
	
	public static void menuAgregarEmpleados()
	{
		Scanner entrada = new Scanner(System.in);
		byte respuesta;
		do
		{
			System.out.println("1. Agregar Cocineros");
			System.out.println("2. Agregar Cajeros");
			System.out.println("3. Agregar Repartidores");
			System.out.println("4. Salir");
			System.out.print("Ingresa una opción:");
			respuesta = entrada.nextByte();
			switch(respuesta)
			{
			case 1: agregarCocinero();
			break;
			case 2: System.out.println("Seleccionaste Eliminar Empleado");
			break;
			case 3: System.out.println("Seleccionaste Modificar Empleado");
			break;
			case 4: System.out.println("Seleccionaste Salir");
			break;
			}
		}while(respuesta<4);
	}

}