package EjerciciosActividadesdeFicherosEntrga;

import java.io.*;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Ejercicio5Contador {

	/**
	 * 5.- Escribe una aplicación que te pregunte por consola el nombre de un
	 * archivo java (tiene que estar dentro del paquete). A continuación lo
	 * abrirá y contará cuántas veces aparece la palabra "case" y cuántas veces
	 * aparece la palabra "break". Ten en cuenta que en una misma línea podría
	 * aparecer más de un case y más de un break. Si el número de breaks es
	 * inferior al de cases, te avisará de que puede haber un error en el
	 * código.
	 * 
	 */

	public Ejercicio5Contador() {

	}

	public static void main(String[] args) {

		ejecutar();

	}

	private static void ejecutar() {

		JFileChooser eleccion = new JFileChooser();
		int seleccionar;
		seleccionar = eleccion.showOpenDialog(null);

		if (seleccionar == JFileChooser.APPROVE_OPTION) {
			FileReader archivo;
			try {
				archivo = new FileReader(eleccion.getSelectedFile().toString());
				BufferedReader buffer = new BufferedReader(archivo);
				System.out.println(eleccion.getSelectedFile().toString());
				System.out.println("Aceptar");
				String linea = "";
				int contCase = 0;
				int contBreake = 0;
				String compara[] = linea.split(" ");
				linea.replace(";", "");
				linea.replace(",", "");
				linea.replace("\n", "");

				for (int i = 0; i < compara.length; i++) {
					System.out.println(compara[i]);

					if (compara[i].equals("case")) {
						contCase++;
					}
					if (compara[i].equals("break")) {
						contBreake++;
					}

				}
				System.out.println(contCase);
				System.out.println(contBreake);
				if (contCase > contBreake) {
					System.out.println("Puede haber un error.");
				}

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}

		} else {
			System.out.println("Se ha cancelado la operacion");
		}

	}

}
