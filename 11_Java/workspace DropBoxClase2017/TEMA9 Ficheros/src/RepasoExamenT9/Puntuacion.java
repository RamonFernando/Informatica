package RepasoExamenT9;

import java.io.*;
import java.util.Scanner;

public class Puntuacion {

	/**
	 * NO Actividad: Crear un programa que mantenga una lista de jugadores y
	 * puntuaciones de un juego. Deberá tener una ventana donde se muestren
	 * todas las puntuaciones y un botón que permita agregar una puntuación.
	 */
	/**
	 * SI Ejemplo: Programa que guarda en un archivo de texto el nombre y la
	 * puntuación del usuario de un juego.
	 */

	public Puntuacion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		puntuaciones();

	}

	private static void puntuaciones() {
		String[] nombres = { "Ramon", "Rommel", "Fran" };
		int[] puntuaciones = { 6, 9, 8 };
		int[] puntuaciones1 = new int[8];
		String[] nombres1 = new String[8];
		Scanner entrada = new Scanner(System.in);

		try {
			FileWriter archivo = new FileWriter("ficheros/Archivo1.txt");
			BufferedWriter buffer = new BufferedWriter(archivo);
			String linea = "";

			buffer.write(linea);
			buffer.newLine();

			for (int i = 0; i < nombres.length; i++) {

				System.out.println(nombres[i] + " " + puntuaciones[i]);
				System.out.println("- - - - - - - - - - - - -");

			}
			for (int i = 0; i < nombres1.length; i++) {
				System.out.println(i + "º Puntuacion y Nombre");
				puntuaciones1[i] = entrada.nextInt();
				nombres1[i] = entrada.nextLine();
				buffer.write(puntuaciones1[i] + " " + nombres1[i]);
				buffer.newLine();

				if (puntuaciones1[i] == -1) {
					for (int j = 0; j < nombres1.length; j++) {
						System.out
								.println(nombres1[j] + " " + puntuaciones1[j]);
					}

					break;
				}
			}

			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
