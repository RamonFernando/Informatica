package EjemplosRecursividad;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("El termino de fibonacci es " + fibonacci(5));
	}

	public static int fibonacci(int n) {

		if (n == 0 || n == 1) {
			// Caso base
			return 1;
		} else {
			// Caso recursivo
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}
}
