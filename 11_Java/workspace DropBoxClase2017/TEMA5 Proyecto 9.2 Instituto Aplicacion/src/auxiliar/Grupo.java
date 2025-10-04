/**
 * @author Ramon
 */

package auxiliar;

import java.util.Scanner;

public class Grupo {

	// Atributos
	private int numGrupo;
	private String nivel;
	private int curso;
	private String clase;

	// Constructores

	/**
	 * Constructor vacio para luego pasarle los datos
	 */
	public Grupo() {

	}
	
	/**
	 * Constructor da formato a un grupo
	 * @param numGrupo Numero del grupo 
	 * @param nivel Nivel 
	 * @param curso curso
	 * @param clase clase
	 */

	public Grupo(int numGrupo, String nivel, int curso, String clase) {
		this.numGrupo = numGrupo;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}

	// Métodos
	
	/**
	 * Muestra con un to String el numero de grupo, el nivel, el curso y la clase
	 */
	public String toString() {
		return numGrupo + "\t" + nivel + "\t" + curso + "\t" + clase;
	}

	
	/**
	 * lee los datos que le insertamos por consola de un grupo
	 */
	public void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Número de Grupo?");
		numGrupo = entrada.nextInt();

		entrada.nextLine();

		System.out.println("¿Nivel?");
		nivel = entrada.nextLine();

		System.out.println("¿Curso?");
		curso = entrada.nextInt();

		entrada.nextLine();

		System.out.println("¿Clase?");
		clase = entrada.nextLine();
	}

	/**
	 * Te dice el número de un grupo
	 * @return número del grupo
	 * 
	 */
	
	public int getNumGrupo() {
		return numGrupo;
	}

}
