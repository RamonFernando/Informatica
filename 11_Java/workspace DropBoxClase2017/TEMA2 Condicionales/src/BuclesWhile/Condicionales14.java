package BuclesWhile;

/**
 * @author Ramon
 *
 */
public class Condicionales14 {

	/**
	 * PDF-Ejercicio de Bucles 14/22
	 * Descripcion:
	 * Bucles: Variable acumulador.
	 */
	public static void main(String[] args) {
		// Ejemplos de clase.

		// Ejercicio:
		// Mostrar los 10 primeros numeros pares
		// empesando por el 2.
		
		// La variable i en el 14 actua como acumulador.
		int i = 2; // i --> Variable acumulador.
		while (i <= 20) {
			System.out.println(i);
			i = i + 2; // i += 2;
		}
		System.out.println("Fin");
	}

}
