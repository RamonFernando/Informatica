
/**
 * @author Ramon
 *
 */
import java.util.Scanner; // Estos son librerias de javas que estan en el 
							// JRE(Java developed enviropement) 
							// que se instalan cuando instalas Java.

public class Practica14EntradaDatos {

	/**
	 * Entrada de Datos por consola.
	 */
	public static void main(String[] args) {
		// Aqui empesamos a utilizar el objeto Scanner.

		Scanner entrada = new Scanner(System.in); // Mediante este comando se le
													// dice a Eclipse que
													// "entrada"
													// es el objeto que
													// permitira
													// la entrada de datos por
													// el comando anterior.

		System.out.println("Cual es tu edad? ");
		int edad = entrada.nextInt(); // Este es el comando mediante el cual
										// eclipse reconoce la entrada de un
										// valor entero(int).
										// int edad -- Aqui se crea la variable
										// edad en la cual el usuario introduce
										// la edad.

		System.out.println("Tu edad es: " + edad + " años. "); // Aqui el usuario ve por
													// pantalla "Tu edad es: "
													// mas la variable edad en
													// la que se guardo el valor
													// que se introdujo por
													// consola.

		// "Numero"
		// int comandos = entrada.nextLine() Line
		// int comandos = entrada.next(); String

		// "Letras o cadena de caracteres"
		// int comandos = entrada.nextInt() Int
		// int comandos = entrada.nextByte() Byte
		// int comandos = entrada.nextShort() Short
		
		
		entrada.close();
	}

}
