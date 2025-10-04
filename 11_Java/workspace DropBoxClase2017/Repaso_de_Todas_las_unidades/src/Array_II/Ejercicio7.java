/**
 * 
 */
package Array_II;

/**
 * @author Ramon
 *
 */
public class Ejercicio7 {

	/**
	 * @PDF-Ejercicio de Arrays II 7/17 Descripcion: Búsqueda en Arrays
	 *                desordenados 1-4
	 */
	public static void main(String[] args) {
		// 7.- La siguiente tabla guarda el número de espectadores que vieron La
		// 2 a las 23:00 horas, cada día de la semana. Escribe un programa que
		// busque el máximo y el mínimo de audiencia en esta semana.
		// 2.000.000 2.500.000 3.100.000 3.000.000 1.200.000 1.800.000 2.050.000

		int espectadores[] = { 2000000, 2500000, 3100000, 3000000, 1200000,
				1800000, 2050000 };
		String diaSemana[] = { "Lunes", "Martes", "Miercoles", "Jueves",
				"Viernes", "Sabado", "Domingo" };

		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < espectadores.length; i++) {
			if (espectadores[i] < espectadores[posMin]) {
				posMin = i;
			}
			if (espectadores[i] > espectadores[posMax]) {
				posMax = i;
			}
		}

		System.out
				.println("==============Numero de Espectadores=================");
		System.out
				.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*\n");
		for (int i = 0; i < espectadores.length; i++) {
			System.out.print("\"" + espectadores[i] + "\" ");
		}
		System.out.println("");
		System.out.println("\nLa menor audiencia fue: " + "\""
				+ espectadores[posMin] + "\" el " + diaSemana[posMin]
				+ " y esta en la " + posMin + "º posicion del array.");
		System.out.println("La mayor audiencia fue: " + "\""
				+ espectadores[posMax] + "\" el " + diaSemana[posMax]
				+ " y esta en la " + posMax + "º posicion del array.");
		System.out
				.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
		System.out.println("            ==== Fin del Programa ====");
	}

}
