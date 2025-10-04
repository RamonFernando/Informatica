/**
 * 
 */
package inicio;

import biblioteca.Autor;
import biblioteca.Libro;

/**
 * @author Ramon
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// EJERCICIO
		// Crea un proyecto con dos paquetes:
		// • biblioteca • inicio
		// Dentro del paquete biblioteca, crea dos clases llamadas Autor y
		// Libro. Estas clases nos servirán para guardar información de libros y
		// escritores.
		// Dentro del paquete inicio, crea una clase Inicio (que contendrá un
		// método main).
		// Las características de la clase Autor son:

		// Autor
		// - String nombre
		// - String email
		// - int fechaNacimiento
		// + Autor (nombre,email, fechaNacimiento)
		// + Autor(nombre)
		// + Todos los getters y setters + String toString ( )
		// Cuando en un constructor no se explicite algún parámetro éste será
		// "Unknown" si se trata del email ó 0 si se trata de la fecha de
		// nacimiento.
		// Las características de la clase Libro son:

		// Libro
		// - String titulo
		// - String isbn
		// - Autor autor
		// - int anyoActual
		// + Libro(titulo)
		// + Libro (titulo, isbn, autor)
		// + Todos los getters y setters + String toString( )
		// El valor de anyoActual deberá ser el mismo para todos los objetos
		// Libro.
		// En el método main:
		// • Se pedirá al usuario que se introduzcan los datos de un autor:
		// nombre, email, fecha de nacimiento, y se guardarán en un objeto de
		// tipo Autor.
		// • Se pedirá al usuario que introduzca el título, ISBN y
		// año actual de un libro. El autor será el que se ha dado de alta en el
		// apartado anterior. Los datos del libro se guardarán en un objeto
		// de la clase Libro.
		// • Se mostrarán en pantalla los datos del autor
		// usando toString ( ).
		// • Se mostrarán en pantalla los datos del libro
		// usando también toString ( ).

		// Modifica el proyecto 3 para permitir que un libro tenga varios
		// autores. De esta forma, el atributo autor de la clase Libro pasará a
		// ser un array de autores.
		// El método toString( ) deberá mostrar, en el caso de que haya más de
		// un autor, la frase "Varios autores".
		// Añadiremos un nuevo método, muestraAutores( ) que nos mostrará una
		// lista con guiones con los nombres de todos los autores del libro.
		// Observación: Estos cambios no afectan a la clase Autor, que no
		// cambia.
		// Libro
		// - String titulo - String isbn - Autor[ ] autores - int anyoActual
		// + Libro (titulo) + Libro (titulo, isbn, autores)
		// + Todos los getters y setters + String toString( )
		// + String muestraAutores()

		// -----------------------
		Autor a1 = new Autor("Ramon", "ramon@.com", 1988);
		System.out.println(a1.toString());
		// -----------------------
		// Libro l1 = new Libro("Codigo Davinci", "123LS", 2010, a1);
		System.out.println(l1.toString());
		// -----------------------

	}

}
