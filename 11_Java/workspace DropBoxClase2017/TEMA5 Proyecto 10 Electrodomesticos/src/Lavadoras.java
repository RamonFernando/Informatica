public class Lavadoras {

	private int id;
	private Motor motor;
	private String marca;
	private double precio;
	private final int iva;

	public Lavadoras(int id, Motor motor, String marca, double precio) {
		super();
		this.id = id;
		this.motor = motor;
		this.marca = marca;
		this.precio = precio;
		this.iva = (int) (precio * 1.21);
	}

	@Override
	public String toString() {
		return "Lavadora -- Codigo: " + id + ", motor: "
				+ motor.getFabricante() + ", marca: " + marca + ", precio: "
				+ precio + ", Precio + iva(21%): " + iva + "€";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIva() {
		return iva;
	}

}
