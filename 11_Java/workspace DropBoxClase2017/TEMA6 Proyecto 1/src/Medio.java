
public abstract class Medio {

	private String nombre;
	private double duracion;

	public Medio() {
		// TODO Auto-generated constructor stub
	}

	// Si declaras un metodo abstracto en 
	// la clase madre todas las clases hijas
	// tendran que tenerlo.
	public abstract void reproducir();
}
