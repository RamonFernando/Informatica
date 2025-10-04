/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

/**
 * @author Ramon
 *
 */
public class Ejercicio2Entrega1conWhile {

	/**
	 * PDF- Ejercicio II Bucles I
	 * Ejercicios Bucles con While
	 * 
	 */
	public static void main(String[] args) {
		// 1.- Escribe todos los múltiplos de 5 entre 1 y 1000. Utiliza un bucle
		// while y haz que la variable
		// contador se incremente de 5 en 5.

		
		int multiplo = 5;
		int i=1;

		System.out.println(" Multiplos de 5 entre 1 y 1000");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		while (multiplo <= 1000) {
			System.out.println("    " + i + "º --> " + " 5" + " x "+ i + " = " + multiplo);
			multiplo = multiplo+5;
			i++;
		}
		
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("       Fin del programa");
	}

}
