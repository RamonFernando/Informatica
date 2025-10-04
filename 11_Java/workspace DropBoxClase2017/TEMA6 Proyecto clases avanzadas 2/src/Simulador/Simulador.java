package Simulador;

public class Simulador {

	public Simulador() {
		//
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Componente c1 = new Componente();
		Diodo d1 = new Diodo(5, 5, 5);
		Condensador cnd1 = new Condensador();
		Led l1 = new Led();

		d1.leeDatos();
		System.out.println(d1.getIntensidadMaxima());
		System.out.println(d1.getLongitud());
		System.out.println(d1.getTensionlnversa());

		// Polimorfismo
		Componente comp1 = new Diodo();
		Diodo d2 = new Led();

		// Para esto pide un cast
		// Led l2 = (Led) new Diodo();

		// Contrato de interfaces que deja acceder solo a los metodos de esta
		// interfaz
		Invertible i1 = new Condensador();
		i1.girar();
		
		Componente cnd2 = new Condensador();
		System.out.println(cnd2.accion());
		
	}

}
