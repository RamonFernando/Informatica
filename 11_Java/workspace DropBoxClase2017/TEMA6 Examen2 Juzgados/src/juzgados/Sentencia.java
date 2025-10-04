/**
 * 
 */
package juzgados;

/**
 * @author examen3
 *
 */
public class Sentencia {

	private int numSentencia;
	private String titulo;
	private String texto;
	private Juez juez;

	public Sentencia(int NumSentencia, String Titulo, String Texto, Juez Juez) {
		super();
		this.numSentencia = NumSentencia;
		this.titulo = Titulo;
		this.texto = Texto;
		this.juez = Juez;
	}

	
	public String toString() {
		return "Numero Sentencia: " + numSentencia + "\n Titulo:" + titulo + "\n Texto:" + texto + "\n Juez: "
				+ juez;
	}

	public int getNumSentencia() {
		return numSentencia;
	}

	public void setNumSentencia(int numSentencia) {
		this.numSentencia = numSentencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Juez getJuez() {
		return juez;
	}
	// 
	// public void setJuez(Juez juez) {
	// this.juez = juez;
	// }

}