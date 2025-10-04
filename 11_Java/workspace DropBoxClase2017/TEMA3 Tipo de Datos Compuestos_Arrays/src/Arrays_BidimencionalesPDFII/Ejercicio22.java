/**
 * 
 */
package Arrays_BidimencionalesPDFII;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio22 {

	/**
	 * @PDF-Ejercicio de Arrays II 21/24 Descripcion: Array Bidimensionales
	 *                13/23
	 */
	public static void main(String[] args) {
		// 22.- Escribe un programa que vaya preguntando y guardando en un array
		// el nombre de un alumno y sus notas de exámenes, trabajos y actitud en
		// un trimestre. Así para tres alumnos. A continuación mostrará una
		// lista con el nombre de cada alumno y su nota de evaluación, que
		// vendrá dada por la fórmula:
		// 50 % Examenes + 40 % Trabajos + 10 % Actitud.

		Scanner sc = new Scanner(System.in);
		String lista[][] = new String[3][4];
		// Declaracion de variable
		double suma = 0;
		double notaMedia = 0;
		double examen = 0;
		double trabajo = 0;
		double actitud = 0;
		int cont = 1;

		System.out.println("Notas de Evaluacion de Alumnos");
		System.out.println("------------------------------");
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Introduce el " + (i + 1) + "º Nombre");
			lista[i][0] = sc.nextLine();
			System.out.println("Introduce el " + (i + 1) + "º Examen");
			lista[i][1] = sc.nextLine();
			System.out.println("Introduce el " + (i + 1) + "º Trabajo");
			lista[i][2] = sc.nextLine();
			System.out.println("Introduce el " + (i + 1) + "º Actitud");
			lista[i][3] = sc.nextLine();

		}
		cont++;
		System.out.println("------------------------------");
		for (int i = 0; i < lista.length; i++) {
			// System.out.println(lista[i][1] + " " + lista[i][2] + " " +
			// lista[i][3]);
			examen = Double.parseDouble(lista[i][1]);
			trabajo = Double.parseDouble(lista[i][2]);
			actitud = Double.parseDouble(lista[1][3]);

			suma = ((50 * examen + 40 * trabajo + 10 * actitud) / 100);
			System.out.println("------------------------------");
			System.out.println("Nombre " + lista[i][0]);
			System.out.println("Examen " + examen);
			System.out.println("Trabajos " + trabajo);
			System.out.println("Actitud " + actitud);
			System.out.println("La nota media es " + suma);

		}

		System.out.println("------------------------------");

		System.out.println("------------------------------");
		System.out.println("   -- Fin del Programa --");

		sc.close();

	}

}
