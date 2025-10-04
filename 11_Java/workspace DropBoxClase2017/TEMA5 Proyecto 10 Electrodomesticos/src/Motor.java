
public class Motor {

	public Motor() {
		// TODO Auto-generated constructor stub
	}
	String fabricante;
	String modelo;
	
	public Motor(String fabricante, String modelo) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "fabricante:" + fabricante + ", modelo:" + modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

}
