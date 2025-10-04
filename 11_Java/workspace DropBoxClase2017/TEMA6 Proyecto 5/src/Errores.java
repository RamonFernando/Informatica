import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ramon
 *
 */
public class Errores {

	/**
	 * 
	 */
	public Errores() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un numero entero");
		System.out.println("Escribe un nº");
		String numero = entrada.nextLine();
		// int num = Integer.parseInt(numero);
		try {
			int num = Integer.parseInt(numero);
			
			while (num < 0) {
				System.out.println("Tienes que introducir un numero positivo!!");
				System.out.println("Escribe un nº");
				numero = entrada.nextLine();
			}
			System.out.println("La division de 20 entre " + numero + " es igual a " + 20 / num);
			
		} catch (NumberFormatException e) {
			
			System.out.println("Tienes que escribir un numero entero!!");
		} catch (ArithmeticException e) {
			// while (num == 0) {
			// System.out.println("No se puede dividir por cero!!");
			// System.out.println("Escribe un nº");
			// numero = entrada.nextLine();
			// }
			System.out.println("No se puede dividir por cero!!");
		} catch (Exception e) {
			System.out.println("Parametro incorrecto!!");
		}

		entrada.close();

	}

}
