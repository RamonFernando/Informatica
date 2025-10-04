package Operador_Ternario;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio22 {

	/**
	 * PDF-Ejercicio de Condicionales 22/22 
	 * Descripcion: Condicionales Ejercicio
	 * con Operador Ternario.
	 */
	public static void main(String[] args) {
		// Crea un programa que calcule la hora de cierre de una tienda. Esta
		// hora depende del valor de una variable de tipo String llamada dia. Si
		// su valor es "entre semana", la hora de cierre de la tienda será
		// "20:00". En otro caso, la hora de cierre será "14:00".

		Scanner entrada = new Scanner(System.in);
		System.out.println("Es dia de semana, Responda \"s\" o \"n\"");
		String dia = entrada.next();

		// if (dia.equals("s")) {
		// System.out.println("Hora de cierre a las 20:00");
		// } else if (dia.equals("n")) {
		// System.out.println("Hora de cierre a las 14:00");
		// }
		String horaCierre;
		
		// Operador Ternario.
		horaCierre = dia.equals("s") ? horaCierre = "Hora de Cierre a las 20:00"
				: "Hora de Cierre a las 14:00";
		System.out.println(horaCierre);

		entrada.close();
		
		

	}

}
