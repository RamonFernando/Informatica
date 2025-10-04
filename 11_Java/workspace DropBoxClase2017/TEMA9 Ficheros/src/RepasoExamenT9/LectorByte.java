package RepasoExamenT9;

import java.io.*;

public class LectorByte {

	// Leer en un fichero

	public LectorByte() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			FileInputStream archivo = new FileInputStream("ficheros/Texto.txt");

			boolean eof = false;
			int caracter = 0;
			int contador = 0;
			int cont = 0;
			while (!eof) {
				caracter = archivo.read();

				if (caracter == -1) {
					System.out.println();
					System.out.println("Fin " + caracter);
					eof = true;
					// break;
				} else {
					archivo.read();
					// System.out.print(" " + caracter);
					contador++;
					if (cont >= 20) {
						cont = 0;
						System.out.println(caracter);
					}else {
						System.out.print(caracter);
						cont ++;
					}
				}

			}
			System.out.println();
			System.out.println("Se han leido " + contador + " bytes");
			archivo.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error: " + e.toString());
		}

	}

}
