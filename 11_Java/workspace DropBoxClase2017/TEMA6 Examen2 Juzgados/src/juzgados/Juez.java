package juzgados;

/**
 * @author examen3
 *
 */
public class Juez {

	/**
	 * 
	 */
	// Atributos
	private String dni;
	private String apellidos;
	private String nombre;

	public Juez(String Dni, String Apellidos, String Nombre) {
		super();
		this.dni = Dni;
		this.apellidos = Apellidos;
		this.nombre = Nombre;
	}

	
	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String toString() {
		return "Juez dni: " + dni + "\n Apellidos: " + apellidos + "\n Nombre: " + nombre;
	}

}
