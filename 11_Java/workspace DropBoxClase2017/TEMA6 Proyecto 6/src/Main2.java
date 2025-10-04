import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		System.out.println(leeInt());
	}

	/**
	 * Lee un número entero desde la consola y lo devuelve. Si el usuario
	 * escribe una entrada incorrecta, se le vuelve a preguntar indefinidamente.
	 * 
	 * @return Número leído desde la terminal.
	 */
	public static int leeInt() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escriba un número: ");
		String num;
		int numero = 0;

		while (true) {

			try {
				num = entrada.nextLine();
				numero = Integer.parseInt(num);
				break;

			} catch (Exception e) {
				System.out.println("Escriba un número");
			}
		}

		return numero;

	}

}

