package Simulador;

import java.io.ObjectInputStream.GetField;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Diodo extends Componente {

	private double tensionInversa;

	public Diodo() {
		// TODO Auto-generated constructor stub
	}

	public Diodo(double tensionInversa, double intensidadMaxima, double longitud) {
		super(intensidadMaxima, longitud);
		this.tensionInversa = tensionInversa;
	}

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Componente conectado");
	}

	public double getTensionInversa() {
		return tensionInversa;
	}

	public void setTensionInversa(double tensionInversa) {
		this.tensionInversa = tensionInversa;
	}

	public void leeDatos() {
		
		double a,b,c;
		a = getIntensidadMaxima();
		b = getLongitud();
		c = getTensionInversa();
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce los valores del Diodo");
			System.out.println("Introduce la intensidad Maxima: ");
			setIntensidadMaxima(sc.nextDouble());
			System.out.println("Introduce la longitud: ");
			setLongitud(sc.nextDouble());
			System.out.println("Introduce la tensioninversa: ");
			setTensionInversa(sc.nextDouble());
		} catch (InputMismatchException e) {
			System.out.println("Escribe un numero");
			System.out.println("Mas informacion " + e.toString());
			// e.printStackTrace();
			setIntensidadMaxima(a);
			setLongitud(b);
			setTensionInversa(c);
			
		} catch (Exception e) {
			System.out.println("Error de entrada");
			e.printStackTrace();
			
		}
		
		
	}

}






