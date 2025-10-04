package RepasoExamenT9;

import java.io.*;

import javax.swing.JFrame;
	

public class LectorByte1 extends JFrame{

	public LectorByte1() {
		
	}

	public static void main(String[] args) {
		
		
		ejecutar();
		
		// new LectorByte1();
		
		

	}

	private static void ejecutar() {
		try {
			boolean eof = false;
			int caracter = 0;
			String line;
			int cont = 0;
			
			FileInputStream archivoEntrada = new FileInputStream("ficheros/Texto.txt");
			FileOutputStream archivoSalida = new FileOutputStream("ficheros/Texto_copia.txt");
			while (!eof) {
				caracter = archivoEntrada.read();
				
				if (caracter == -1) {
					System.out.println("Fin " + caracter);
					eof = true;
					
				}else {
					archivoSalida.write(caracter);
					System.out.println(" " + caracter);
					
					cont++;
				}
			}
			System.out.println("Se han leido: " + cont + " bytes");
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
