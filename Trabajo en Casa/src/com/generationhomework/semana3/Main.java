package com.generationhomework.semana3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayHandler ah = new ArrayHandler();
		ChangeNumberBase cn = new ChangeNumberBase();
		Cuadrado cuadrado = new Cuadrado();
		Rectangulo rectangulo = new Rectangulo();
		Circulo circulo = new Circulo();
		Triangulo triangulo = new Triangulo();
		Trapecio trapecio = new Trapecio();
		Rombo rombo = new Rombo();

		// ******************
		// Hacer un algoritmo que pida al usuario cuantos nombres desea capturar. y
		// porsteriormente
		// mostrar los nombres capturados por el usuario en una sola linea.
		// int iItemsInArray;
		//
		// System.out.println("Indica cuántos nombres se desean capturar en el
		// arreglo");
		// iItemsInArray = sc.nextInt();
		// ah.AddElementAndSeeElements(iItemsInArray);

		// ******************
		float fBase;
		float fHeight;
		float fRadio;
		float fSide;
		float fMajorBase;
		float fMinorBase;
		float fLeftOblique;
		float fRightOblique;
		float fMajorDiagonal;
		float fMinorDiagonal;
		byte bOpc = 1;

		do {

			System.out.println("Ingresa una opción");
			System.out.println("1.- Cuadrado");
			System.out.println("2.- Rectangulo");
			System.out.println("3.- Círculo");
			System.out.println("4.- Triángulo Equilátero");
			System.out.println("5.- Trapecio");
			System.out.println("6.- Rombo");
			System.out.println("7.- Salir");
			bOpc = sc.nextByte();
			switch (bOpc) {
			case 1:
				System.out.println("Ingresa la base del cuadrado en cm");
				fBase = sc.nextFloat();
				cuadrado.setfBase(fBase);
				System.out.println("Ingresa la altura del cuadrado en cm");
				fHeight = sc.nextFloat();
				cuadrado.setfHeight(fHeight);
				System.out.println("Área del cuadrado: "
						+ cuadrado.calculateArea(cuadrado.getfBase(), cuadrado.getfHeight()) + " cm^2");
				System.out
						.println("Perímetro del cuadrado: " + cuadrado.calculatePerimeter(cuadrado.getfBase()) + " cm");
				break;
			case 2:
				System.out.println("Ingresa la base del rectángulo en cm");
				fBase = sc.nextFloat();
				rectangulo.setfBase(fBase);
				System.out.println("Ingresa la altura del rectángulo en cm");
				fHeight = sc.nextFloat();
				rectangulo.setfAltura(fHeight);
				System.out.println("Área del rectángulo: " + rectangulo.calculateArea(fBase, fHeight) + " cm^2");
				System.out
						.println("Perímetro del rectángulo: " + rectangulo.calculatePerimeter(fBase, fHeight) + " cm");
				break;
			case 3:
				System.out.println("Ingresa el radio del círculo en cm");
				fRadio = sc.nextFloat();
				circulo.setRadio(fRadio);
				System.out.println("Área del círculo: " + circulo.calculateArea(fRadio) + " cm^2");
				System.out.println("Perímetro del rectángulo: " + circulo.calculatePerimeter(fRadio) + " cm");
				break;
			case 4:
				System.out.println("Ingresa un lado del triángulo en cm");
				fSide = sc.nextFloat();
				triangulo.setfSide(fSide);
				System.out.println("Ingresa la altura del triangulo en cm");
				fHeight = sc.nextFloat();
				triangulo.setfHeight(fHeight);
				System.out.println("Área del triángulo: " + triangulo.calculateArea(fSide, fHeight) + " cm^2");
				System.out.println("Perímetro del triángulo: " + triangulo.calculatePerimeter(fSide) + " cm");
				break;
			case 5:
				System.out.println("Ingresa la base mayor en cm");
				fMajorBase = sc.nextFloat();
				trapecio.setfMajorBase(fMajorBase);
				System.out.println("Ingresa la base menor en cm");
				fMinorBase = sc.nextFloat();
				trapecio.setfMinorBase(fMinorBase);
				System.out.println("Ingresa el oblicuo izquierdo en cm");
				fLeftOblique = sc.nextFloat();
				trapecio.setfLeftOblique(fLeftOblique);
				System.out.println("Ingresa el oblicuo derecho del trapecio en cm");
				fRightOblique = sc.nextFloat();
				trapecio.setfRightOblique(fRightOblique);
				System.out.println("Ingresa la altura del trapecio cm");
				fHeight = sc.nextFloat();
				trapecio.setfHeight(fHeight);
				System.out.println(
						"Área del trapecio: " + trapecio.calculateArea(fMajorBase, fMinorBase, fHeight) + " cm^2");
				System.out.println("Perímetro del trapecio: "
						+ trapecio.calculatePerimeter(fMajorBase, fMinorBase, fLeftOblique, fRightOblique) + " cm");
				break;
			case 6:
				System.out.println("Ingresa la medida del lado de tu rombo cm");
				fSide = sc.nextFloat();
				rombo.setfSide(fSide);
				System.out.println("Ingresa la diagonal menor de tu rombo en cm");
				fMinorDiagonal = sc.nextFloat();
				rombo.setfMinorDiagonal(fMinorDiagonal);
				System.out.println("Ingresa la diagonal mayor de tu rombo en cm");
				fMajorDiagonal = sc.nextFloat();
				rombo.setfMajorDiagonal(fMajorDiagonal);

				System.out.println("Área del rombo: " + rombo.calculateArea(fMajorDiagonal, fMinorDiagonal) + " cm^2");
				System.out.println("Perímetro del rombo: " + rombo.calculatePerimeter(fSide) + " cm");
				break;
			case 7:
				break;
			default:
				System.out.println("Escoge una opción correcta");
				break;
			}

		} while (bOpc != 7);
		System.out.println("El programa ha finalizado");

		// ******************
		// Pedir al usuario que diga cuantos números desea procesar, si dice 3,
		// indicar que introduzca el numero1, numero2, numero3 posteriormente sumarlo,
		// restarlo multiplicarlo,
		// elevarlos al cuadrado, elevarlos al cubo, sacar su raiz cuadrada,
		// multiplicarlos cada uno por pi

		// int iNumberToProcess = 0;
		// System.out.println("Ingresa cuántos números quieres capturar en el arreglo");
		// iNumberToProcess = sc.nextInt();
		// ah.AddNumberAndOperateWithNumbers(iNumberToProcess);

		// ******************
		// Crear un vector de 100 elementos, multiplicarlo por 2 y guardarlo en otro
		// vector, después
		// sumar el vector resultante con el primer vector.

		// int iVectorSize = 0;
		// int iFactor = 0;
		//
		// System.out.println("Indica cuántos números deseas que tenga tu lista
		// principal");
		// iVectorSize = sc.nextInt();
		// System.out.println("Por cuánto deseas multiplicar tu arreglo principal?");
		// iFactor = sc.nextInt();
		//
		// ah.makingOperationsWithArrays(iVectorSize, iFactor);

		// ******************
		// Crear un vector de 100 elementos con números aleatorios.

		// int iArraySize = 0;
		// System.out.println("Cuántos espacios necesitarás que tenga tu arreglo?");
		// iArraySize = sc.nextInt();
		// ah.generateArrayWithRandomNumbers(iArraySize);

		// Generar un vector de números aleatorios, generar un segundo vector con los
		// elementos acomodados ascendentemente
		// y un tercer vector que ordene los elementos de forma descendente.

		// int iArraySize = 0;
		// System.out.println("Cuántos espacios necesitarás que tenga tu arreglo?");
		// iArraySize = sc.nextInt();
		// ah.generateArrayWithRandomNumbersSortedAscAndDesc(iArraySize);

		// ******************************
		// Pedir al usuario un número binario y convertirlo a base 10

		// String szBinary;
		// System.out.println("Ingresa el número binario :");
		// szBinary=sc.nextLine();
		// System.out.println(cn.BinaryToBase10(szBinary));

		sc.close();

	}

}
