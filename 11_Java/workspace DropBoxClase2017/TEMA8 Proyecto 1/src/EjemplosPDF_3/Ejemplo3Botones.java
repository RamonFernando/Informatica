package EjemplosPDF_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ejemplo3Botones extends JFrame {

	public static void main(String[] args) {
		new Ejemplo3Botones();
	}

	public Ejemplo3Botones() {

		super("Botones");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton btn1 = new JButton("Botón 1");
		JLabel lbl1 = new JLabel("No pulsado");

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl1.setText("Ok");
			}
		});

		JButton btn2 = new JButton("Botón 2");
		JLabel lbl2 = new JLabel("No pulsado");

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl2.setText("Ok");
			}
		});

		add(btn1);
		add(lbl1);
		add(btn2);
		add(lbl2);

		setVisible(true);

	}

}
