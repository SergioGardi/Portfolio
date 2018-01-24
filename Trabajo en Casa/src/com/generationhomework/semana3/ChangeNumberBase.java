package com.generationhomework.semana3;

public class ChangeNumberBase {

	public int BinaryToBase10(String szNumberInBinary) {

		String[] parts = szNumberInBinary.split("");

		System.out.println("Binario: " + szNumberInBinary);
		int iDecimal = 0;
		int exp = 0;
		for (int i = parts.length - 1; i >= 0; i--) {
			System.out.println("Bit: " + parts[i]);
			iDecimal += Integer.parseInt(parts[i]) * Math.pow(2, exp);
			exp++;
		}
		
		return iDecimal;
	}
}
