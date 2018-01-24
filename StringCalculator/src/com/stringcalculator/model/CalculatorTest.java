package com.stringcalculator.model;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {
	
	StringCalculator calculadora;
	calculadora= new StringCalculator();
	int iqcaracteres;
	String cadena="1,2,3";
	int resultadoEsperado=3;
	
	@Test
	public void testIAdd() {
		iqcaracteres= calculadora.iAdd(cadena);
		assertEquals(resultadoEsperado, iqcaracteres,0);
	}

	@Test
	public void testFAdd() {
	}

}
