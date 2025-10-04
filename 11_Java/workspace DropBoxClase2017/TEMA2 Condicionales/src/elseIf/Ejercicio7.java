package elseIf;
import java.util.*;

/**
 * 
 */

/**
 * @author Ramon
 *
 */
public class Ejercicio7 {

	/**
	 * PDF-Ejercicio de Condicionales 7/22
	 * Descripcion:
	 * Condicionales Ejercicio con if/else.
	 */
	public static void main(String[] args) {
		// Juego de adivinar el número secreto. El ordenador nos preguntará un
		// número del 1 al 10. Si coincide con el número secreto (que habrás
		// codificado como una constante entera) nos felicitará. Si no, nos dirá
		// que hemos fallado.
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca un numero entre 1 y 10 ");
		int num = entrada.nextInt();
		final int secreto = 5;

		if (num == secreto) {
			System.out.println("Felicidades!! has adivinado el numero secreto");
		} else {
			System.out.println("Has fallado!!");
		}

		entrada.close();
	}

}
