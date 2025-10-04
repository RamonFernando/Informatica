/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

/**
 * @author Ramon-Fran
 *
 */
public class Ejercicio2Entrega2Fran {

	/**
	 * PDF- Ejercicio II Bucles I
	 * Ejercicio de Fran 3
	 */
	public static void main(String[] args) {
		// 2.- Modifica el programa anterior para que no aparezcan los múltiplos
		// de 5 sino que, al final,
		// simplemente se muestre la suma de todos ellos. Utiliza un bucle
		// while.

		int i = 5;
		int suma = 0;
		while (i <= 1000) {
		suma = suma + i;
		i = i + 5;
		}
		System.out.println(suma);

	}

}
