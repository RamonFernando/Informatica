/**
 * 
 */
package inicio;

import java.util.Scanner;

import conversion.Conversor;

/**
 * @author Ramon
 *
 */
public class Main {

	/**
	 * Main, clase Main
	 */
	public Main() {

	}

	/**
	 * Metodo Main: para hacer comprobaciones
	 * 
	 * @param args
	 */

	// Variables Atributos
	static double km;
	static double millas;
	static double milibares;
	static double atmosfera;
	static double calorias;
	static double julios;

	public static void main(String[] args) {

		// EJERCICIO
		// Crea un proyecto con dos paquetes:
		// • conversion • inicio
		// Dentro del paquete conversion, crea una clase Conversor. Esta clase
		// contendrá métodos estáticos útiles para convertir distintas unidades
		// (quilómetros a millas, presión en milibares a atmósferas, calorías a
		// julios, etc.).
		// Dentro del paquete inicio, crea una clase Inicio (que contendrá un
		// método main).
		// Las características de la clase Conversor son:
		// Conversor
		// - double KM_A_MILLAS
		// - double MB_A_ATM
		// - double CAL_A_JULIOS
		// + Conversor ( )
		// + double millas (double km)
		// + double km (double millas)
		// + double atmosferas (double milibares)
		// + double milibares (double atmosferas)
		// + double julios (double calorias)
		// + double calorias (double julios)
		//
		// Las constantes de la clase permiten pasar de km a millas, de
		// milibares a atmósferas y de calorías a julios. Tendrás que averiguar
		// sus valores.
		// Todos los atributos y métodos de esta clase son estáticos.
		// En el método main:
		// • Se pedirá al usuario que introduzca una distancia en quilómetros y
		// se le devolverá en millas.
		// • Se pedirá una presión en milibares y se
		// le devolverá en atmósferas.
		// • Se pedirá una cantidad de energía en
		// calorías y se le devolverá en julios.

		// Instancia de Objeto 1
		// Conversor c1 = new Conversor();

		System.out.println("    \" Conversor \"");
		System.out.println("---------------------------");
		leeDatos();
		mostrar();
		System.out.println("Fin del Programa");
	}

	public static void leeDatos() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Conversor de km a millas");
		System.out.println("Introduce los km, se devolvera en millas: ");
		km = sc.nextDouble();
		System.out.println("---------------------------");
		System.out.println("Conversor de km a millas");
		System.out.println("Introduce las millas, se devolvera en kilometros:");
		millas = sc.nextDouble();
		System.out.println("---------------------------");
		System.out.println("Conversor de milibares a atmosferas");
		System.out.println("Introduzca milibares, se devolvera en atmosfera: ");
		milibares = sc.nextDouble();
		System.out.println("---------------------------");
		System.out.println("Conversor de atmosferas a milibares");
		System.out.println("Introduzca atmosfera, se devolvera en milibares: ");
		atmosfera = sc.nextDouble();
		System.out.println("---------------------------");
		System.out.println("Conversor de calorias a julios");
		System.out.println("Introduzca calorias, se devolvera en julios: ");
		calorias = sc.nextDouble();
		System.out.println("---------------------------");
		System.out.println("Conversor de julios a calorias");
		System.out.println("Introduzca julios, se devolvera en calorias: ");
		julios = sc.nextDouble();
		System.out.println("---------------------------");
		sc.close();
	}

	public static void mostrar() {
		System.out.println("Datos a mostrar");
		System.out.println("---------------------------");
		System.out.println(km + " Kilometros en Millas son: "
				+ Conversor.millas(km) + " mlls");
		System.out.println(millas + " Millas en Kilometros son: "
				+ Conversor.km(millas) + " km");
		System.out.println(atmosfera + " Atmosferas en Milibares son: "
				+ Conversor.milibares(atmosfera) + " mb");
		System.out.println(milibares + " Milibares en Atmosferas son: "
				+ Conversor.atmosfera(milibares) + " atm");
		System.out.println(calorias + " Calorias en Julios son: "
				+ Conversor.julios(calorias) + " jul");
		System.out.println(julios + " Julios en Calorias son: "
				+ Conversor.calorias(julios) + " cal");
		System.out.println("---------------------------");
	}

}
