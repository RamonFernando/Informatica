package RepasoExamenT9;

import java.io.*;
import java.util.Scanner;

import javax.swing.*;

public class AplicacionMenu1 {
	/**
	 * crea un programa con las siguiente caracteristicas
	 * 
	 * 1)selecionar archivo ; //selecionara un archivo y nos mostrara su ruta.
	 * 2)leer archivo; //Leera el archivo selecionado, de no tener ninguno nos
	 * lo pedira. 3)introducir line; //Introducira una linea al final del
	 * archivo selecionado, de no tener ninguno nos lo pedira. 4)Cerrar.
	 */
	private static Scanner entrada = new Scanner(System.in);
	private static int opc;
	private static JFileChooser archivo;

	public AplicacionMenu1() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			menuPrincipal();
		}

	}

	private static void menuPrincipal() {
		System.out.println("Menú Principal");
		System.out.println("==============");
		System.out.println("Que opcion deseas: ");
		System.out.println("1) Menu Principal");
		System.out.println("2) Seleccionar acrchivo");
		System.out.println("3) Leer Archivo");
		System.out.println("4) Introducir linea");
		System.out.println("5) Cerrar");

		opc = entrada.nextInt();

		if (opc == 1) {
			menuPrincipal();
		} else if (opc == 2) {
			seleccionarArchivo();
		} else if (opc == 3) {
			leerArchivo();
		} else if (opc == 4) {
			escribir();
		} else if (opc == 5) {
			System.out.println("Saliendo del programa...");
			System.exit(0);
		} else {
			System.out.println("Error de entrada.\n");
		}

	}

	private static void escribir() {
		if (archivo == null) {
			seleccionarArchivo();
		} else {

			try {

				FileWriter archivoEntrada = new FileWriter(
						"ficheros/Archivo.txt", true);
				BufferedWriter buffer = new BufferedWriter(archivoEntrada);

				boolean eof = false;
				entrada.nextLine();
				String caracter = entrada.nextLine();

				buffer.write(caracter);
				buffer.newLine();
				buffer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\nPulsa enter para continuar");

		}
	}

	private static void leerArchivo() {
		if (archivo == null) {
			seleccionarArchivo();
		} else {

			try {
				FileReader archivo = new FileReader("ficheros/Archivo.txt");
				BufferedReader buffer = new BufferedReader(archivo);

				boolean eof = false;
				String linea = "";
				int cont = 0;
				while (!eof) {
					linea = buffer.readLine();
					if (linea == null) {
						System.out.println("Fin");
						eof = true;
					} else {
						// buffer.write("Fichero: ");
						System.out.println(linea + " ");
						cont++;
					}
				}
				System.out.println("Se han leido " + cont + " lineas");
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

	private static void seleccionarArchivo() {
		// TODO Auto-generated method stub
		System.out.println("Abriendo directorio...");
		archivo = new JFileChooser();
		int resultado;
		resultado = archivo.showOpenDialog(null);
		System.out.println("Ruta: " + archivo.getSelectedFile());

		if (resultado != archivo.APPROVE_OPTION) {
			System.out.println("Cancelar");
		} else {
			System.out.println("Aceptar");
		}

	}

}
