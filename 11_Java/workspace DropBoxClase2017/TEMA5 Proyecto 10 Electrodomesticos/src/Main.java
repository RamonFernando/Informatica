public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Motores");
		Motor m1 = new Motor("GenralMotor", "V8");
		Motor m5 = new Motor("BMW", "V10");
		Motor m2 = new Motor("Samsung", "V12");
		Motor m3 = new Motor("General Electric", "V12");
		Motor m4 = new Motor("Samsung", "A1");
		System.out.println(m1.toString());
		Lavadoras l1 = new Lavadoras(1, m1, "BMW", 130);
		Lavadoras l2 = new Lavadoras(2, m2, "Samsung", 250);
		Lavadoras l3 = new Lavadoras(3, m1, "Siemens", 410);
		Lavadoras l4 = new Lavadoras(4, m3, "LG", 399);
		Lavadoras l5 = new Lavadoras(201, m1, "Sense", 300);
		System.out.println(l1.toString());
		Taller t1 = new Taller();
		t1.addLavadoras(l1);
		t1.addLavadoras(l2);
		t1.addLavadoras(l3);

		System.out.println("Lista");
		t1.listaLavadoras();
		System.out.println("Borrar");
		t1.borrarLavadora(1);
		System.out.println("Agregando");
		t1.addLavadoras(l4);
		t1.addLavadoras(l5);
		System.out.println("Lista");
		t1.listaLavadoras();
		System.out.println("Buscar");
		t1.buscaLavadora(4);

	}

}
