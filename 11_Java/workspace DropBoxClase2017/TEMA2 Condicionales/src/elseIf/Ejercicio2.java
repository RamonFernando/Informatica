package elseIf;
import java.util.*;

/**
 * 
 */

/**
 * @author Ramon
 *
 */
public class Ejercicio2 {

	/**
	 * PDF-Ejercicio de Condicionales 2/22
	 * Descripcion:
	 * Condicionales Ejercicio con if/else.
	 */
	public static void main(String[] args) {
		// "ENUNCIADO"
		// Escribe un programa que pregunte el precio de un producto. Si vale
		// más de 80 €, le hará un descuento del 10%. Se mostrará en pantalla el
		// precio final.

		Scanner teclado = new Scanner(System.in);
		boolean esValido = false;
		while (esValido == false) {
			try {
				System.out.println("Introduzca el precio de un producto: "
						+ "\n************************************");
				String entrada = teclado.next();
				System.out.println("\n************************************");
				double precio = Double.parseDouble(entrada);
				System.out.println("Importe: " + precio + " €");

				if (precio > 80) {
					double descuento = 0;

					descuento = (precio * 10) / 100;
					precio = precio - descuento;

					System.out.println("Su descuento es de: " + descuento + " €");
					System.out.println("\n************************************");
					System.out.println("El precio final de su compra es: " + precio + " €");
				} else {
					System.out.println("El precio final de su compra es: " + precio + " €");
					System.out.println("\n************************************");
					System.out.println("No tiene ningun descuento.");
				}
				esValido = true;
			} catch (Exception e) {
				// Esto es una excepcion de codigo en la que si el while es
				// falso dara un error de ejecucion, pero si es verdadero
				// ejecutara el codigo anterior
				esValido = false;
				System.out.println(e.toString() + " Error de ejecución. Vuelva a intentarlo");
			}
		}
		teclado.close();
	}

}
