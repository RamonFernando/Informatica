/**
 * 
 */
package EjerciciosMetodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio7ReturnCubo {

	/**
	 * Con cubo
	 */
	public static void main(String[] args) {
		// 7.- Crea un método que tome un número decimal y devuelva su cubo.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero para saber su cubo: " );
		double numero = sc.nextDouble();
		
		System.out.printf("Resultado: %.2f", cubo(numero));
		
		
		sc.close();

	}
	static double cubo(double numero){
		// numero = numero*numero*numero;
		numero = Math.pow(numero, 3);
		return numero;
	}
}
