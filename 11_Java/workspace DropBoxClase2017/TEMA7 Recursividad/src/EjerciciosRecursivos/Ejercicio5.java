package EjerciciosRecursivos;

public class Ejercicio5 {

	public static void main(String[] args) {

		System.out.println(suma(5));

	}

	public static int suma(int n) {
		if (n == 1) {
			// Caso base
			return 1;
		} else {
			// Caso recursivo
			return n + suma(n - 1);
		}
	}
}
