/**
 * 
 */
package biblioteca;

/**
 * @author Ramon
 *
 */
public class Autor {

	// Atributos
	/**
	 * Atributos
	 */
	private String nombre;
	private String email;
	private int fechaNacimiento;

	public Autor(String nombre) {
		this.nombre = nombre;
		this.email = "Uknown";
		this.fechaNacimiento = 0;
	}

	/**
	 * Constructor para meter parametros del Autor
	 * 
	 * @param Nombre
	 * @param Email
	 * @param FechaNacimiento
	 */
	public Autor(String Nombre, String Email, int FechaNacimiento) {
		this.nombre = Nombre;
		this.email = Email;
		this.fechaNacimiento = FechaNacimiento;
	}

	// Getters y Setters
	/**
	 * Getters y Setters
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * toString
	 */
	public String toString() {
		return "Nombre: " + nombre + "\n" + "Email: " + email + "\n"
				+ "Fecha de Nacimiento " + fechaNacimiento;
	}

}
