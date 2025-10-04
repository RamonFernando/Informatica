package EjemplosPDF_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.*;

public class Ejemplo4Botones extends JFrame implements ActionListener {

	private JButton btn1;
	private JButton btn2;
	private JLabel lblBtn1;
	private JLabel lblBtn2;

	public Ejemplo4Botones() {
		super("Botones");
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
		new Ejemplo4Botones();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object btn = e.getSource();

		if (btn == btn1) {
			lblBtn1.setText("Pulsado.");
		} else if (btn == btn2) {
			lblBtn2.setText("Pulsado.");
		}

	}

}
