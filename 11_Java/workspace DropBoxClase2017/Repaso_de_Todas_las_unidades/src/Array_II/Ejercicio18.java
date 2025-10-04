/**
 * 
 */
package Array_II;

/**
 * @author Ramon
 *
 */
public class Ejercicio18 {

	/**
	 * @PDF-Ejercicio de Arrays II 18/24 Descripcion: Array Bidimencionales
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
		// 17.- Añade al ejercicio anterior un bucle donde se busque en el array
		// quién tiene la nota más baja. La salida debería ser algo como: "Juana
		// Herranz tiene la nota más baja, un "4".
		// 18.- Añade al ejercicio anterior un bucle donde se busque en el array
		// quién tiene la nota más alta. La salida debería ser algo como:
		// "Marcos Ramírez tiene la nota más alta, un 10".

		String notas[][] = { { "Jose Luis Martinez", "7" },
				{ "Antonio Ruiz", "9" }, { "Marcos Ramirez", "10" },
				{ "Juana Herranz", "4" }, { "Alberto Lopez", "7" } };

		// Declaracion de Variable
		double suma = 0;
		double media = 0;
		int posMin = 0;
		int posMax = 0;

		System.out.println("\t-- Notas --");
		System.out.println("------------------------------");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("\"" + notas[i][0] + "\" " + notas[i][1]);

			suma = suma + Double.parseDouble(notas[i][1]);

			// Ejercicio 17...

			if (Double.parseDouble(notas[i][1]) < Double
					.parseDouble(notas[posMin][1])) {
				posMin = i;
			}
			
			// Ejercicio 18...
			
			if (Double.parseDouble(notas[i][1]) > Double
					.parseDouble(notas[posMax][1])) {
				posMax = i;
			}

		}
		media = suma / notas.length;

		System.out.println("------------------------------");
		System.out.println("El alumno con la nota mas baja es " + "\""
				+ notas[posMin][0] + "\"" + " y tiene una nota de "
				+ notas[posMin][1]);
		System.out.println("El alumno con la nota mas alta es " + "\""
				+ notas[posMax][0] + "\" y tiene una nota de "
				+ notas[posMax][1]);
		System.out.println("La nota media es " + media);
		System.out.println("------------------------------");
		System.out.println("   -- Fin del Programa --");
	}

}
