package Ejemplo12Atributos;

public class Persona {

	// Atributos
	String dni;
	String nombre;
	String apellidos;
	int edad;

	// Constructores
	Persona(String dni, String nombre, String apellidos, 
			int edad) {
		System.out.println("Se ha llamado al constructor " + "Persona(dni, nombre, apellidos, edad)");
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;

	}

	Persona() {
		System.out.println("Se ha llamado al constructor Persona()");
	}

	Persona(String nombre, String apellidos) {
		
		this("00000000A",nombre, apellidos, 30);
		
//		this.nombre = nombre;
//		this.apellidos = apellidos;
//		Damos a dni y edad unos valores por defecto.
//		dni = "0000000A";
//		edad = 30;
	}

	// Métodos
	void mostrar() {
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
	}

}
