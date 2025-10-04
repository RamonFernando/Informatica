package EjerciciosRecursivos;

public class Ejercicio8 {

	public static void main(String[] args) {

		int x = 9172;
		System.out.println("La suma de las cifras del número " + x + " es "
				+ sumar(x));

	}

	public static int sumar(int n) {

		if (n < 10) {
			// Caso base: El número es de una sola cifra.
			return n;
		} else {
			// Caso recursivo.
			return n % 10 + sumar(n / 10);
		}

	}

}
