/**
 * @author Ramon
 */

package auxiliar;

import java.util.Scanner;

public class Grupo {

	// Atributos

	private String nivel;
	private int curso;
	private String clase;
	private int numGrupo;

	// Constructores

	public Grupo() {

	}

	public Grupo(int numGrupo, String nivel, int curso, String clase) {
		this.numGrupo = numGrupo;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
		
	}

	// Metodos

	public String toString() {
		return "El nivel es " + nivel + " de " + curso + " curso " + " de la clase " + clase + "\nNumero Grupo " + numGrupo;
	
	}

	public void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Nivel?");
		nivel = entrada.nextLine();

		System.out.println("Curso?");
		curso = entrada.nextInt();

		entrada.nextLine();

		System.out.println("Clase?");
		clase = entrada.nextLine();
		
		System.out.println("Grupo?");
		numGrupo = entrada.nextInt();
		
		entrada.close();
	}

}
