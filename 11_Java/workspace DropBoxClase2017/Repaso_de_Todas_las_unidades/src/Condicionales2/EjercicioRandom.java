/**
 * 
 */
package Condicionales2;

/**
 * @author Ramon
 *
 */
public class EjercicioRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Crea 5 tablas de multiplicar de 5 numeros random.

		for (int i = 1; i < 6; i++) {
			int num1 = (int) (Math.random() * 100 + 1);
			System.out.println("\n" + i + "º Tabla del " + "\"" + num1 + "\"");
			for (int j = 1; j < 11; j++) {

				// int num2 = (int) (Math.random()*100+1);

				System.out.println("  " + num1 + " x " + j + " = "
						+ (num1 * j));
			}
		}
	}

}
