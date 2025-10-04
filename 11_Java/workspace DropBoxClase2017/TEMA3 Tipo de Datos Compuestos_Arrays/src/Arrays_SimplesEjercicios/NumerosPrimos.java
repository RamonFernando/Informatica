/**
 * 
 */
package Arrays_SimplesEjercicios;

/**
 * @author Ramon
 *
 */
public class NumerosPrimos {

	/**
	 * Numeros Primos
	 */
	public static void main(String[] args) {
		// Numeros Primos.

		boolean esPrimo;

		for (int candidato = 2; candidato <= 100; candidato++) {
			esPrimo = true;
			for (int j = 2; j < candidato; j++) {
				if (candidato % j == 0) {
					esPrimo = false;
					break;
				}
			}
			if (esPrimo) {
				System.out.println(candidato);
			}
		}

	}

}
