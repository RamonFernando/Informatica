package RepasoExamenRecuperacionU2;

public class Ejercicio13MostrarBidimensional {

	public Ejercicio13MostrarBidimensional() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 13.- La tabla siguiente muestra tres magnitudes meteorológicas
		// medidas en cuatro momentos del día. Guarda estos datos en un array
		// bidimensional llamado medidas.

		double[][] medidas = { { 8.5, 1020, 40 }, { 14.2, 1021, 35 },
				{ 11, 1022, 45 }, { 7, 1023, 50 } };

		System.out.println("Registros Meteorologicos");
		System.out.println("========================");
		for (int i = 0; i < medidas.length; i++) {
			System.out.println(medidas[i][0] + "\t" + medidas[i][1] + "\t"
					+ medidas[i][2]);
		}
	}

}
