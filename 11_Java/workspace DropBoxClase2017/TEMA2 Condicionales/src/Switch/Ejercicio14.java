
package Switch;

import java.util.*;

/**
 * @author Ramon
 *
 */
public class Ejercicio14 {

	/**
	 * PDF-Ejercicio de Condicionales 14/22
	 * Descripcion:
	 * Condicionales Ejercicio con Switch.
	 * Switch
	 */
	public static void main(String[] args) {
		// 14.Haz un programa que pida un número de mes entre 1 y 12. A
		// continuación devolverá el nombre del mes correspondiente.

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un numero de mes entre 1 y 12: ");
		int opc = teclado.nextInt();
		
		
		switch(opc){
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("Error, Introduzca un numero de mes entre 1 y 12");
			break;
		}
		
		teclado.close();

	}

}
