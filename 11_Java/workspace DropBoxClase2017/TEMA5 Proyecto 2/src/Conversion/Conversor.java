/**
 * 
 */
package Conversion;

/**
 * @author Ramon
 *
 */
public class Conversor {

	/**
	 * Estaticos, y conversores para Kilometros a Millas, Presion en Milibares a
	 * Atmosfera Calorias a Julios
	 * 
	 * Para importar todo lo que haga falta: Ctrl + Mayus + o
	 */

	private static final double KM_A_MILLAS = 0.621371;
	private static final double MB_A_ATM = 0.000987;
	private static final double CAL_A_JULIOS = 4.1868;

	// Constructor
	public Conversor() {
		System.out.println("Se ha llamado al metodo constructor");
	}

	// Metodos de Acceso
	public static double millas(double km) {
		return km * KM_A_MILLAS;

	}

	public static double km(double millas) {
		return millas / KM_A_MILLAS;
	}

	public static double atmosfera(double milibares) {
		return milibares * MB_A_ATM;
	}

	public static double milibares(double atmosfera) {
		return atmosfera / MB_A_ATM;
	}

	public static double julios(double calorias) {
		return calorias * CAL_A_JULIOS;

	}

	public static double calorias(double julios) {
		return julios / CAL_A_JULIOS;
	}

	// Metodos Getters
	// public static double getKmAMillas() {
	// return KM_A_MILLAS;
	// }
	//
	// public static double getMbAAtm() {
	// return MB_A_ATM;
	// }
	//
	// public static double getCalAJulios() {
	// return CAL_A_JULIOS;
	// }
}
