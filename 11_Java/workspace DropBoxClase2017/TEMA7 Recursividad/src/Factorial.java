public class Factorial {

	/**
	 * Método con el que se inicia la aplicación.
	 * 
	 * @param args
	 *            Argumentos pasados desde la línea de comandos.
	 */
	public static void main(String[] args) {

		System.out.print("Escribe un número entero positivo: ");
		int num = Entrada.leeInt();

		System.out.println("El factorial de " + num + " es " + factorial(num));

	}

	public static int factorial(int n) {

		if (n == 0) {
			// Caso base
			return 1;
		} else {
			// Caso recursivo
			return n * factorial(n - 1);
		}

	}
}
