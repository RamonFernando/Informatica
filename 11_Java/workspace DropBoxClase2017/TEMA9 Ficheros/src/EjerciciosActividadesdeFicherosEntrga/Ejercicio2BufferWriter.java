package EjerciciosActividadesdeFicherosEntrga;

import java.io.*;
import java.util.Scanner;

public class Ejercicio2BufferWriter {
	/**
	 * 2.- Crea una aplicación de consola que pida el nombre, apellidos y
	 * teléfono de tres personas y los guarde en un archivo llamado
	 * contactos.txt. Si el archivo ya existe, deberá añadir la información
	 * nueva al final del archivo.
	 * 
	 * El formato de grabado será CSV. Por ejemplo: Pérez
	 * Jiménez,Roberto,555-201191 López Ruz,Carlos,555-261171
	 * 
	 */
	public Ejercicio2BufferWriter() {

	}

	public static void main(String[] args) {

		ejecutar();

	}

	private static void ejecutar() {
		try {
			FileWriter archivo = new FileWriter("ficheros/Archivo.txt");
			BufferedWriter buffer = new BufferedWriter(archivo);
			Scanner entrada = new Scanner(System.in);
			String nombre = "";
			String apellidos = "";
			String telefono = "";

			for (int i = 1; i <= 3; i++) {
				System.out.println((i) + "º Escriba su nombre");
				nombre = entrada.nextLine();
				System.out.println((i) + "º Escriba sus apellidos");
				apellidos = entrada.nextLine();
				System.out.println((i) + "º Escriba su telefono");
				telefono = entrada.nextLine();
				System.out.println((i) + "º " + apellidos + ", " + nombre
						+ ", " + telefono);

				buffer.write(apellidos + "," + nombre + "," + telefono);
				buffer.newLine();
			}

			buffer.close();
			entrada.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
