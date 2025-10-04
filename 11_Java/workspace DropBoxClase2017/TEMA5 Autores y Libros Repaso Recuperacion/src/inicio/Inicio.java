package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {
		// Se importan los paquetes biblioteca.autor y b.libro
		Autor a3 = new Autor("Ramon Perez", "ramon@.com", 1988);
		System.out.println(a3.toString());
		Scanner entrada = new Scanner(System.in);
		// Autor
		System.out.println("Introduzca el nombre del Autor");
		String autor = entrada.nextLine();
		System.out.println("Introduzca el email del Autor");
		String email = entrada.nextLine();
		System.out.println("Introduzca fecha de Nacimiento del Autor");
		int anyoAutor = entrada.nextInt();

		Autor a1 = new Autor(autor, email, anyoAutor);
		// entrada.next();

		// Libro
		System.out.println("Introduzca el Titulo del Libro");
		String titulo = entrada.nextLine();
		entrada.next();
		System.out.println("Introduzca el ISBN");
		String isbn = entrada.nextLine();
		entrada.next();
		System.out.println("Introduzca el Año actual");
		int AnyoActual = entrada.nextInt();

		Libro l1 = new Libro(titulo, isbn, a1);
		l1.setAnyoActual(AnyoActual);

		Autor a2 = new Autor("Shakespiare");
		System.out.println("Autores");
		System.out.println("- - - - - - - - - - - - - - - ");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());

	}

}
