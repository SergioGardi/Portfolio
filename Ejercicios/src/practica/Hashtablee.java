package practica;
import java.util.*;

public class Hashtablee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> hm=new Hashtable<Integer, String>();
		
		hm.put(100, " Amit");
		hm.put(102, " Ravi");
		hm.put(103, " Vijay");
		hm.put(104, " Rahul");
		
		for (Map.Entry m:hm.entrySet()){
		System.out.println(m.getKey()+""+m.getValue());
	}
		
		
		
	}

}
