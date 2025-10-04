package EjerciciosRecursivos;

public class Ejercicio7 {

	public static void main(String[] args) {

		int x = 4579;
		System.out.println("Original: " + x);
		System.out.println("Girado: " + invertir(x));

	}

	public static String invertir(int n) {

		if (n < 10) {
			// Caso base: Tenemos un número de una sola cifra.
			return String.valueOf(n);
		} else {
			// Caso recursivo
			return n % 10 + invertir(n / 10);
		}

	}

}
