package EjemplosPDF_2;

import java.awt.*;
import javax.swing.*;

public class EjercicioConfiguracion extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EjercicioConfiguracion();
	}

	public EjercicioConfiguracion() {
		// TODO Auto-generated constructor stub

		super("Configuracion");
		setSize(300, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setLayout(new FlowLayout());
		setLayout(new GridLayout(1, 2));
		JPanel panel = (JPanel) getContentPane();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		// Tema de la ventana
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al intentar cambiar el look and feel.");
		}

		// Panel Izquierdo
		JPanel panelIzquierdo = new JPanel();
		panelIzquierdo.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelIzquierdo.setBorder(BorderFactory.createTitledBorder("Personaje"));

		// Botones Panel Izquierdo
		JRadioButton btnMago = new JRadioButton("Mago");
		JRadioButton btnArquero = new JRadioButton("Arquero");
		JRadioButton btnEspadachin = new JRadioButton("Espadachin");
		panelIzquierdo.add(btnMago);
		panelIzquierdo.add(btnArquero);
		panelIzquierdo.add(btnEspadachin);

		// Grupo de Botones de Panel izquierdo
		// Para que no se puedan seleccionar dos botones a la vez
		ButtonGroup personajes = new ButtonGroup();
		personajes.add(btnMago);
		personajes.add(btnArquero);
		personajes.add(btnEspadachin);

		// Panel Derecho
		JPanel panelDerecho = new JPanel();
		panelDerecho.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelDerecho.setBorder(BorderFactory.createTitledBorder("Terreno"));

		// Botones Panel Derecho
		JRadioButton btnLlanuras = new JRadioButton("Llanuras");
		JRadioButton btnMontañas = new JRadioButton("Montañas");
		JRadioButton btnPantanos = new JRadioButton("Pantanos");
		panelDerecho.add(btnLlanuras);
		panelDerecho.add(btnMontañas);
		panelDerecho.add(btnPantanos);

		// Grupo de Botones Panel Derecho
		// Para que no se puedan seleccionar dos botones a la vez
		ButtonGroup terrenos = new ButtonGroup();
		terrenos.add(btnLlanuras);
		terrenos.add(btnMontañas);
		terrenos.add(btnPantanos);

		// Ventana
		add(panelIzquierdo);
		add(panelDerecho);

		setVisible(true);

	}
}
