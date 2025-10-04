package inicio;

import java.beans.FeatureDescriptor;

import biblioteca.Autor;
import biblioteca.Libro;

public class InicioBiblioteca {

	/*
	 * @author Ramon
	 * */
	public InicioBiblioteca() {
		
	}
	
	public static void main(String[] args) {
		
	// Metodo Main para hacer pruebas

		
		Autor a1 = new Autor();
		a1.leeDatos();
		
		Libro l1 = new Libro(a1);
		l1.leeDatos();
		
		Libro l2 = new Libro("Codigo Davinci","12bc", 2003, a1);
		
		
		Libro l3 = new Libro(a1);
		l3.leeDatos();
		System.out.println("Datos del Autor " + a1.toString());
		
		// Creamos otro autor con solo el nombre
		Autor a2 = new Autor("Miguel de Cervantes");
		// a2.leeDatos();
		System.out.println("Datos del Autor 2: \n" + a1.toString() + "\n" + l1.toString());
	}

	

}
