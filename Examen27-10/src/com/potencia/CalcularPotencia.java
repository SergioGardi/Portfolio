package com.potencia;
import java.util.*;
public class CalcularPotencia {



    public static void main(String[] args) {
	        Potencia obj01 = new Potencia();
	        int N = Integer.______(Potencia.showInputDialog("ELEVAR UN N�MERO A LA POTENCIA\n"
	                + "Ingresa un n�mero"));
	        int p = Integer.parseInt(Potencia.showInputDialog("ELEVAR UN N�MERO A LA POTENCIA\n"
	                + "Ingresa la potencia"));
	        obj01.calcularPotencia(N,p);
	        Potencia.showMessageDialog(null, "El resultado de "+N+" elevado a la potencia "+
	                p+" es "+obj01.result);
	    }
	    
	}

