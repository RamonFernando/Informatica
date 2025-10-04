/**
 * 
 */

/**
 * @author Ramon
 *
 */
import java.util.Scanner;

public class Ejercicio1ClaseScanner {

	/**
	 * Clase Scanner
	 */
	public static void main(String[] args) {
		// La clase Scanner sirve para introducir datos por consola.
		Scanner entrada = new Scanner(System.in);

		System.out.println("Cual es tu nombre ?");
		String nombre = entrada.nextLine();

		System.out.println("Cual es tu edad? ");
		int edad = entrada.nextInt();

		entrada.nextLine(); // Con esto se limpia el codigo ya que sino la
							// consola guarda un espacio bacio(Enter) y lo
							// entiende como la informacion que usted le pasa
							// por teclado.
							// Cuando el programa se salte el codigo metemos un
							// entrada.nextLine(); para limpiar el codigo si es
							// un String y un entrada.NextInt(); si es un entero
							// y el programa nos hara la siguiente pregunta
							// correctamente

		System.out.println("Sexo: ");
		String sexo = entrada.nextLine();

		if (sexo.equals("hombre")) {
			System.out.println("Su nombre es" + " Sr. " + nombre
					+ " y su edad es " + edad + " años.");
		} else if (sexo.equals("mujer")) {
			System.out.println("Su nombre es" + " Sra. " + nombre
					+ " y su edad es " + edad + " años.");
		}
		entrada.close();
	}

}
