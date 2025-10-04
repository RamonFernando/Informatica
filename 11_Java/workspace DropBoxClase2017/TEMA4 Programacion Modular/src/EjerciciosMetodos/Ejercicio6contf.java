/**
 * 
 */
package EjerciciosMetodos;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio6contf{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 6.- Crea un método que tome un número decimal y devuelva su cuadrado.
		Scanner sc = new Scanner(System.in);
		double numero = 0;
		
		System.out.println("Introduce un numero: ");
		numero = sc.nextDouble();
		
		
		System.out.println("Resultado: " + cuadrado(numero));
		System.out.printf("Resultado: %.4f", cuadrado(numero));
		
		
		sc.close();
		
		
		

	}
	static double cuadrado(double numero){
		numero = numero*numero;
		return numero;
	}
	
}
