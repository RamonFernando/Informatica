package EjerciciosEntregaRamonUInterface;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejercicio2Deslizador extends JFrame {

	public static void main(String[] args) {

		new Ejercicio2Deslizador();

	}

	public Ejercicio2Deslizador() {
		super("Termostato");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Tema de la ventana
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			System.out.println("Error al intentar cambiar el look and feel.");
		}

		// setLayout(new FlowLayout(FlowLayout.LEFT, 100, 10));
		setLayout(new GridLayout(1, 2));
		JLabel lblTemp = new JLabel("Temperatura(ºC)");
		JSlider deslizador = new JSlider(JSlider.VERTICAL, 0, 25, 17);
		// Propiedades del deslizador
		deslizador.setPaintLabels(true);
		deslizador.setPaintTicks(true);
		deslizador.setMajorTickSpacing(5);
		deslizador.setMinorTickSpacing(1);

		// Para cambiar el tamaño o las dimenciones
		deslizador.setPreferredSize(new Dimension(40, 200));

		// Para impedir cambiar el tamaño de la ventana
		setResizable(true);

		// Para ajustar todo al deslizador
		// pack();

		// Ventana
		add(deslizador);
		add(lblTemp);

		setLocationRelativeTo(null);

		setVisible(true);
	}
}
