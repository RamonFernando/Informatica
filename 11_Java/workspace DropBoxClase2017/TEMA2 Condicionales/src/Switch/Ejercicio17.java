package Switch;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio17 {

	/**
	 * PDF-Ejercicio de Condicionales 17/22 
	 * Descripcion: Condicionales Ejercicio
	 * con Switch. 
	 */
	public static void main(String[] args) {
		// Calculadora. Crea un programa que pregunte dos números al usuario. A
		// continuación mostrará un menú similar a éste:
		// 1) Suma
		// 2) Resta
		// 3) Multiplicacion
		// 4) Division
		// El usuario escribirá el número correspondiente a la operación que
		// desea. Entonces se mostrará el resultado.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca dos numeros: ");
		System.out.println("=======================");
		double num1 = teclado.nextDouble();
		double num2 = teclado.nextDouble();

		System.out.println("Calculadora");
		System.out.println("Elija una opcion: ");
		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multiplicación");
		System.out.println("(4) Divisiòn");

		int opc = teclado.nextInt();

		switch (opc) {
		case 1:
			double suma = num1 + num2;
			System.out.println("(1) Suma ");
			System.out.println((num1) + " + " + (num2) + " = " + suma);

			break;
		case 2:
			double resta = num1 - num2;
			System.out.println("(2) Resta ");
			System.out.println((num1) + " - " + (num2) + " = " + resta);
			break;
		case 3:
			double multiplicacion = num1 * num2;
			System.out.println("(3) Multiplicación ");
			System.out
					.println((num1) + " * " + (num2) + " = " + multiplicacion);
			break;
		case 4:
			double division = num1 / num2;
			System.out.println("(4) Division ");
			System.out.println((num1) + " % " + (num2) + " = " + division);
			break;
		default:
			System.out
					.println("Introduce un número del 1 al 4 para determinar la operacion deseada.");
		}

		teclado.close();

	}

}
