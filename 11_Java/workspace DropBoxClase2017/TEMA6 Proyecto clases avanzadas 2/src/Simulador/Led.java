package Simulador;

public class Led extends Diodo {

	private double color;

	public Led() {

	}

	public Led(double intensidadMaxima, double longitud, double tensionlnversa,
			double color) {
		super(intensidadMaxima, longitud, tensionlnversa);
		this.color = color;
	}

	@Override
	public boolean accion(){
				
		name = "sadsd";
		return true;
	}
	
	public double getColor() {
		return color;
	}

	public void setColor(double color) {
		this.color = color;
	}

}
