package practica;
import java.io.*;


public class PracticasStreams {

	public static void main(String[] args) throws IOException { 
	{
		// TODO Auto-generated method stub
			
			// 1a. Se lee un file línea a línea 
			
			BufferedReader in = new BufferedReader( new 	
					FileReader("c:\\a\\a.jpg")); 
			String s = new String(); 
			while( (s = in.readLine()) != null) 
			{
				System.out.println(s);
			}
			
			in.close(); 
			
			BufferedWriter bw= new BufferedWriter(new FileWriter("c:\\a\\b.txt"));
			bw.write("Este es mi nuevo testo desde Eclipse");
			bw.close();
			
			
		}

	}

}
