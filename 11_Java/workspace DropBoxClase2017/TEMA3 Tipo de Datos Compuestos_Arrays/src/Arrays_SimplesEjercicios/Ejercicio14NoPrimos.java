/**
 * 
 */
package Arrays_SimplesEjercicios;

/**
 * @author Ramon
 *
 */
public class Ejercicio14NoPrimos {

	/**
	 * @PDF-Ejercicio de Arrays I 14/17 Descripcion: Numeros primos.
	 */
	public static void main(String[] args) {
		// 14.- Escribe un programa que rellene un array llamado primos con los
		// 100 primeros números primos. Recuerda que un número entero es primo
		// si no puede dividirse por ninguno que no sea 1 o él mismo. Los
		// primeros números primos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, ...
		
		final int NUM_PRIMOS = 100;
		int primos [] = new int [NUM_PRIMOS];
		int numPrimos = 0;
		int candidato = 3;
		boolean esPrimo;
		
		while(numPrimos < NUM_PRIMOS){
			esPrimo = true;
			
			for (int i = 2; i < candidato; i++) {
				if (candidato % i == 0) {
					esPrimo = false;
					break;
				}
			}
			if (esPrimo) {
				primos[numPrimos] = candidato;
				numPrimos++;
			}
			candidato++;
			for (int i = 0; i < primos.length; i++) {
				System.out.println("Primo nº " + (i+1) + " : " + primos[i]);
			}
		}
		
		
	}

}
