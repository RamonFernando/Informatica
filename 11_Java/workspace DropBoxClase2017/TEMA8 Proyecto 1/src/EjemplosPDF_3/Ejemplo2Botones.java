package EjemplosPDF_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ejemplo2Botones extends JFrame {

	private JLabel lblPulsar;

	public static void main(String[] args) {
		new Ejemplo2Botones();
	}

	public Ejemplo2Botones() {

		super("Ejemplo Botones");
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton btnPulsar = new JButton("Pulsar");
		btnPulsar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lblPulsar.setText("Por fin!!");

			}

		});

		lblPulsar = new JLabel("Aún no has pulsado el botón");

		add(btnPulsar);
		add(lblPulsar);

		setVisible(true);

	}

}
