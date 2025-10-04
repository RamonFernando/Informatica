import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ramon
 *
 */
public class EjerEntrega4 {

	/**
	 * Ejercicio4
	 */
	public static void main(String[] args) {
		// Crea un programa que pregunte el nombre de un alumno y sus notas de
		// las tres evaluaciones
		// y devuelva la media.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Cual es su nombre? ");
		entrada.nextLine();

		System.out.println("Cuales son sus notas: ");
		float nota1 = entrada.nextFloat();
		float nota2 = entrada.nextFloat();
		float nota3 = entrada.nextFloat();

		float resultado = nota1 + nota2 + nota3;
		float media = resultado / 3;

		System.out.println("Su media es: " + media);

		entrada.close();
	}

}
