package com.operaciones.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSumar {

	@Test
	public void test() {
		
		OperacionesMatematicas test;
		test=new OperacionesMatematicas();
		test.setNumero1(1);
		test.setNumero2(2);
		float result  = test.sumar();
		float result1 = test.restar();
		float result2 = test.dividir();
		float result3 = test.multiplicar();
		
		assertTrue(result==3);
		assertTrue(result1==1);
		assertTrue(result2==1);
		assertEq

	}
}
