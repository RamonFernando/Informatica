/**
 * 
 */
package Arrays_I;

/**
 * @author Ramon
 *
 */
public class Ejercicio16 {

	/**
	 * @PDF-Ejercicios Arrays I 15/17
	 */
	public static void main(String[] args) {
		// 16.- Añade al programa anterior la función de calcular cuántas
		// temperaturas ha habido por encima de 12ºC.
		
		// Declaracion de Variable.
				double media = 0;
				double suma = 0;
				
				double temperaturas[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };
				
				System.out.println("Temperaturas");
				System.out.println("-----------------------------------");
				for (int i = 0; i < temperaturas.length; i++) {
					suma = suma + temperaturas[i];
					System.out.println((i+1) + "º Temperatura " + temperaturas[i] + " ºC" );
					
				}
				System.out.println("-----------------------------------");
				for (int i = 0; i < temperaturas.length; i++) {
					if (temperaturas[i]> 12) {
						System.out.println("Las temperaturas por encima de 12 ºC son: " + temperaturas[i]);
					}
				}
				media = suma/temperaturas.length;
				
				
				
				System.out.println("-----------------------------------");
				System.out.println("La temperatura media es: " + (float)media + " ºC");
				System.out.printf("Temperatura media: %.1f", media);
				System.out.println("\n-----------------------------------");
				System.out.println("      -- Fin del Programa --");
	}

}
