package Simulador;

public class Condensador extends Componente implements Invertible {

	private double capacidad;

	public Condensador() {
		// TODO Auto-generated constructor stub
	}

	public Condensador(double intensidadMaxima, double longitud,
			double capacidad) {
		super(intensidadMaxima, longitud);
		this.capacidad = capacidad;
	}

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Componente conectado");
	}

	@Override
	public void girar() {
		// TODO Auto-generated method stub
		System.out.println("Componente girado");
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

}
