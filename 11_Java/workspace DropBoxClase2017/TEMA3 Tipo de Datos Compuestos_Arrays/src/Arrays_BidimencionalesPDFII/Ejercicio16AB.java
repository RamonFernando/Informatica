/**
 * 
 */
package Arrays_BidimencionalesPDFII;

/**
 * @author horabaixa
 *
 */
public class Ejercicio16AB {

	/**
	 * @PDF-Ejercicio de Arrays II 16/24 Descripcion: Array Bidimensionales 13/23
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

		String notas[][] = { { "Jose Luis Martinez", "7" }, { "Antonio Ruiz", "9" }, { "Marcos Ramirez", "10" },
				{ "Juana Herranz", "4" }, { "Alberto Lopez", "7" } };

		// Declaracion de variable.

		float suma = 0;
		float media = 0;

		System.out.println("----- Notas de Alumnos ------");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i][0] + " " + notas[i][1]);
		}
		for (int i = 0; i < notas.length; i++) {

			suma = suma + Float.parseFloat(notas[i][1]);

		}
		media = suma;
		System.out.println("La media es: " + media / notas.length);
		System.out.println("**=========================**");
		System.out.println("   == Fin del Programa ==");
	}

}
