/**
 * 
 */
package RepasoEntregaBucles;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicios3y4C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 3.- Crea una aplicación para probar la capacidad de cálculo mental de
		// los usuarios. Se calcularán
		// dos números aleatorios entre 1 y 100 y se mostrarán en pantalla. A
		// continuación el usuario deberá
		// escribir el resultado de la suma de ambos números y se le indicará si
		// ha acertado o no.
		// Estas acciones se repetirán indefinidamente mediante un bucle
		// while.

		try {
			Scanner sc = new Scanner(System.in);
			int num1 = 0;
			int num2 = 0;
			int suma = 0;
			int valor = 0;
			boolean a = true;
			char respuesta = 's';
			char respuesta1 = 'n';
			
			while (a) {

				num1 = (int) (Math.random() * 10 + 1);
				num2 = (int) (Math.random() * 10 + 1);
				suma = num1 + num2;

				for (int i = 1; i < 4; i++) {
					System.out.println(i + "º intento");
					System.out.println(num1 + " + " + num2 + " = " + "?");
					valor = sc.nextInt();

					if (i >= 3 && suma != valor) {
						System.out.println("Has fallado el resultado es: " + suma);
						break;
					}
					if (suma == valor) {
						System.out.println("Has acertado!");
						break;
					}
				}
				while (true) {
					System.out.println("Desea continuar ? s/n");
					valor = sc.next().charAt(0);
					if (valor == 's' || valor == 'S') {
						a = true;
						break;
						// continue;
					} else if (valor == 'n' || valor == 'N') {// if(respuesta == 'n') {
						a = false;
						break;

					}
				}
			}
			System.out.println("Fin del programa");
			sc.close();
		} catch (Exception e) {
			System.out.println("Tipo de error " + e.toString());
			System.out.println("Fin del Programa");
		}
	}
}
