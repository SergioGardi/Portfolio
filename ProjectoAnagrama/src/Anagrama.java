import java.util.*;


public class Anagrama {
 private Map<Palabra, Set<Palabra>> anagramas;
 
 public Anagrama() {
  anagramas = new TreeMap<Palabra, Set<Palabra>>();
 }
 public Anagrama(Comparator<Palabra> cs) {
  anagramas = new TreeMap<Palabra, Set<Palabra>>(cs);
 }
 public void nuevaPalabra(String pal) {
  Palabra sPal = new Palabra(pal);
  if(!anagramas.containsKey(sPal)) {
   //Creo una nueva entrada en la aplicación
   //Creo el conjunto vacío
   Set<Palabra> conjunto = new TreeSet<Palabra>();
   anagramas.put(sPal, conjunto);
  
   for(Palabra p: anagramas.keySet()) {
    if(sPal.esAnagrama(p) && (!sPal.equals(p))) {
     Set<Palabra> con = anagramas.get(p);
     con.add(sPal);
     Set<Palabra> condof = anagramas.get(sPal);
     condof.add(p);
    
    }  
   }
  }
 }
 
 public void mostrarEnConsola() {
	  for( Palabra p : anagramas.keySet()) {
	   System.out.print(p + "\t (" );
	   for (Palabra p2 : anagramas.get(p)) {
	    if(!p.equals(p2)) System.out.print(p2 + " ");
	   }
	   System.out.println(")");
	  }
	 }
	}