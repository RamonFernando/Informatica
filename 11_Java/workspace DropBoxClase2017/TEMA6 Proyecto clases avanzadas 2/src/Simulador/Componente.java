package Simulador;

public abstract class Componente {

	private double intensidadMaxima;
	private double longitud;

	protected String name;
	
	public Componente() {

	}

	public Componente(double intensidadMaxima, double longitud) {
		this.intensidadMaxima = intensidadMaxima;
		this.longitud = longitud;
	}
	// Abstracto
	public abstract void conectar();
	
	public boolean  accion(){
		return true;
	}
	
	public double getIntensidadMaxima() {
		return intensidadMaxima;
	}

	public void setIntensidadMaxima(double intensidadMaxima) {
		this.intensidadMaxima = intensidadMaxima;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
}
