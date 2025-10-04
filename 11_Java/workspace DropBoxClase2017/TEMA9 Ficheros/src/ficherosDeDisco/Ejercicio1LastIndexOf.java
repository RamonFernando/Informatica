package ficherosDeDisco;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.text.Position;

public class Ejercicio1LastIndexOf {

	public Ejercicio1LastIndexOf() {
		// TODO Auto-generated constructor stub
	}

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Nombre del archivo que desea copiar");
			Scanner entrada = new Scanner(System.in);
			String ruta = "";
			String nombre = "";
			String extension = "";
			int posicion = 0;

			ruta = entrada.next();
			System.out.println(ruta);
			posicion = ruta.lastIndexOf(".");
			nombre = ruta.substring(0, posicion);
			extension = ruta.substring(posicion);
			System.out.println(nombre + ".copia" + extension);

			FileOutputStream archivo = new FileOutputStream("ficheros/" + ruta);
			

			
			byte caracter1 = 0101;
			


			archivo.write(caracter1);

			FileInputStream leer = new FileInputStream("ficheros/" + ruta);

			FileOutputStream archivoSalida = new FileOutputStream("ficheros/"
					+ nombre + ".copia" + extension, true);

			boolean eof = false;
			int caracter = 0;
			int cont = 0;
			while (!eof) {
				caracter = leer.read();
				if (caracter == -1) {
					System.out.println("Fin");
					eof = true;
				} else {
					archivoSalida.write(caracter);
					System.out.println(caracter + " ");
					cont++;
				}
			}
		
			System.out.println(caracter1);
			System.out.println("Se han copiado " + cont + " bytes");
			leer.close();
			archivoSalida.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
