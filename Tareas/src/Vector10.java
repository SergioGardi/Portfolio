import java.util.*;
public class Vector10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int v1[]= {10,20,30,40,50,60,70,80,90,100};
		int[] v2=new int [10];
		int[] rv=new int [10];
		
		System.out.print(Arrays.toString(v1));
		System.out.println(" ");
	
		for (int i=0;i<v1.length;i++)
		{ 
		v2[i]=v1[i]*2;
		System.out.print(v2[i]+" ");
		}
		System.out.println(" ");
		int i=0;
		for(int r=0; r<v1.length;r++);
		rv[i]=v1[i]+v2[i];
		
		
		
		
		
	}

}
