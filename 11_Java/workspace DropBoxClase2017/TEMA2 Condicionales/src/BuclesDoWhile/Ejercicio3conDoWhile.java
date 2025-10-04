package BuclesDoWhile;

import java.util.Scanner;
/**
 * 
 * @author Ramon
 *
 */

public class Ejercicio3conDoWhile {
	/**
	 * 
	 * PDF-Ejercicio de Bucles 3-1/22
	 * Con DoWhile
	 */

	public static void main(String[] args) {
		// 3.- Escribe una aplicación que pregunte repetidamente un número
		// entero hasta que el usuario escriba un valor entre 1 y 10. A
		// continuación el programa escribirá un mensaje informando del número
		// introducido.
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		
		do{
			System.out.println("Escriba un numero entre 1 y 10 ");
			num = sc.nextInt();
			
		}while(num <1 || num > 10);
			System.out.println("Numero: " + num);
		sc.close();
		
	}

}
