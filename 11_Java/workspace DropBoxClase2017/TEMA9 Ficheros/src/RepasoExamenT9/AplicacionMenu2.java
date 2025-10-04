package RepasoExamenT9;

import java.io.*;

import javax.swing.*;

import java.util.*;

public class AplicacionMenu2 {

	public AplicacionMenu2() {
		// TODO Auto-generated constructor stub
	}

	private static Scanner entrada = new Scanner(System.in);
	private static String opc = "";
	private static FileWriter archivo;
	private static FileReader archivo1;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			menuPrincipal();
		}
	}

	private static void menuPrincipal() {

		System.out.println("Menú Principal");
		System.out.println("==============");
		System.out.println("1. Crear Archivo");
		System.out.println("2. Escribir");
		System.out.println("3. Cambiar Archivo");
		System.out.println("4. Copiar");
		System.out.println("5. Eliminar");
		System.out.println("6. Salir");

		opc = entrada.nextLine();

		if (opc.equals("1")) {
			crearArchivo();
		} else if (opc.equals("2")) {
			escribir();
		} else if (opc.equals("3")) {
			cambiararchivo();

		} else if (opc.equals("4")) {
			copiar();

		} else if (opc.equals("5")) {
			eliminar();
		} else if (opc.equals("6")) {
			System.out.println("Saliendo del Programa...");
			System.exit(0);
		} else {
			System.out.println("Error de entrada");

		}

	}

	private static void crearArchivo() {
		// TODO Auto-generated method stub
		try {
			archivo = new FileWriter(
					"ficheros/Configuracion/Pruebas/Archivos.txt");
			BufferedWriter buffer = new BufferedWriter(archivo);
			String linea = entrada.nextLine();

			buffer.write(linea);
			buffer.newLine();

			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void escribir() {
		try {
			archivo1 = new FileReader("ficheros/Configuracion/Pruebas/Archivos.txt");
			BufferedReader buffer = new BufferedReader(archivo1);
			
			
			String linea = entrada.nextLine();
			
			boolean eof = false;
			while (!eof) {
				linea = buffer.readLine();
				if (linea == null) {
					System.out.println("Fin");
					eof = true;
				}else {
					
					System.out.println(linea + " " );
					
				}
			}
			
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	private static void cambiararchivo() {
		// TODO Auto-generated method stub

	}

	private static void eliminar() {
		// TODO Auto-generated method stub

	}

	private static void copiar() {
		// TODO Auto-generated method stub

	}

}
