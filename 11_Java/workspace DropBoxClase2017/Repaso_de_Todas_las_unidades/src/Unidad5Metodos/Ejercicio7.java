/**
 * 
 */
package Unidad5Metodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 7.- Crea un método que tome un número decimal y devuelva su cubo.
		Scanner sc = new Scanner(System.in);
		double numero=0;
		System.out.println("Introduce un numero para ver su cubo: ");
		numero = sc.nextDouble();
		System.out.printf("Resultado: %.3f",cubo(numero));
		
		
		sc.close();
		

	}
	static double cubo(double numero){
		numero = Math.pow(numero, 3);
		return numero;
	}
	
}
