
public class Client {

	public static void main(String[] args) {
		
		Employee eRef = new Employee();
		eRef.seteId(101);;
		eRef.seteName("Sergio Garc�a");
		eRef.seteAdress("Morelia");
		
		System.out.println("Employee Details"+ eRef);
	}
}
