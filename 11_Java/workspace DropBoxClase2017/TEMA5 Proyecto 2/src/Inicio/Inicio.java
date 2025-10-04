/**
 * 
 */
package Inicio;

import java.util.Scanner;

import Conversion.Conversor;

/**
 * @author Ramon
 *
 */
public class Inicio {

	/**
	 * Main Aqui contendra los Metodos Estaticos, y conversores para Kilometros
	 * a Millas, Presion en Milibares a Atmosfera Calorias a Julios
	 */

	static double km;
	static double milibares;
	static double calorias;

	public static void main(String[] args) {

		System.out.println("Conversor de Unidades");
		System.out.println("---------------------");

		// Leemos Datos
		getDatos();

		System.out.println(km + " Km son : " + Conversor.millas(km) + " Millas");
		System.out.println(milibares + " milibares son : " + Conversor.atmosfera(milibares) + " Atmosferas");
		System.out.println(calorias + " calorías son : " + Conversor.julios(calorias) + " Julios");

	}

	static void getDatos() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Conversor de Kilometros a Millas");
		System.out.println("Introduce una distancia en Kilometros: ");
		km = sc.nextDouble();

		System.out.println("Conversor de Milibares a Millas");
		System.out.println("Introduce una presion en milibares: ");
		milibares = sc.nextDouble();

		System.out.println("Conversor de Calorias a Julios");
		System.out.println("Introduce una cantidad de energias en Calorias");
		calorias = sc.nextDouble();

		sc.close();
	}
}
