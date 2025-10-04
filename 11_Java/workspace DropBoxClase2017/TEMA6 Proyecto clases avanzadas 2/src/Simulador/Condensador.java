package Simulador;

import java.awt.Component;

public class Condensador extends Componente implements Invertible {

	private double capacidad;

	public Condensador() {

	}

	public Condensador(double intensidadMaxima, double longitud,
			double capacidad) {
		super(intensidadMaxima, longitud);
		this.capacidad = capacidad;
	}

	@Override
	public void girar() {
		System.out.println("Componente Girado");

	}

	@Override
	public void conectar() {
		System.out.println("Componente conectado");

	}
	 @Override
	 public boolean accion(){
		//do something
		 
		 capacidad = 12;
		 setLongitud(300);
		 
		 name = "Ramon";
		 
		return super.accion();
	 }
	
	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

}
