package com.generationhomework.semana3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class ArrayHandler {

	Scanner sc = new Scanner(System.in);

	public void AddElementAndSeeElements(int iItemsInArray) {
		int iIterator = 0;
		String szNewNameInArray;
		String[] arrNombres;
		arrNombres = new String[iItemsInArray];

		do {
			System.out.println("Ingresa un elemento en la posición " + iIterator + " del arreglo");
			szNewNameInArray = sc.next();
			arrNombres[iIterator] = szNewNameInArray.toUpperCase();
			iIterator++;
		} while (iIterator < arrNombres.length);

		System.out.println("Nombres introducidos en el arreglo de nombres: \n");

		for (int i = 0; i < arrNombres.length; i++) {
			System.out.print(arrNombres[i] + " ");
		}
	}

	public void AddNumberAndOperateWithNumbers(int iNumberToProcess) {

		int iNumberIntoArray;
		int iResultadoSuma;
		ArrayList<Integer> arrNumberList = new ArrayList<Integer>();

		for (int i = 0; i < iNumberToProcess; i++) {
			System.out.println("Introduce el número " + i);
			iNumberIntoArray = sc.nextInt();
			arrNumberList.add(iNumberIntoArray);
		}

		for (int i = 0; i < arrNumberList.size(); i++) {
			iResultadoSuma = arrNumberList.get(i) + arrNumberList.get(i);
			System.out.println("Número: " + i);
			System.out.println("Suma: " + iResultadoSuma);
			System.out.println("Restando: " + (arrNumberList.get(i) - 3));
			System.out.println("Multiplicando: " + arrNumberList.get(i) * 6);
			System.out.println("Elevando al cuadrado: " + Math.pow(arrNumberList.get(i), 2));
			System.out.println("Elevando al cubo: " + Math.pow(arrNumberList.get(i), 3));
			System.out.println("Sacar raiz cuadrada: " + Math.sqrt(arrNumberList.get(i)));
			System.out.println("Multiplicando por pi: " + arrNumberList.get(i) * Math.PI);
			System.out.println("********************************* \n");

		}

	}

	public void makingOperationsWithArrays(int iVectorSize, int iFactor) {
		ArrayList<Integer> arrPrincipalList = new ArrayList<Integer>();
		ArrayList<Integer> arrTempList = new ArrayList<Integer>();
		ArrayList<Integer> arrResultList = new ArrayList<Integer>();

		for (int i = 0; i < iVectorSize; i++) {
			arrPrincipalList.add(i);
			arrTempList.add(arrPrincipalList.get(i) * iFactor);
			arrResultList.add(arrPrincipalList.get(i) + arrTempList.get(i));
		}

		System.out.println("Arreglo inicial: " + arrPrincipalList);
		System.out.println("Arreglo multiplicado por " + iFactor + ": " + arrTempList);
		System.out.println("Resultado de la suma del arreglo inicial con el arreglo temporal: " + arrResultList);
	}

	public void generateArrayWithRandomNumbers(int iArraySize) {
		Random randNumber = new Random();
		randNumber.setSeed(999);
		ArrayList<Integer> listWithRandomNumbers = new ArrayList<Integer>();
		for (int i = 0; i < iArraySize; i++) {
			listWithRandomNumbers.add(randNumber.nextInt(9999));
		}

		System.out.println(listWithRandomNumbers);

	}

	public void generateArrayWithRandomNumbersSortedAscAndDesc(int iArraySize) {

		Random randNumber = new Random();
		randNumber.setSeed(3897);
		ArrayList<Integer> listWithRandomNumbers = new ArrayList<Integer>();
		Comparator<Integer> comparator = Collections.reverseOrder();

		for (int i = 0; i < iArraySize; i++) {
			listWithRandomNumbers.add(randNumber.nextInt(9999));
		}

		System.out.println("Sin orden: " + listWithRandomNumbers);
		Collections.sort(listWithRandomNumbers);
		System.out.println("Ordenado ascendentemente: " + listWithRandomNumbers);
		Collections.sort(listWithRandomNumbers, comparator);
		System.out.println("Ordenado descendentemente: " + listWithRandomNumbers);
	}

}
