package RepasoExamenT9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class UsoBuffer {

	public UsoBuffer() {
		
	}

	public static void main(String[] args) {
		
		leer();
		
		escribir();

	}

	private static void escribir() {
		// Escribimos en el fichero
		try {
			FileOutputStream archivoEntrada = new FileOutputStream("ficheros/Salida.txt");
			BufferedOutputStream buffer = new BufferedOutputStream(archivoEntrada);
			// String []linea = {};
			
			for (int i = 0; i < 50; i++) {
				buffer.write(i);
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

	private static void leer() {
		// leemos en el fichero
		boolean eof = false;
		int caracter = 0;
		int cont = 0;
		
		try {
		
			FileInputStream archivoSalida = new FileInputStream("ficheros/Entrada.txt");
			BufferedInputStream buffer = new BufferedInputStream(archivoSalida);
			while (!eof) {
				caracter = buffer.read();
				
				if (caracter == -1) {
					System.out.println(" Fin ");
					eof = true;
				}else {
					System.out.println(" " + caracter);
					cont ++;
				}
			}
			System.out.println("Se han leido " + cont +  " bytes");
			
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
