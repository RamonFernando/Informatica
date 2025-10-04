package Auxiliar;

import java.util.Scanner;

public class Alumno {
	
	// Atributos
	private int numExpediente;
	private String apellidos;
	private String nombre;
	private Grupo grupo;
	
	
	
	
	public Alumno() {
		
	}
	
	
	public Alumno(int numExpediente, String apellidos, String nombre,
			Grupo grupo) {
		
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
	}


	public String toString(){
		return "Numero Expediente: " + numExpediente + "\nApellidos: " + apellidos + "\nNombre: " + nombre + "\nGrupo: " + grupo.toString();
	}
	public void leeDatos(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de Expediente: ");
		numExpediente = sc.nextInt();
		
		System.out.println("Introduzca su apellido: ");
		apellidos = sc.nextLine();
		
		sc.nextLine();
		System.out.println("Introduzca el nombre: ");
		nombre = sc.nextLine();
		
		grupo = new Grupo();
		grupo.leeDatos();
		
		
		
		sc.close();
	}
	
	
	// Metodos de acceso
	public int getNumExpediente() {
		return numExpediente;
	}
	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
}
