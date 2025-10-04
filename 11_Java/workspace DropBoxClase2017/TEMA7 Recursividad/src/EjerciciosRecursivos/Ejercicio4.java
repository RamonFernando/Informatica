package EjerciciosRecursivos;

public class Ejercicio4 {

	public static void main(String[] args) {

		System.out.println(dividir(20, 3));

	}

	public static int dividir(int a, int b) {

		if (a < b) {
			// Caso base
			return 0;
		} else {
			// Caso recursivo
			return 1 + dividir(a - b, b);
		}

	}

}