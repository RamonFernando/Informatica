package EjerciciosActividadesdeFicherosEntrga;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1LastIndexOf {

	/**
	 * 1.- Escribe un programa de línea de comandos cuya tarea sea copiar byte a
	 * byte un archivo dentro de la carpeta ficheros de tu proyecto. El nombre
	 * del archivo lo leerá por consola, y el nombre de la copia será el mismo
	 * anteponiendo la palabra "copia" a la extensión. Por ejemplo:
	 * unaimagen.jpg se copiará con el nombre miarchivo.copia.jpg Ayuda:
	 * Recuerda los métodos substring() y lastIndexOf().
	 */

	public Ejercicio1LastIndexOf() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ejecutar();

	}

	private static void ejecutar() {

		try {
			Scanner entrada = new Scanner(System.in);
			String ruta = "";
			String nombre = "";
			String extension = "";
			System.out.println("Introduzca el nombre del archivo");
			ruta = entrada.nextLine();
			System.out.println(ruta);
			int posicion = ruta.lastIndexOf(".");
			nombre = ruta.substring(0, posicion);
			extension = ruta.substring(posicion);
			System.out.println(nombre);
			System.out.println(extension);
			System.out.println(nombre + ".copia" + extension);
			FileInputStream archivoEntrada = new FileInputStream("ficheros/"
					+ ruta);
			FileOutputStream archivo = new FileOutputStream("ficheros/"
					+ nombre + ".copia" + extension);
			// BufferedOutputStream buffer = new BufferedOutputStream(archivo);
			boolean eof = false;
			int caracter = 0;
			int cont = 0;

			while (!eof) {
				caracter = archivoEntrada.read();
				if (caracter == -1) {
					System.out.println("Fin");
					eof = true;
				} else {
					archivo.write(caracter);
					System.out.println(caracter + " ");
					cont++;
				}

			}
			System.out.println("Se han copiado " + cont + " bytes");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
