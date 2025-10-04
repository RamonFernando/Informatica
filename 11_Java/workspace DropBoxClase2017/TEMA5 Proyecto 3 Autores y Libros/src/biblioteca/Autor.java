package biblioteca;

import java.util.Scanner;

public class Autor {

	private String nombre;
	private String email;
	private int fechaNacimiento;
	
	public Autor(){
		
	}

	public Autor(String nombre, String email, int fechaNacimiento) {

	}

	public Autor(String nombre) {

	}

	// Getters y Setters
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

	public String toString() {
		return "El nombre es " + nombre + "\nEl email es " + email
				+ "\nLa Fecha de Nacimiento es " + fechaNacimiento;
	}

	public void leeDatos() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nombre del Autor");
		nombre = sc.nextLine();
		System.out.println("Email del Autor");
		email = sc.nextLine();

		System.out.println("Introduce la Fecha de Nacimiento");
		fechaNacimiento = sc.nextInt();

		
		// *****
		// No se puede cerrar la clase Scanner por que
		// impide seguir pidiendo datos por consola.
		// Error java.util.InputMismatchException
		// sc.close();
	}

}
