/**
 * 
 */
package Ejercicio1T5PersonaconMetodoMostrar;

/**
 * @author Ramon
 *
 */
public class Profesora {

	// Atributos
	String dni;
	String nombre;
	String apellidos;
	int edad;
	double altura;
	public Profesora(String DNI, String Nombre, String Apellidos, int Edad,
			double Altura) {
		
		this.dni = DNI;
		this.nombre = Nombre;
		this.apellidos = Apellidos;
		this.edad = Edad;
		this.altura = Altura;
	}
	void mostrar(){
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellidos);
		System.out.println("Edad: " + edad + " años");
		System.out.println("Altura: " + altura + "cm");
	}
	

}
