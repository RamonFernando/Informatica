/**
 * 
 */
package Ejercicio1T5PersonaconMetodoMostrar;

/**
 * @author Ramon
 *
 */
public class PersonaMetodoMostrar {

	// Atributos
	String dni;
	String nombre;
	String apellidos;
	int edad;

	public PersonaMetodoMostrar(String DNI, String Nombre, String Apellidos,
			int Edad) {

		this.dni = DNI;
		this.nombre = Nombre;
		this.apellidos = Apellidos;
		this.edad = Edad;
	}

	void mostrar() {
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellidos);
		System.out.println("Edad: " + edad + " años");
	}

}
