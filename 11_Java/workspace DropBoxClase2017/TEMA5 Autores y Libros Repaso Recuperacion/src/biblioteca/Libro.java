package biblioteca;

public class Libro {

	private String titulo;
	private String isbn;
	private Autor autor;
	private static int anyoAutor;

	public Libro(String titulo) {
		this.titulo = titulo;
	}

	public Libro(String titulo, String isbn, Autor autor) {
		
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		
	}

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
		return anyoAutor;
	}

	public void setAnyoActual(int anyoActual) {
		this.anyoAutor = anyoActual;
	}

	public String toString() {
		return "Titulo: " + titulo + ", ISBN: " + isbn + ", Autor: "
				+ autor.getNombre() + ", Año Autor: " + anyoAutor;

	}

}
