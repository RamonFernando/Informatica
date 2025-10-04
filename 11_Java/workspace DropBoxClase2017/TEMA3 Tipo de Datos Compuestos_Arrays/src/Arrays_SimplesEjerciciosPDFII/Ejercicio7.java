/**
 * 
 */
package Arrays_SimplesEjerciciosPDFII;

/**
 * @author horabaixa
 *
 */
public class Ejercicio7 {

	/**
	 * @PDF-Ejercicio de Arrays II 3/17 Descripcion: Búsqueda en Arrays
	 *                desordenados 1-4
	 */
	public static void main(String[] args) {
		// 7.- La siguiente tabla guarda el número de espectadores que vieron La
		// 2 a las 23:00 horas, cada día de la semana. Escribe un programa que
		// busque el máximo y el mínimo de audiencia en esta semana.
		// 2.000.000 2.500.000 3.100.000 3.000.000 1.200.000 1.800.000 2.050.000

		int espectadores[] = { 2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000 };

		int posMin = 0;
		int posMax = 0;
		// System.out.println("Espectadores");
		// System.out.println("*=*=*=*=*=*=*");

		for (int i = 0; i < espectadores.length; i++) {
			if (espectadores[i] < espectadores[posMin]) {
				posMin = i;
			}
			if (espectadores[i] > espectadores[posMax]) {
				posMax = i;
			}
		}
		System.out.println("==============Numero de espectadores=================");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*\n");
		System.out.println("La menor audiencia es: " + "\"" + espectadores[posMin] + "\"" + " y esta en la " + posMin
				+ "º posicion del array.");
		System.out.println("La mayor audiencia es: " + "\"" + espectadores[posMax] + "\"" + " y esta en la " + posMax
				+ "º posicion del array.");
		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*");
		System.out.println("            ==== Fin del Programa ====");
	}

}
