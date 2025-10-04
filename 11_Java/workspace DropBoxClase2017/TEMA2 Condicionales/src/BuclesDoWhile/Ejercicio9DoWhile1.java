/**
 * 
 */
package BuclesDoWhile;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio9DoWhile1 {

	/**
	 * PDF-Ejercicio de Bucles 9-4/22
	 * Ejercicio 9 Operacion con resto en DoWhile.
	 */
	public static void main(String[] args) {
		// - Escribe un programa que pida y calcule el resto de una división entre
				//  2 numeros enteros con el procedimiento de ir restando repetidamente el divisor
				// del dividendo hasta que el resultado es menor que el divisor.

				// Ejemplo de esta operación: 20 % 6
				// 20 - 6 = 14
				// 14 – 6 = 8
				// 8 – 6 = 2 Ahí paramos, ya que la resta da un número menor que 6. El
				// resto vale 2.
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
			
		System.out.println("Introduce dividendo: ");
		num1 = sc.nextInt();
		System.out.println("Introduce divisor: ");
		num2= sc.nextInt();
		System.out.println("Division entre enteros");
		System.out.println("======================");
		do{
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			num1 = num1 - num2;
		}while(num1>num2);
			System.out.println("El resto es: " + (num1%num2));
		
		
		
		
		sc.close();

	}

}
