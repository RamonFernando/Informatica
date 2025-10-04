/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

/**
 * @author Ramon
 *
 */
public class Ejercicio2Entrega2conWhile {

	/**
	 * PDF- Ejercicio II Bucles I
	 * Ejercicios de Bucles con while
	 */
	public static void main(String[] args) {
		// 2.- Modifica el programa anterior para que no aparezcan los múltiplos
		// de 5 sino que, al final,
		// simplemente se muestre la suma de todos ellos. Utiliza un bucle
		// while.

		int i = 1;
		int acumulador = 5;
		int suma = 0;
		System.out.println("Multiplos de 5 sumados. ");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
		while (acumulador <= 1000) {
			
			System.out.println("Posicion: " + i + " = " + acumulador);
			acumulador = acumulador +5; // Aqui que sume acumulador + 5 y lo guarde en acumulador nuevamente.
			i++;
			suma = suma + acumulador; // Aqui se le dice que sume la variable acumulador y lo meta en suma.
			// System.out.println(suma); Esto es para que se vaya sumando la variable suma para hacer comprobaciones.
		}
		System.out.println("\nLa suma de todos los multiplos de 5 es : " + suma);
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("               Fin del Programa");
		
	}

}
