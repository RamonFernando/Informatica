package Simulador;

public class Led extends Diodo{
	
	private String color;
	public Led() {
		// TODO Auto-generated constructor stub
	}
	public Led(double tensionInversa, double intensidadMaxima, double longitud,
			String color) {
		super(tensionInversa, intensidadMaxima, longitud);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
