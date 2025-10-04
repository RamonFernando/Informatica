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
	private int numGrupo;

	// Constructores

	/**
	 * Constructor vacio de alumnos
	 */
	public Alumno() {

	}

	/**
	 * Constructor con plantilla de alumnos
	 * 
	 * @param numExpediente
	 *            Número de expediente
	 * @param apellidos
	 *            Apellidos del alumno
	 * @param nombre
	 *            Nombre del alumno
	 * @param numGrupo
	 *            Grupo del alumno
	 */

	public Alumno(int numExpediente, String apellidos, String nombre,
			int numGrupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.numGrupo = numGrupo;
	}

	// Metodos

	/**
	 * Método to String de ALumno que muestra su numero de expediente,
	 * apellidos, nombre y a que grupo pertenece
	 */
	public String toString() {
		return numExpediente + "\t" + apellidos + "\t" + nombre + "\t"
				+ numGrupo;
	}

	/**
	 * Lee los datos que le pasamos por consola para construir un alumno
	 */

	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Número de expediente?");
		numExpediente = entrada.nextInt();

		entrada.nextLine();

		System.out.println("¿Apellidos?");
		apellidos = entrada.nextLine();

		System.out.println("¿Nombre?");
		nombre = entrada.nextLine();

		System.out.println("¿Número de grupo?");
		numGrupo = entrada.nextInt();
	}

	// Metodos de acceso

	/**
	 * Muestra el número de expediente de un alumno
	 * 
	 * @return número de expediente
	 */
	public int getNumExpediente() {
		return numExpediente;
	}

	/**
	 * introduce el número de expediente
	 * 
	 * @param numExpediente
	 */
	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	/**
	 * Muestra los apellidos de un alumno
	 * 
	 * @return apellidos del alumno
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * muestra el Nombre del alumno
	 * 
	 * @return Nombre de un alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Muestra el número de un grupo
	 * 
	 * @return número de un grupo
	 */
	public int getNumGrupo() {
		return numGrupo;
	}

}