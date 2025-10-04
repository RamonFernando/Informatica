/**
 * 
 */
package Unidad5Metodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio6conTFyCuadrado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 6.- Crea un método que tome un número decimal y devuelva su cuadrado.
		Scanner sc = new Scanner(System.in);
		double numero = 0;
		if (numero == 0) {
			System.out.println("Introduzca un numero: ");
			numero = sc.nextDouble();
		}
		
		System.out.println("Resultado: " + cuadrado(numero));
		System.out.printf("Resultado: %.2f", cuadrado(numero),"." );
		
		sc.close();

	}
	static double cuadrado(double numero){
		numero = Math.pow(numero, 2);
		
		return numero;
	}
}
