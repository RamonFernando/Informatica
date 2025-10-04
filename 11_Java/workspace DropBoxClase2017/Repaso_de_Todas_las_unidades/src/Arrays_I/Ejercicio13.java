/**
 * 
 */
package Arrays_I;

/**
 * @author Ramon
 *
 */
public class Ejercicio13 {

	/**
	 * @PDF-Ejercicios Arrays I 13/17
	 */
	public static void main(String[] args) {
		// 13.- Crea un programa que rellene un array llamado potencias con las
		// primeras 20 potencias de 2. Haz que después se muestren todos los
		// valores mediante un bucle while.
		
		int potencias[] = new int[20];
		
		System.out.println("Potencias del Numero \"2\"");
		System.out.println("-------------------------");
		int exponente = 1;
		for (int i = 0; i < potencias.length; i++) {
			System.out.println((i+1) + "º potencia " + Math.pow(2, exponente));
		exponente++;
		}
	}

}
