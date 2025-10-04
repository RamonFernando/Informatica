package Auxiliar;

import java.util.Scanner;

public class Grupo {

	private String nivel;
	private int curso;
	private String clase;
	
	public Grupo(){
		
	}
	
	public Grupo(String nivel, int curso, String clase) {
		
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}
	
	public String toString(){
		
		return "El nivel es " + nivel + "\ndel " + curso + " curso " + "\nde la clase "
		+ clase;
	}
	
	// Metodo leeDatos
	public void leeDatos(){
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos por consola
		System.out.println("Introduce el Nivel: ");
		nivel = sc.nextLine();
		
		System.out.println("Introduce el curso: ");
		curso = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Introduce la clase: ");
		clase = sc.nextLine();
		
		
		
		
		sc.close();
	}
	
}
