/**
 * 
 */
package Condicionales2;

/**
 * @author Ramon
 *
 */
public class Ejercicio16MathPow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 16.- Crea un programa que muestre las diez primeras potencias del
		// número 2 (o sea, 2, 4, 8, 16, etc.).
		
		// Contador.
		int num = 2;

		for (int i = 1; i < 11; i++) {
			System.out.println(i + "º potencia de 2 es: "
					+ (int) Math.pow(num, i));
		}
	
	}

}
