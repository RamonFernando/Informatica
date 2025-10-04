/**
 * @author Ramon
 *
 */

package principal;

public abstract class Persona {
	private String dni;
	private String nombre;
	private String apellidos;

	public Persona() {

	}

	public Persona(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public void mostrar() {
		System.out.println("DNI: " + dni);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Nombre: " + nombre);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}