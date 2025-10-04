package Condicionales;
import java.util.*;


/**
 * @author Ramon
 *
 */
public class Ejercicio12 {

	/**
	 * Condicionales else if
	 */
	public static void main(String[] args) {
		// Crea una aplicación que pida el número de mes y devuelva el nombre
		// del mes (basta que lo haga para los meses de enero a abril).

		Scanner entrada = new Scanner(System.in);

		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;

		System.out.println("Introduzca un numero de mes del 1 al 4");
		int num = entrada.nextInt();

		if (num == num1) {
			System.out.println("Enero");
		} else if (num == num2) {
			System.out.println("Febrero");
		} else if (num == num3) {
			System.out.println("Marzo");
		} else if (num == num4) {
			System.out.println("Abril");
		}

		entrada.close();

	}

}
