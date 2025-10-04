package Examen3EscrituraEnDisco;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Ejercicio2Examen {
	/**
	 * 2.- Escribe una aplicación que pida al usuario la ruta a un archivo
	 * (usando un JFileChooser) y lo elimine (debe desaparecer el archivo, no
	 * sólo borrar el contenido del mismo). En caso de que el usuario pulse el
	 * botón Cancelar del JFileChooser (o el botón de cierre), el programa no
	 * hará nada con el archivo y mostrará el mensaje "Operación cancelada".
	 * 
	 */

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFileChooser eleccion = new JFileChooser();
		int opcion = eleccion.showOpenDialog(null);
		File ruta = eleccion.getSelectedFile();

		if (opcion != JFileChooser.APPROVE_OPTION) {

			System.out.println("Operacion Cancelada");
			return;

		} else {
			System.out.println("Aceptado");
		}
		System.out.println(eleccion.getSelectedFile().toString());

		File archivo = eleccion.getSelectedFile();
		archivo.delete();

		System.out.println(ruta);

	}

}
