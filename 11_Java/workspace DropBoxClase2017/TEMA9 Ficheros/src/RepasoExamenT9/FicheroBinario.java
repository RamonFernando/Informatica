package RepasoExamenT9;

import java.io.*;

public class FicheroBinario {
	/**
	 * Escribir en un fichero binario
	 */

	public FicheroBinario() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		try {
			boolean eof = false;
			int caracter = 0;
			int cont = 0;
			
			FileInputStream archivoEntrada = new FileInputStream("ficheros/Texto.txt");
			FileOutputStream archivoSalida = new FileOutputStream("ficheros/Texto_copia.txt");
			
			while (!eof) {
				caracter = archivoEntrada.read();
				
				if (caracter == -1) {
					eof = true;
					
				}else {
					archivoSalida.write(caracter);
					System.out.println(" " + caracter);
					cont++;
				}
			}
			System.out.println("Se han leido y copiado " + cont + " bytes");
			
			archivoEntrada.close();
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
