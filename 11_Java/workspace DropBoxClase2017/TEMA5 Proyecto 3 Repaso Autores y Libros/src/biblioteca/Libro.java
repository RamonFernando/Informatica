/**
 * 
 */
package biblioteca;

/**
 * @author Ramon
 *
 */
public class Libro {

	/**
	 * Atributos
	 */
	private String titulo;
	private String isbn;
	private int anyoActual;
	private Autor autor;

	public Libro(String titulo) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor para meter los parametros del Libro
	 * 
	 * @param titulo
	 * @param isbn
	 * @param autor
	 * @param anyoActual
	 */
	public Libro(String titulo, String isbn, int anyoActual, Autor autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.anyoActual = anyoActual;
	}

	// Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getAnyoActual() {
		return anyoActual;
	}

	public void setAnyoActual(int anyoActual) {
		this.anyoActual = anyoActual;
	}

	/**
	 * toString titulo isbn autor anyoActual
	 */
	public String toString() {
		return "Libro [titulo= " + titulo + ", isbn= " + isbn + ", autor= "
				+ autor + ", anyoActual= " + anyoActual + "]";
	}

}
