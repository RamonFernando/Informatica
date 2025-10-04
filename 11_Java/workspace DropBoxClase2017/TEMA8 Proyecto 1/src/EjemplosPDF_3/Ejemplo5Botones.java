package EjemplosPDF_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.*;

public class Ejemplo5Botones extends JFrame implements ActionListener {

	private JButton btn1;
	private JButton btn2;
	private JLabel lblBtn1;
	private JLabel lblBtn2;
	private boolean pulsado1 = false;
	private boolean pulsado2 = false;

	public Ejemplo5Botones() {
		super("Ejercicio botones");
		setSize(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		btn1 = new JButton("Botón 1");
		btn2 = new JButton("Botón 2");
		lblBtn1 = new JLabel("No pulsado.");
		lblBtn2 = new JLabel("No pulsado.");

		btn1.addActionListener(this);
		btn2.addActionListener(this);

		add(btn1);
		add(lblBtn1);
		add(btn2);
		add(lblBtn2);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo5Botones();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object btn = e.getSource();
		if (btn == btn1 && pulsado1 == false) {
			lblBtn1.setText("Pulsado");
			pulsado1 = true;
		} else if (btn == btn1 && pulsado1 == true) {
			lblBtn1.setText("No pulsado");
			pulsado1 = false;
		} else if (btn == btn2 && pulsado2 == false) {
			lblBtn2.setText("Pulsado");
			pulsado2 = true;
		} else if (btn == btn2 && pulsado2 == true) {
			lblBtn2.setText("No pulsado");
			pulsado2 = false;
		}
	}

}
