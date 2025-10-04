package RepasoExamenT9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class LecturaTextoBufferRead {
	/**
	 * 1-Crear Archivo,2-Pasarlo por consola,3-copiarlo,4-Leerlo
	 */
	private static Scanner entrada = new Scanner(System.in);

	LecturaTextoBufferRead() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seleccionar();

	}

	private static void seleccionar() {
		JFileChooser seleccionar = new JFileChooser();
		int localizacion = seleccionar.showOpenDialog(null);
		File ruta = seleccionar.getSelectedFile();
		System.out.println(System.getProperty("user.dir") + "\\fichero");
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.home"));

		try {
			FileReader archivo = new FileReader(ruta);
			BufferedReader bufferLeer = new BufferedReader(archivo);
			FileWriter archivoSalida = new FileWriter(ruta, true);
			BufferedWriter bufferWrite = new BufferedWriter(archivoSalida);

			System.out.println(ruta);

			boolean eof = false;
			String linea = entrada.nextLine();
			int cont = 0;

			bufferWrite.write(linea);
			bufferWrite.newLine();

			bufferWrite.close();
			while (!eof) {
				linea = bufferLeer.readLine();
				if (linea == null) {
					System.out.println("Fin");
					eof = true;
				} else {

					System.out.println(linea + " ");
					cont++;

				}
			}

			System.out.println("Se han leido " + cont + " linea");

			bufferLeer.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
