/**
 * 
 */
package Ejemplo1Persona;

/**
 * @author Ramon
 *
 */
public class Persona {

	/**
	 * Constructores()
	 */
	
		// Atributos
		String dni;
		String nombre;
		String apellidos;
		int edad;
		
		
		// Constructores
		Persona(String DNI, String Nombre, String Apellidos, int Edad ){
			
			this.dni = DNI;
			this.nombre = Nombre;
			this.apellidos = Apellidos;
			this.edad = Edad;
		}
		// Metodos 
		void mostrar(){
			System.out.println("DNI: " + dni);
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Edad: " + edad);
		}
		
	

}
