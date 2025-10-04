package EjerciciosActividadesdeFicherosEntrga;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4HTML {
	/**
	 * 4.- Escribe una aplicación de texto que lea un título, un encabezado y un
	 * texto y genere en tu carpeta personal, un archivo index.html
	 * 
	 */

	public Ejercicio4HTML() {

	}

	public static void main(String[] args) {

		ejecutar();

	}

	private static void ejecutar() {
		try {
			FileWriter archivo = new FileWriter("ficheros/index.html");
			BufferedWriter buffer = new BufferedWriter(archivo);
			String line = "";

			String title = "";
			String encabezado = "";
			String texto = "";

			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduzca el titulo");
			title = entrada.nextLine();
			System.out.println("Introduzca encabezado");
			encabezado = entrada.nextLine();
			System.out.println("Introduzca el Texto");
			texto = entrada.nextLine();

			buffer.write("<HTML>");
			buffer.newLine();
			buffer.write("<Head>");
			buffer.newLine();
			buffer.write("<title>" + title + "</title>");
			buffer.newLine();
			buffer.write("</Head>");
			buffer.newLine();
			buffer.write("<Body>");
			buffer.newLine();
			buffer.write("<h1>" + encabezado + "</h1>");
			buffer.newLine();
			buffer.write("<p>" + texto + "</p>");
			buffer.newLine();
			buffer.write("</Body>");
			buffer.newLine();
			buffer.write("</HTML>");
			buffer.newLine();
			buffer.newLine();

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