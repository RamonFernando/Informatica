/**
 * 
 */
package Arrays_SimplesEjercicios;

/**
 * @author Ramon
 *
 */
public class Ejercicio3 {

	/**
	 * @PDF-Ejercicios Arrays I 3/17
	 */
	public static void main(String[] args) {
		// 3.- Crea un array llamado densidades con las densidades (en g/cm3) de
		// los nueve (sí, nueve) planetas del Sistema Solar. Haz que después se
		// muestren todos los valores mediante un bucle for.

		int densidades[] = { 19, 18, 12, 15, 16, 20, 9, 23, 11 };
		System.out.println("Densidades de los 9 Planetas en g/cm3");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

		for (int i = 0; i < densidades.length; i++) {
			System.out.println((i + 1) + " - " + densidades[i] + " g/cm3");
		}
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("       *- Fin del Programa -*");
	}

}
