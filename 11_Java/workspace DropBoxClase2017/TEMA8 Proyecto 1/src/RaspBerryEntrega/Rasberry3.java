package RaspBerryEntrega;

import java.awt.*;

import javax.swing.*;

public class Rasberry3 extends JFrame {

	JLabel lblPanel1;
	JLabel lblPanel2;
	JLabel lblPanel3;
	JTextArea txtMensajes;

	public static void main(String[] args) {

		new Rasberry3();
	}

	public Rasberry3() {
		super("Servidor - Casa Domotica");
		setSize(408, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			System.out.println("Error al intentar cambiar el look and feel.");
		}

		// Panel Superior
		JPanel panelSuperior = new JPanel();
		panelSuperior
				.setBorder(BorderFactory.createTitledBorder("Indicadores"));
		lblPanel1 = new JLabel();
		lblPanel1.setPreferredSize(new Dimension(110, 100));
		lblPanel1.setBackground(Color.GREEN);
		lblPanel1.setOpaque(true);
		lblPanel2 = new JLabel();
		lblPanel2.setPreferredSize(new Dimension(110, 100));
		lblPanel2.setBackground(Color.RED);
		lblPanel2.setOpaque(true);
		lblPanel3 = new JLabel();
		lblPanel3.setPreferredSize(new Dimension(110, 100));
		lblPanel3.setBackground(Color.RED);
		lblPanel3.setOpaque(true);

		panelSuperior.add(lblPanel1);
		panelSuperior.add(lblPanel2);
		panelSuperior.add(lblPanel3);

		// Panel Inferior
		JPanel panelInferior = new JPanel();
		panelInferior.setBorder(BorderFactory.createTitledBorder("Mensajes"));
		txtMensajes = new JTextArea(10, 28);
		JScrollPane scrollPanel = new JScrollPane(txtMensajes,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		// Ventana
		add(panelSuperior);
		add(panelInferior);
		panelInferior.add(scrollPanel);

		setResizable(true);
		setVisible(true);
	}
}
