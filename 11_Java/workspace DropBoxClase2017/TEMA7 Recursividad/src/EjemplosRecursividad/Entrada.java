package EjemplosRecursividad;

import java.util.Scanner;

public class Entrada {

	/**
	 * Lee un número entero desde la consola y lo devuelve. Si el usuario
	 * escribe una entrada incorrecta, se le vuelve a preguntar indefinidamente.
	 * 
	 * @return Número leído desde la terminal.
	 */
	public static int leeInt() {

		Scanner entrada = new Scanner(System.in);

		String num;
		int numero = 0;
		boolean correcto = false;

		while (!correcto) {

			try {
				num = entrada.nextLine();
				numero = Integer.parseInt(num);
				correcto = true;
			} catch (Exception e) {
				System.out.println("Entrada incorrecta. Inténtelo de nuevo.");
			}
		}

		return numero;

	}

	/**
	 * Lee número decimal (float) desde la consola y lo devuelve. Si pone mal se
	 * vuelve a preguntar. --> Main2.java
	 * 
	 * @return Número devuelto
	 * 
	 */
	public static float leeFloat() {
		Scanner entrada = new Scanner(System.in);

		String num;
		float numero = 0F;

		while (true) {

			try {
				num = entrada.nextLine();
				numero = Float.parseFloat(num);
				break;

			} catch (Exception e) {
				System.err.println("Intentelo de nuevo: ");
			}
		}

		return numero;
	}

	/**
	 * Lee número decimal (double) desde la consola y lo devuelve. Si pone mal
	 * se vuelve a preguntar. --> Main2.java
	 * 
	 * @return Número devuelto
	 * 
	 */
	public static double leeDouble() {
		Scanner entrada = new Scanner(System.in);

		String num;
		double numero = 0;

		while (true) {

			try {
				num = entrada.nextLine();
				numero = Double.parseDouble(num);
				break;

			} catch (Exception e) {
				System.err.println("Intentelo de nuevo: ");
			}
		}

		return numero;
	}

}
