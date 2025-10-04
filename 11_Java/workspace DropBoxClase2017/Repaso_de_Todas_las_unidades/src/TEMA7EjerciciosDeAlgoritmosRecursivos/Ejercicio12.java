package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio12 {
	// 12.- Escribe una función boolean esPalindromo(char[] frase, int inicio,
	// int fin) que tome un array de
	// caracteres, junto a sus posiciones inicial y final, y devuelva true si es
	// un palíndromo (se lee igual de
	// derecha a izquierda) o false en caso contrario.
	// Por ejemplo:
	// char[] ejemplo1 = { 'A', 'L', 'A' };
	// esPalindromo(ejemplo1, 0, 2) = true
	// char[] ejemplo2 = { 'A', 'L', 'B' };
	// esPalindromo(ejemplo2, 0, 2) = false
	// char[] ejemplo3 = { 'A', 'L', 'L', 'I', 'V', 'E', 'S', 'S', 'E', 'V',
	// 'I', 'L', 'L', 'A' };
	// esPalindromo(ejemplo3, 0, 13) = true

	public Ejercicio12() {

	}

	public static void main(String[] args) {

		char[] ejemplo = { 'A', 'L', 'L', 'I', 'V', 'E', 'S', 'S', 'E', 'V',
				'I', 'L', 'L', 'A' };
		char[] ejemplo1 = { 'A', 'L', 'A' };
		char[] ejemplo2 = { 'A', 'L', 'B' };
		char[] ejemplo3 = { 'A', 'B' };

		System.out.println("Es palindromo? "
				+ esPalindromo(ejemplo, 0, ejemplo.length - 1));
		System.out.println("Es palindromo? "
				+ esPalindromo(ejemplo1, 0, ejemplo1.length - 1));
		System.out.println("Es palindromo? "
				+ esPalindromo(ejemplo2, 0, ejemplo2.length - 1));
		System.out.println(esPalindromo(ejemplo3, 0, ejemplo3.length - 1));
	}

	public static boolean esPalindromo(char[] frase, int inicio, int fin) {

		if (inicio == fin) {
			return true;
		} else if (inicio + 1 == fin) {
			if (frase[inicio] == frase[fin]) {
				return true;
			} else {
				return false;
			}
		}
		if (frase[inicio] == frase[fin]
				&& esPalindromo(frase, inicio + 1, fin - 1)) {
			return true;
		} else {
			return false;
		}
	}
}
