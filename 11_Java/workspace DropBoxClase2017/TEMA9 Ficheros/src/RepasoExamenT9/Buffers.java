package RepasoExamenT9;

import java.io.*;

public class Buffers {
	// Ejemplo: Programa que guarda en un fichero los números del 1 al 50 y
	// después los lee, usando
	// buffers.

	public Buffers() {

	}

	public static void main(String[] args) {

		leer();

		escribir();

	}

	private static void escribir() {
		try {
			FileOutputStream archivoSalida = new FileOutputStream(
					"ficheros/Entrada.txt");
			BufferedOutputStream buffer = new BufferedOutputStream(
					archivoSalida);
			boolean tof = false;

			int cont = 0;

			for (int i = 1; i <= 50; i++) {

				buffer.write(i);
				cont = i;
			}

			// if (cont == 50) {
			// tof = true;
			// System.out.println(tof);
			// } else {
			// tof = false;
			// System.out.println(tof);
			// System.out.println("Hay " + cont + " numeros y deben ser 50");
			// }

			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void leer() {
		// TODO Auto-generated method stub
		try {
			FileInputStream archivo = new FileInputStream(
					"ficheros/Entrada.txt");
			BufferedInputStream buffer = new BufferedInputStream(archivo);

			boolean eof = false;
			int caracter = 0;
			int cont = 0;

			while (!eof) {
				caracter = buffer.read();
				if (caracter == -1) {
					System.out.println("Fin");
					eof = true;
				} else {
					System.out.println(caracter + " ");
					cont++;
				}
			}
			System.out.println("Se han contado " + cont + " numeros");

			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
