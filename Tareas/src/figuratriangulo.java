import java.util.*;
public class figuratriangulo {

	float a=0.0f;
	float b=0.0f;
	float r=0.0f;
	
	Scanner user=new Scanner(System.in);
	
	public static void main(String[] args) {
		figuratriangulo cant=new figuratriangulo();
		cant.execute();
	}
	
	public void execute() {
		System.out.println("Ingrese la base de la figura:");
		b=user.nextFloat();
		System.out.println("Ingrese la altura de la figura:");
		a=user.nextFloat();
		r=(b*a)/2;
		System.out.println("EL área de la figura es: " + r);
		
		
	}
	
	
	
	
	
}
