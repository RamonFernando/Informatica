/**
 * 
 */
package Array_II;

/**
 * @author Ramon
 *
 */
public class Ejercicio17 {

	/**
	 * @PDF-Ejercicio de Arrays II 17/24 Descripcion: Array Bidimensionales
	 *                13/23
	 */
	public static void main(String[] args) {
		// 17.- Añade al ejercicio anterior un bucle donde se busque en el array
		// quién tiene la nota más baja. La salida debería ser algo como: "Juana
		// Herranz tiene la nota más baja, un 4".

		String notas[][] = { { "Jose Luis Martinez", "7" },
				{ "Antonio Ruiz", "9" }, { "Marcos Ramirez", "10" },
				{ "Juana Herranz", "4" }, { "Alberto Lopez", "7" } };

		double nota = 0;
		double media = 0;
		int posMin = 0;
		// int posMax = 0;
		double min = 0;
		// double max = 0;
		double nota1 = 0;

		System.out.println("-- Calificaciones --");
		System.out.println("---------------------------------");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("\"" + notas[i][0] + "\"  " + notas[i][1]);
			nota = nota + Float.parseFloat(notas[i][1]);

		}
		media = nota / notas.length;
		for (int i = 0; i < notas.length; i++) {
			nota1 = Double.parseDouble(notas[i][1]);
			min = Double.parseDouble(notas[posMin][1]);
			// max = Float.parseFloat(notas[posMax][1]);
			if (nota1 < min){
				posMin = i;
			}

		}
		System.out.println("---------------------------------");
		System.out.println("La menor nota la tiene " + notas[posMin][0] + " : "
				+ notas[posMin][1]);
		System.out.println("La nota media de los alumnos es " + media);
		System.out.println("---------------------------------");
		System.out.println("     -- Fin del Programa --");

	}

}
