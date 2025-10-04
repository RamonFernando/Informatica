package EjerciciosActividadesdeFicherosEntrga;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3BufferRead {

	/**
	 * 3.- Crea una aplicación que lea el archivo anterior y muestre por la
	 * consola todos los datos guardados.
	 */
	// Ayuda: Recuerda el método split().
	// Con este formato:
	// Apellidos: Pérez
	// Jiménez Nombre: Roberto
	// Teléfono: 555-201191
	// ------
	// Apellidos: López Ruz
	// Nombre: Carlos
	// Teléfono: 555-261171
	// Diferencia entre InputStream y Reader: InputStream es para leer
	// Datos Binarios mientras que Reader es para leer texto.
	public Ejercicio3BufferRead() {

	}

	public static void main(String[] args) {

		ejecutar();

	}

	private static void ejecutar() {
		String arrayLinea[] = null;
		String linea = "";

		try {
			FileReader archivo = new FileReader("ficheros/Archivo.txt");
			BufferedReader buffer = new BufferedReader(archivo);

			boolean eof = false;

			int cont = 0;

			while (!eof) {
				linea = buffer.readLine();
				if (linea == null) {

					System.out.println("Fin");
					eof = true;
				} else {
					arrayLinea = linea.split(",");
					System.out.println("Apellidos: " + arrayLinea[1]);
					System.out.println("Nombre: " + arrayLinea[0]);
					System.out.println("Telefono: " + arrayLinea[2]);
					System.out.println("- - - - - - - - - -");

					cont++;
				}

			}
			System.out.println("Se han contado " + cont + " Usuarios");

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
