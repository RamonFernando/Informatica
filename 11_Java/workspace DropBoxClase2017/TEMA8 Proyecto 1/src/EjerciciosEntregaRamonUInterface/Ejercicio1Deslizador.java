package EjerciciosEntregaRamonUInterface;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;



public class Ejercicio1Deslizador extends JFrame {

	public static void main(String[] args) {

		new Ejercicio1Deslizador();

	}

	public Ejercicio1Deslizador() {
		super("Velocidad de Crucero");
		// setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		JSlider deslizador = new JSlider(JSlider.HORIZONTAL, 10, 124, 90);
		
		

		// Propiedades del deslizador
		deslizador.setPaintLabels(true);
		deslizador.setPaintTicks(true);
		deslizador.setMajorTickSpacing(20);
		deslizador.setMinorTickSpacing(5);

		// Para cambiar el tamaño o las dimenciones
		deslizador.setPreferredSize(new Dimension(290, 40));

		// Agregar el deslizador
		add(deslizador);

		// Para impedir cambiar el tamaño de la ventana
		setResizable(false);

		// Para ajustar todo al deslizador
		pack();

		setLocationRelativeTo(null);

		setVisible(true);
	}
}
