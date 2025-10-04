/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

/**
 * @author Ramon
 *
 */
public class Ejercicio2Entrega3conDoWhile {

	/**
	 * PDF- Ejercicio II Bucles I
	 * Ejercicios de Bucles con Do-While
	 */
	public static void main(String[] args) {
		// 3.- Crea una aplicación que calcule una lista con las potencias de 3
		// menores que 12000. Haz que en
		// cada pasada del bucle se muestre el exponente y el valor de la
		// potencia. Utiliza un bucle do-while.

		int base = 3;
		int exponente = 3;

		System.out.println("Potencias de 3 menores de 12000");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");

		do {

			System.out.println(base + " ^ " + exponente + " = " + base*3);
			base = base * 3;

		} while (base <= 12000);

		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("        Fin del programa");
	}

}
