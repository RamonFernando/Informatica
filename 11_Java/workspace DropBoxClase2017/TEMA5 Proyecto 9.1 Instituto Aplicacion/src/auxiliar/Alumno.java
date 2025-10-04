/**
 * @author Ramon
 */

package auxiliar;

import java.util.Scanner;

public class Alumno {

	// Atributos

	private int numExpediente;
	private String apellidos;
	private String nombre;
	// private Grupo grupo;
	private int numGrupo;
	

	// Constructores

	public Alumno() {

	}

	public Alumno(int numExpediente, String apellidos, String nombre, int grupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		// this.grupo = grupo;
		
	}

	// Metodos

	public String toString() {
		return "El numero de expediente es: " + numExpediente + "\nApellidos: " + apellidos + "\nNombre: " + nombre
				+ "\nNumero de Grupo: "  + numGrupo;
	}

	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Numero de expediente?");
		numExpediente = entrada.nextInt();

		entrada.nextLine();

		System.out.println("Apellidos?");
		apellidos = entrada.nextLine();

		System.out.println("Nombre?");
		nombre = entrada.nextLine();

		System.out.println("Numero de Grupo");
		numGrupo = entrada.nextInt();
		
		entrada.close();
	}

	// Metodos de acceso

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

}
