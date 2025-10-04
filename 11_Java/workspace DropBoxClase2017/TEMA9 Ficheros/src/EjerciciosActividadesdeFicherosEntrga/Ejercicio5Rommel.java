package EjerciciosActividadesdeFicherosEntrga;

import java.io.*;
import java.util.*;

import javax.swing.*;

public class Ejercicio5Rommel {

	public Ejercicio5Rommel() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contadorCase = 0;
		int contadorBreak = 0;
		String linea = "";

		JFileChooser eleccion = new JFileChooser();
		int opc = eleccion.showOpenDialog(null);

		if (opc == 0) {
			try {
				// El getSelectFile devuelve la ruta entera
				FileReader miArchivo = new FileReader(eleccion.getSelectedFile());
				BufferedReader buffer = new BufferedReader(miArchivo);
				
				boolean eof = false;
				while (!eof) {
					linea = buffer.readLine();
					if (linea == null) {
						System.out.println("Fin");
						eof = true;
					}else {
						// Replace es para cambiar un caracter por otro
						linea = linea.replace(".", "");
						linea = linea.replace(";", "");
						linea = linea.replace(",", "");
						linea = linea.replace("\n", "");
						linea = linea.replace("\t", "");
						
						String[] lineaCadena = linea.split(" ");
						
						for (int i = 0; i < lineaCadena.length; i++) {
							if (lineaCadena[i].equals("case")) {
								contadorCase ++;
							}
							if (lineaCadena[i].equals("break")) {
								contadorBreak ++;
							}
							if (lineaCadena[i] == null) {
								break;
							}
						}
						
					}
				}
				System.out.println("\n- - - - - - - - - - - - - - -");
				System.out.println("Break: " + contadorBreak);
				System.out.println("Case: "  + contadorCase);
				if (contadorBreak < contadorCase) {
					System.out.println("El sistema puede dar un error");
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
