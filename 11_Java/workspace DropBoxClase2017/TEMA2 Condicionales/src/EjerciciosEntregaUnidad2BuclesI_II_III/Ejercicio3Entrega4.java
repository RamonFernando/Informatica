/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio3Entrega4 {

	/**
	 * PDF-Ejercicios III Bucles y Condicionales
	 * {@link Ejercicio3Entrega4}
	 */
	public static void main(String[] args) {
		// 4.- Modifica el programa anterior para que después de decir el
		// resultado te haga la siguiente
		// pregunta:
		// ¿Quieres continuar (s/n)?
		// Si la respuesta es 's', volverá a empezar el bucle. Si la respuesta
		// es cualquier otra, acabará el
		// programa, con un mensaje de despedida.

		Scanner sc = new Scanner(System.in);

		System.out.println("Juego de adivinar la Suma");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		int num1;
		int num2;
		int num3 = 0;
		int resultado;
		char i = 's';
		char n = 'n';
		

		while (num3 != n) {
			num1 = (int) (Math.random() * 100 + 1);
			num2 = (int) (Math.random() * 100 + 1);

			resultado = num1 + num2;

			System.out.println("Introduzca el resultado: " + num1 + " + " + num2 + " = ?");
			num3 = sc.nextInt();
			
			

			if (num3 == resultado) {
				System.out.println("Has acertado!");
			} else {
				System.out.println("Has fallado!" + " el resultado es: " + resultado);
			}
			System.out.println("Quieres continuar? S/N...");
			num3 = sc.next().charAt(0);
			
			}
		if (num3 == i) {
			num1 = (int) (Math.random() * 100 + 1);
			num2 = (int) (Math.random() * 100 + 1);
			System.out.println("Introduzca el resultado: " + num1 + " + " + num2 + " = ?");
			num3 = sc.nextInt();
		}
		if (num3 != i) {

			System.out.println("\n*=*=*=*=*=*=*=*=*=*=*");
			System.out.println("  Fin del programa");
		
		}

		sc.close();

	}

}
