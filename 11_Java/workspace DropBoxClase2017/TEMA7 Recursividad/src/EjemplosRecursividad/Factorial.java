package EjemplosRecursividad;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe un numero entero positivo: ");
		int num = Entrada.leeInt();

		System.out.println("El factorial de " + num + " es " + factorial(num));
	}

	public static int factorial(int n) {
		// Caso Base
		if (n == 0) {
			return 1;
		} else {

			// Caso recursivo
			return n * factorial(n - 1);
		}

	}

}
