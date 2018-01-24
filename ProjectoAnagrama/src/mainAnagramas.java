

public class mainAnagramas {

	public static void main (String[] args) {
		  System.out.println("Orden Natural");
		  Anagrama an1 = new Anagrama();
		  for (String arg: args) {
		   an1.nuevaPalabra(arg);
		  }
		  an1.mostrarEnConsola();
		  System.out.println();
		  System.out.println("Orden Alternativo");
		  Anagrama an2 = new Anagrama(new SatPalabra());
		  for (String arg: args) {an2.nuevaPalabra(arg);
		  }
		  an2.mostrarEnConsola();
	 }
}

