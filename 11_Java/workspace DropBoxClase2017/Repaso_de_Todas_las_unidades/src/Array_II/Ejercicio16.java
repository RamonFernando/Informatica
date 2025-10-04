/**
 * 
 */
package Array_II;

/**
 * @author Ramon
 *
 */
public class Ejercicio16 {

	/**
	 * @PDF-Ejercicio de Arrays II 16/24 Descripcion: Array Bidimensionales
	 *                13/23
	 */
	public static void main(String[] args) {
		// 16.- La siguiente tabla guarda una serie de calificaciones de varios
		// alumnos. Guárdalas en un array, muéstralas en pantalla y calcula la
		// nota media del curso.
		// Alumnos Nota
		// Jose Luis Martinez 7
		// Antonio Ruiz 9
		// Marcos Ramirez 10
		// Juana Herranz 4
		// Alberto Lopez 7

		double nota = 0;
		double media = 0;

		String notas[][] = { { "Jose Luis Martinez", "7" },
				{ "Antonio Ruiz", "9" }, { "Marcos Ramirez", "10" },
				{ "Juana Herranz", "4" }, { "Alberto Lopez", "7" } };

		System.out.println("-- Calificaciones --");
		System.out.println("---------------------------------");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("\"" + notas[i][0] + "\"  " + notas[i][1]);
			nota = nota + Float.parseFloat(notas[i][1]);

		}
		media = nota/notas.length;
		System.out.println("---------------------------------");
		System.out.println("La nota media de los alumnos es " + media);
		System.out.println("---------------------------------");
		System.out.println("     -- Fin del Programa --");
	}

}
