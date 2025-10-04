package Simulador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diodo extends Componente {

	private double tensionlnversa;

	public Diodo() {

	}

	public Diodo(double intensidadMaxima, double longitud, double tensionlnversa) {
		super(intensidadMaxima, longitud);
		this.tensionlnversa = tensionlnversa;
	}

	@Override
	public void conectar() {
		System.out.println("Componente conectado");
		
	}

	public double getTensionlnversa() {
		return tensionlnversa;
	}

	public void setTensionlnversa(double tensionlnversa) {
		this.tensionlnversa = tensionlnversa;
	}
	public void leeDatos(){
		
		double a,b,c;
		a = getIntensidadMaxima();
		b = getLongitud();
		c = getTensionlnversa();
		
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce los valores del Diodo");
			System.out.println("Introduce la intensidad Maxima: ");
			setIntensidadMaxima(sc.nextDouble());
			System.out.println("Introduce la longitud: ");
			setLongitud(sc.nextDouble());
			System.out.println("Introduce la tensioninversa: ");
			setTensionlnversa(sc.nextDouble());
		} catch (InputMismatchException e) {
			System.out.println("Entrada incorrecta");
			System.out.println("Mas Informacion: " + e.toString());
			setIntensidadMaxima(a);
			setLongitud(b);
			setTensionlnversa(c);
			
		} catch (Exception e) {
			System.out.println("Parametro incorrecto");
			e.printStackTrace();
		} finally {
			System.out.println("Fin de Lectura");
		}
	
		
		
	}
}
