/**
 * 
 */
package Arrays_SimplesEjercicios;

/**
 * @author Ramon
 *
 */
public class Ejercicio16 {

	/**
	 * 
	 * @PDF-Ejercicio de Arrays I 16/17 Descripcion:
	 */
	public static void main(String[] args) {
		// 16.- Añade al programa anterior la función de calcular cuántas
		// temperaturas ha habido por encima de 12ºC.
		double temp[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		double suma = 0;
		double media = 0;
		int cantidad =0;

		for (int i = 0; i < temp.length; i++) {
			System.out.print("\"" + temp[i] + "\"" + " ");
			suma = suma + temp[i];
			if(temp[i]>12){
				
				cantidad++;
			}
		}
		media = suma / temp.length;

		// Metodo para un decimal con 2 decimas.

		System.out.printf("\n\nTemperatura media en %.2f ", media);
		System.out.println("\nTemperatura media: " + (float) media + " ºC");
		System.out.println("Hay " + "\"" + cantidad + "\"" +" temperaturas mayores que 12.");
	}

}
