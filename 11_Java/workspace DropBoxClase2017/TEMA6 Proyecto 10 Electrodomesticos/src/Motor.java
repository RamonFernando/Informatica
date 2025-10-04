/*
 * Clase Motor
 */
public class Motor {

	/**
	 * Atributos de la clase taller 
	 * fabricante 
	 * modelo
	 */
	private String fabricante;
	private String modelo;

	/**
	 * Constructor de la clase Motor vacio.
	 */
	public Motor() {
		// Constructor vacio de la clase Motor
	}

	/**
	 * Constructor de la clase Motor
	 * 
	 * @param fabricante
	 * @param modelo
	 */
	public Motor(String fabricante, String modelo) {

		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	/**
	 * Metodo toString de la clase Motor
	 * Fabricante
	 * Modelo
	 */
	public String toString() {
		return "Motor fabricante " + fabricante + "\n modelo" + modelo;
	}

	/**
	 * Metodo getFabricante()
	 * @return
	 */
	public String getFabricante() {
		return fabricante;
	}
	/**
	 * Metodo setFabricante()
	 * @param fabricante
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	/**
	 * Metodo getModelo()
	 * @return
	 */
	public String getModelo() {
		return modelo;
	}
	
	/**
	 * Metodo setModelo()
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
