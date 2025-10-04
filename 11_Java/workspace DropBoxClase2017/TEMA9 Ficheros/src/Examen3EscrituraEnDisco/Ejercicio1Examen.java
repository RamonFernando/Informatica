package Examen3EscrituraEnDisco;

import java.io.*;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1Examen {
	/**
	 * Ejercicio1.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// FileReader archivoEntrada = new
			// FileReader("archivo/personal.txt");
			// BufferedReader bufferLeer = new BufferedReader(archivoEntrada);
			FileWriter archivo = new FileWriter("ficheros/personal.txt");
			BufferedWriter buffer = new BufferedWriter(archivo);
			Scanner entrada = new Scanner(System.in);
			String nombre;
			String apellidos;

			System.out.println("Escriba su nombre: ");
			nombre = entrada.nextLine();
			System.out.println("Escriba su apellido: ");
			apellidos = entrada.nextLine();

			String linea = "";

			buffer.write("*** DATOS PERSONALES ***");
			buffer.newLine();
			buffer.write("Nombre: " + nombre);
			buffer.newLine();
			buffer.write("Apellidos: " + apellidos);
			buffer.newLine();
			buffer.write("Guardado en disco");
			buffer.newLine();

			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Guardando en disco...");

			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
