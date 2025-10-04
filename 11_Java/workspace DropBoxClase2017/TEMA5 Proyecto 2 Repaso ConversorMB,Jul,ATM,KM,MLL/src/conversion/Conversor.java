/**
 * 
 */
package conversion;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */

public class Conversor {

	// Atributos
	private static double KM_A_MILLAS = 0.621371;
	private static double BM_A_ATM = 0.000987;
	private static double CAL_A_JULIOS = 4.1868;

	// Variables Atributos
	// static double km;
	// static double millas;
	// static double milibares;
	// static double atmosfera;
	// static double calorias;
	// static double julios;

	/**
	 * Constructor por defecto.
	 */
	public Conversor() {
		//
	}

	// Metodos
	public static double millas(double km) {
		km = km * KM_A_MILLAS;

		return km;
	}

	public static double km(double millas) {
		millas = millas / KM_A_MILLAS;

		return millas;

	}

	public static double atmosfera(double milibares) {
		milibares = milibares * BM_A_ATM;

		return milibares;
	}

	public static double milibares(double atmosfera) {
		atmosfera = atmosfera / BM_A_ATM;

		return atmosfera;
	}

	public static double julios(double calorias) {
		calorias = calorias * CAL_A_JULIOS;

		return calorias;
	}

	public static double calorias(double julios) {
		julios = julios / CAL_A_JULIOS;

		return julios;
	}

}
