package EjemplosPDF_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ejemplo1Botones extends JFrame implements ActionListener {

	private JLabel lblPulsar;

	public static void main(String[] args) {
		new Ejemplo1Botones();
	}

	public Ejemplo1Botones() {

		super("Ejemplo Botones");
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton btnPulsar = new JButton("Pulsar");
		btnPulsar.addActionListener(this);

		lblPulsar = new JLabel("Aún no has pulsado el botón");

		add(btnPulsar);
		add(lblPulsar);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		lblPulsar.setText("Por fin!!");

	}

}
