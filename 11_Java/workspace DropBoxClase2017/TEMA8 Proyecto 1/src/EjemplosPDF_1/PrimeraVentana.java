package EjemplosPDF_1;
import javax.swing.*;

public class PrimeraVentana extends JFrame {

	public static void main(String[] args) {

		PrimeraVentana ventana = new PrimeraVentana();

	}

	/**
	 * Constructor de PrimeraVentana, donde pondremos el codigo para inicializar
	 * la ventana
	 */
	public PrimeraVentana() {
		super("Mi primera ventana");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}
}
