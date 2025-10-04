package TEMA7EjerciciosDeAlgoritmosRecursivos;

public class Ejercicio13 {
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
	// 13.- Modifica el ejercicio anterior para que use Strings en lugar de
	// arrays de caracteres. Además, el
	// String lo introducirá el propio usuario y podrá incluir espacios (que el
	// programa le quitará antes de
	// comprobar si es palíndromo).
	
	public Ejercicio13() {

	}

	public static void main(String[] args) {
		
		String cadenaOriginal = "dabale arroz a la zorra el abad";
		String cadenaModificada = cadenaOriginal.replaceAll("\\s", "");
		System.out.println(esPalindromo(cadenaModificada, 0, cadenaModificada.length()-1));
	}
	public static boolean esPalindromo(String frase, int inicio, int fin){
		if (inicio == fin) {
			return true;
		}else if (inicio + 1 == fin) {
		if (frase.charAt(inicio) == frase.charAt(fin)) {
			return true;
		}	
			
		} if (frase.charAt(inicio) == frase.charAt(fin) && esPalindromo(frase, inicio+1, fin-1)) {
			return true;
		}else {
			return false;
		}
		
	}
}
