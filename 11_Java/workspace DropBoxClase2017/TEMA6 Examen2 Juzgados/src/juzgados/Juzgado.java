/**
 * 
 */
package juzgados;

import java.util.Scanner;

/**
 * @author examen3
 *
 */
public class Juzgado {

	/**
	 * 
	 */
	// Atributos
	private int MAX_SENTENCIAS = 10;
	private String localidad;
	private int numJuzgado;
	private Sentencia[] sentencias;
	Scanner sc = new Scanner(System.in);

	public Juzgado(String localidad, int numJuzgado) {
		super();

		this.localidad = localidad;
		this.numJuzgado = numJuzgado;

	}

	public void addSentencias(Sentencia[] sentencias) {

		for (int i = 0; i < sentencias.length; i++) {
			if (sentencias[i] == null) {
				sentencias[i] = sentencias[i];
				// No se por que no me deja...
				// sentencias[i] = sentencias;
				break;
			}
		}
	}

	public void listaSentencias(int numSentencias) {
		for (int i = 0; i < sentencias.length; i++) {
			System.out.println(sentencias[i]);
		}
	}

	public int buscaSentencias(int numSentencias) {
		Scanner sc = new Scanner(System.in);
		numSentencias = sc.nextInt();
		for (int i = 0; i < sentencias.length; i++) {
			if (sentencias[i] == null && sentencias[i] != sentencias[numSentencias]) {
				return -1;

			} else {
				System.out.println(sentencias[numSentencias]);
			}
		}
		return numSentencias;

	}

	public void delSentencias(int numSentencias) {
		numSentencias = sc.nextInt();
		for (int i = 0; i < sentencias.length; i++) {
			if (sentencias[i] != null && sentencias[i] == sentencias[numSentencias]) {
				sentencias[i] = null;              
			}
		}
	}

	public void listaJuez(String dni) {
		for (int i = 0; i < sentencias.length; i++) {
			System.out.println(sentencias[i].getJuez());
		}
	}

}
