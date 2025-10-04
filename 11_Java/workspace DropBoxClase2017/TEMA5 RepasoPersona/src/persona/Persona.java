/**
 * 
 */
package persona;

/**
 * @author Ramon
 *
 */

public class Persona {
	
	// Atributos Agregar
	 String dni;
	 String nom;
	 long telefono;
	 
	
	 
	
	/**
	 * @param Constructor de Persona
	 */
	public Persona() {
		// Metodos de acceso
		
	}
	
	/**
	 * Constructor Persona
	 * @param dni
	 * @param nom
	 * @param telefono
	 */
	public Persona(String dni, String nom, long telefono) {
		
		this.dni = dni;
		this.nom = nom;
		this.telefono = telefono;
	}
	public void MostrarPersona(String DNI, String Nom, long Telefono ){
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nom);
		System.out.println("Telefono: " + Telefono);
	}

	
}
