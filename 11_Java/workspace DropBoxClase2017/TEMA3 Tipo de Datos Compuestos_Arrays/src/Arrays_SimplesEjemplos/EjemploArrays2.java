/**
 * 
 */
package Arrays_SimplesEjemplos;

/**
 * @author Ramon
 *
 */
public class EjemploArrays2 {

	/**
	 * Ejemplo 2
	 */
	public static void main(String[] args) {
		// 
		
		String nombres[] = new String[4];
		nombres[0] = "Carlos";
		nombres[1] = "Teo";
		nombres[2] = "Gustavo";
		nombres[3] = "Patryck";
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Posición " + i + ": = " +  "\"" + nombres[i] + "\"");
		}
		

	}

}
