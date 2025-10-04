package EjercicioPreExamen;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Ejemplo2Colores extends JFrame implements ActionListener {

	JButton btnBoton1;
	JButton btnBoton2;
	JButton btnBoton3;
	JLabel lblTexto;

	public static void main(String[] args) {
		new Ejemplo2Colores();
	}

	public Ejemplo2Colores() {

		super("Pulsa un Boton");
		setSize(270, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		btnBoton1 = new JButton("Rojo");
		btnBoton2 = new JButton("Amarillo");
		btnBoton3 = new JButton("Verde");

		lblTexto = new JLabel("No has pulsado todavia");

		add(btnBoton1);
		add(btnBoton2);
		add(btnBoton3);
		add(lblTexto);

		// Acciones ActionListener
		btnBoton1.addActionListener(this);
		btnBoton2.addActionListener(this);
		btnBoton3.addActionListener(this);

		setResizable(true);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnBoton1 == e.getSource()) {
			lblTexto.setText("Has pulsado el Boton Rojo");
			lblTexto.setForeground(Color.RED);
			btnBoton1.setForeground(Color.RED);
		} else {
			btnBoton1.setForeground(Color.BLACK);
		}

		if (btnBoton2 == e.getSource()) {
			lblTexto.setText("Has pulsado el Boton Amarillo");
			lblTexto.setForeground(Color.YELLOW);
			btnBoton2.setForeground(Color.YELLOW);
		} else {
			btnBoton2.setForeground(Color.BLACK);
		}

		if (btnBoton3 == e.getSource()) {
			lblTexto.setText("Has pulsado el Boton Verde");
			lblTexto.setForeground(Color.GREEN);
			btnBoton3.setForeground(Color.GREEN);
		} else {
			btnBoton3.setForeground(Color.BLACK);
		}

	}

}
