package elseIf;
import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio13 {

	/**
	 * PDF-Ejercicio de Condicionales 11/22
	 * Descripcion:
	 * Condicionales Ejercicio con if/else.
	 */
	public static void main(String[] args) {
		// Modifica el programa anterior para sólo haga el proceso si el número
		// de mes está entre 1 y 4.

		Scanner entrada = new Scanner(System.in);

		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;

		System.out.println("Introduzca un numero de mes del 1 al 4");
		int num = entrada.nextInt();

		while (num >= 0 && num < 5) {
			if (num == num1) {
				System.out.println("<<<>>>\n" + " Enero" + "\n<<<>>>");
				break;
			} else if (num == num2) {
				System.out.println("<<<<>>>>\n" + " Febrero" + "\n<<<<>>>>");
				break;
			} else if (num == num3) {
				System.out.println("<<<>>>\n" + " Marzo" + "\n<<<>>>");
				break;
			} else if (num == num4) {
				System.out.println("<<<>>>\n" + " Abril" + "\n<<<>>>");
				break;
			}
		}
		entrada.close();
	}

}
