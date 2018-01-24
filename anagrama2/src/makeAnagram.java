
public class makeAnagram {

	static void makeAnagram(char[] a, int i) {
		//System.out.println("MakeAnagram i=" + i); //for debug
		if (i == a.length-1)printArray(a);
		else {
			for (int j=i; j< a.length; j++) {
				//swap a[i] with a[j]
				char c = a[i]; 
				a[i] = a[j]; 
				a[j] = c;
				makeAnagram(a, i+1);
				//swap back
				c = a[i]; 
				a[i] = a[j]; 
				a[j] = c;
			}
		}
	}

	private static void printArray(char[] a) {
		for (int i=0; i< a.length; i++) System.out.print(a[i]); 
		System.out.println();
	} //end of printArray	
}
