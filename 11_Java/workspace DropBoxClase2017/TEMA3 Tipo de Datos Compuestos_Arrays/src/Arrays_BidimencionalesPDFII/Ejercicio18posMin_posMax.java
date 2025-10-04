/**
 * 
 */
package Arrays_BidimencionalesPDFII;

/**
 * @author Ramon
 *
 */
public class Ejercicio18posMin_posMax {

	/**
	 * @PDF-Ejercicio de Arrays II 18/24 Descripcion: Array Bidimencionales 13/23
	 */
	public static void main(String[] args) {
		// 18.- Añade al ejercicio anterior un bucle donde se busque en el array
		// quién tiene la nota más alta. La salida debería ser algo como:
		// "Marcos Ramírez tiene la nota más alta, un 10".

		String notas[][] = { { "Jose Luis Martinez", "7" }, { "Antonio Ruiz", "9" }, { "Marcos Ramirez", "10" },
				{ "Juana Herranz", "4" }, { "Alberto Lopez", "7" } };

		// Declaracion de variable.
		float suma = 0;
		float media = 0;
		int posMin = 0;
		float min = 0;
		float nota = 0;
		int posMax = 0;
		float max = 0;

		System.out.println("----- Notas de Alumnos ------");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i][0] + " " + notas[i][1]);
		}
		for (int i = 0; i < notas.length; i++) {

			suma = suma + Float.parseFloat(notas[i][1]);

		}
		for (int i = 0; i < notas.length; i++) {
			nota = Float.parseFloat(notas[i][1]);

			min = Integer.parseInt(notas[posMin][1]);
			// min = posMin;
			if (nota < min) {
				posMin = i;
			}
			max = Integer.parseInt(notas[posMax][1]);
			// max = posMax;
			if (nota > max) {
				posMax = i;
			}
		}
		media = suma;
		System.out.println("-----------------------------");
		System.out.println("La nota minima la tiene " + notas[posMin][0] + " " + notas[posMin][1]);
		System.out.println("La nota maxima la tiene " + notas[posMax][0] + " " + notas[posMax][1]);
		System.out.println("La media es: " + media / notas.length);
		System.out.println("**=========================**");
		System.out.println("   == Fin del Programa ==");

	}

}
