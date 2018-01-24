package com.potencia;

public class Potencia {

	    public int result;
	    
	    public int calcularPotencia(int N, int p){
	        result = N*N;
	        p--;
	        
	        while(p!=1){
	            result *= N;
	            p--;
	        }
	        return result;
	    }

		public static String showInputDialog(String string) {
			// TODO Auto-generated method stub
			return null;
		}

		public static void showMessageDialog(Object object, String string) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
