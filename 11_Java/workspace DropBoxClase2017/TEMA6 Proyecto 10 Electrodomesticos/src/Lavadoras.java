public class Lavadoras {

	/**
	 * Atributos de la clase Lavadora id, motor, precio, IVA
	 */
	private int id;
	private Motor motor;
	private String marca;
	private float precio;
	private static int iva=21;
	
	/**
	 * Constructor de la clase Lavadora vacio.
	 */
	public Lavadoras() {

	}

	/**
	 * Constructor de la clase Lavadora
	 * @param id
	 * @param motor
	 * @param marca
	 * @param precio
	 * @param iva
	 */
	public Lavadoras(int id, Motor motor, String marca, float precio) {
		this.id = id;
		this.motor = motor;
		this.marca = marca;
		this.precio = ((float) iva* precio/100 + precio);
		
	}
	
	/**
	 * Metodo toString de la clase Motor
	 * Parametros mostrados
	 * Lavadora
	 * motor
	 * marca
	 * IVA
	 */
	public String toString() {
		return "Codigo " + id + ",Motor " + motor.getFabricante() + ", Marca " + marca
				+ ", Precio " + precio + "€" + ", IVA " + iva + "%";
	}

	// Metodos getters y setters de los atributos
	/**
	 * Metodo getId
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Metodo setId
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Metodo getMotor
	 * @return
	 */
	public Motor getMotor() {
		return motor;
	}

	/**
	 * Metodo setMotor
	 * @param motor
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	/**
	 * Metodo getMarca
	 * @return
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Metodo: setMarca
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Metodo getPrecio
	 * @return
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * Metodo setPrecio
	 * @param precio
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	
	

}
