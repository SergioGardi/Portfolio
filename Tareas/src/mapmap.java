import java.util.*;
public class mapmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 HashMap <Integer,String> hm=new HashMap<Integer,String>();
 hm.put(100," Sergio");
 hm.put(101," Norma");
 hm.put(102," Kako");
 hm.put(103," Jonathan");
 hm.put(104," Cesar");
 hm.put(105," Mauricio");
 
 for(Map.Entry m:hm.entrySet()) {
	 System.out.println(m.getKey()+""+m.getValue());
	  }
 	}
}