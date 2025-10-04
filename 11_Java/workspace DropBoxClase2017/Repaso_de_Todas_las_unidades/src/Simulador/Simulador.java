package Simulador;

import java.io.ObjectInputStream.GetField;

public class Simulador {
	
	public Simulador() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		Diodo d1 = new Diodo(5,5,5);
		d1.leeDatos();
		
		System.out.println(d1.getIntensidadMaxima());
		System.out.println(d1.getLongitud());
		System.out.println(d1.getTensionInversa());
	}
}
