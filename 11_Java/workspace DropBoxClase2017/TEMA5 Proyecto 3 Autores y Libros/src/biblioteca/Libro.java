package biblioteca;

import java.util.Scanner;

/*
 * @author Ramon
 * */
public class Libro {

	private String titulo;
	private String isbn;
	private Autor autor;
	private int anyoActual;
	
	public Libro() {

	}
	public Libro(Autor Autor){
		this.autor = Autor;
	}

	public Libro(String titulo) {
		this.titulo = titulo;
	}

	public Libro(String titulo, String isbn, int AnyoActual, Autor autor) {
		
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.anyoActual = AnyoActual;
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
	
	public int getAnyoActual() {
		return anyoActual;
	}

	public void setAnyoActual(int anyoActual) {
		this.anyoActual = anyoActual;
	}
	public String toString(){

		
		return "El Titulo es " + titulo + "\nEl ISBN es " + isbn + "\nEl Año actual es " + anyoActual + "\n El autor es " + autor.toString();
	}
	public void leeDatos(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Titulo del Libro");
		titulo = sc.nextLine();
		System.out.println("ISBN");
		isbn = sc.nextLine();
		
		System.out.println("Año del Libro");
		anyoActual = sc.nextInt();
		
		System.out.println("Datos " + autor.toString());
		
		//sc.close();
	}
}
