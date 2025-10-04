/**
 * 
 */
package Arrays_SimplesEjercicios;

/**
 * @author Ramon
 *
 */
public class Ejercicio2 {
	/**
	 * @PDF- Ejercicios Arrays I 2/17
	 */
	public static void main(String[] args) {
		// 2.- Crea un array de Strings llamado meses cuyos valores sean los
		// nombres de los doce meses del año. Haz que después se muestren todos
		// los valores mediante un bucle while.

		String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo",
				"Junio", "Julio", "Agosto", "Septiembre", "Octubre",
				"Noviembre", "Diciembre" };
		System.out.println("Meses del año");
		System.out.println("-------------");
		int i = 0;
		while(i < meses.length) {
			System.out.println((i + 1) + " " + meses[i]);
			i++;
		}
		System.out.println("-------------");
		System.out.println("**== Fin ==**");
	}

}
