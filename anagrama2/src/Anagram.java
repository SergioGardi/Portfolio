import java.util.*;


public class Anagram {
	
	public static void main (String args[]) {
		Scanner r = new Scanner(System.in);
		//Read a string from the user
		System.out.print("Enter a string:"); 
		String s = r.toString(); 
		r.toString(); 

		//We convert the string to an array of characters. Basically
		//we want to freely change the letters in the string, and this
		//is not possible with class String, and is too cumbersome
		//with class StringBuffer.
		char[] text = new char[s.length()]; 
		for (int i=0; i<s.length(); i++) text[i] = s.charAt(i);
				
		System.out.println("Here are all the anagrams of " + s);
		makeAnagram(text, 0); 
		System.out.println("Goodbye!");
	}

	private static void makeAnagram(char[] text, int i) {
		// TODO Auto-generated method stub
		
	}
}
