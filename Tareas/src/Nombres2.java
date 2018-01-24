import java.util.*; 
public class Nombres2 {                              //con metodos
	public static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int nNames=0;
		ArrayList<String> lstNames= new ArrayList<String>();
		
		System.out.println("How many names do you want to capture: ");
		nNames=entrada.nextInt();
		captureNames(nNames,lstNames);
		System.out.println(lstNames);
	}
	public static void captureNames(int qNames,ArrayList<String> lista)
	{
		for(int i=0;i<qNames;i++)
		{
			System.out.println("Input a Name :" );
			lista.add(entrada.next());
		}
			
	
	}
}
