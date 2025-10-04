package EjerciciosParaEntregarRecursividad;

import java.util.Arrays;
/**
 * 
 * @author Ramon
 *
 */
public class Ejercicio4ArraysCopyOfRange {

	/**
	 * Metodo Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 4.- Crea un array llamado notas con los siguientes valores:

		// 5;8;4;9;10;8;2;4

		// A continuación crea otro array llamado primerasNotas cuyos valores
		// sean los cuatro primeros de notas, y muestra sus valores. Utiliza el
		// método Arrays.copyOfRange(). Ojo al uso de índices por parte de este
		// método.
		/**
		 * Array Notas
		 */
		int Notas[] = new int[] { 5, 8, 9, 10, 8, 2, 4 };
		// int primerasNotas[] = {10,9,8,8};
		Arrays.sort(Notas);
		System.out.println("Notas de Clase");
		for (int i = 0; i < Notas.length; i++) {

			System.out.print(Notas[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------");

		/**
		 * Array primerasNotas Metodo Arrays.copyOfRange para mostrar por
		 * consola las 5 primeras notas en ordern ascendente
		 */
		// Para copiar de un array a otro Ejemplo: Notas a PrimerasNotas
		int[] primerasNotas = Arrays.copyOfRange(Notas, 2, 7);
		System.out.println("Las 5 mejores notas son ");
		for (int i = 0; i < primerasNotas.length; i++) {
			System.out.print(primerasNotas[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------");
		System.out.println("Fin del Programa");
	}

}
