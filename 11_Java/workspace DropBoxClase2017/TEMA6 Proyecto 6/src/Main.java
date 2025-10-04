import java.util.Scanner;

public class Main {

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
		int num = 0;

		System.out.println("Escribe un número");

		try {

			num = entrada.nextInt();

		} catch (Exception e) {

			num = leeInt();
		}

		return num;
	}

}