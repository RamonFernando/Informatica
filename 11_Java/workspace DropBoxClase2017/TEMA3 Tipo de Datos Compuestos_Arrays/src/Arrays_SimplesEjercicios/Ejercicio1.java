/**
 * 
 */
package Arrays_SimplesEjercicios;

/**
 * @author Ramon
 *
 */
public class Ejercicio1 {

	/**
	 * @PDF Ejercicios de Arrays 1/17
	 */
	public static void main(String[] args) {
		// 1.- Crea un array de Strings llamado estaciones cuyos valores sean
		// los nombres de las cuatro estaciones del año. Haz que después se
		// muestren todos los valores mediante un bucle for.

		String estaciones[] = {"Primavera", "Verano", "Otoño", "Invierno" };

		System.out.println("Estaciones del año");
		System.out.println("------------------");
		for (int i = 0; i < estaciones.length; i++) {
			System.out.println(estaciones[i] + " ");
		}
	}

}
