package practica;
import java.util.*;

public class VectoresEjemplo {

	public static void main(String args[]) {

	Vector<String> v= new Vector<String>();
	v.add("umesh");
	v.addElement("irfan");
	v.addElement("krumar");
	
	Enumeration e=v.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());	}
	}
		
}
