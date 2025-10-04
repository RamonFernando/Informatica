/**
 * @author Ramon
 *
 */
package principal;

public class Cliente extends Persona {
	private String visa;

	public Cliente() {

	}

	public Cliente(String dni, String nombre, String apellidos, String visa) {
		super(dni, nombre, apellidos);
		this.visa = visa;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Visa: " + visa);
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}

}