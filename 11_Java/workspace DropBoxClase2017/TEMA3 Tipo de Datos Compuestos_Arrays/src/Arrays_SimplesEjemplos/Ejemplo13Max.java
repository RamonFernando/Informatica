/**
 * 
 */
package Arrays_SimplesEjemplos;

/**
 * @author horabaixa
 *
 */
public class Ejemplo13Max {

	/**
	 * Encontrar la posicion Maxima de un Array.
	 */
	public static void main(String[] args) {
		// Ejemplo hecho en clase.

				int temperaturas[] = { 5, 1, 3, 10, 8 };
				// Declaracion de variables.
				int max;
				int j = 0;

				// Suponemos que el minimo es el primer dato del array y que el mayor es
				// el ultimo.
				max = temperaturas[0];

				// Recorremos el array comprobando cada posicion del array con el valor
				// guardado en posMin.

				// Si encontramos un valor mas pequeño que posMin lo cambiamos.
				for (int i = 0; i < temperaturas.length; i++) {
					if (temperaturas[i] > max) {
						max = temperaturas[i];
					}
					
				}
				
				System.out.println("La menor temperatura es: " + max + "ºC" + "y esta en la posicion " + j);

	}

}
