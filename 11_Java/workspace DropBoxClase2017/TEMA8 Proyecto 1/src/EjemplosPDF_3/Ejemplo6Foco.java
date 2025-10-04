package EjemplosPDF_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ejemplo6Foco extends JFrame implements FocusListener {

	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JLabel lblMedia;

	public static void main(String[] args) {
		new Ejemplo6Foco();
	}

	public Ejemplo6Foco() {

		super("Promedios");
		setSize(400, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		txt1 = new JTextField("0", 10);
		txt1.addFocusListener(this);

		txt2 = new JTextField("0", 10);
		txt2.addFocusListener(this);

		txt3 = new JTextField("0", 10);
		txt3.addFocusListener(this);

		lblMedia = new JLabel("La media es 0.0");

		add(txt1);
		add(txt2);
		add(txt3);
		add(lblMedia);

		setVisible(true);

	}

	@Override
	public void focusGained(FocusEvent e) {

		try {
			double num1 = Double.parseDouble(txt1.getText());
			double num2 = Double.parseDouble(txt2.getText());
			double num3 = Double.parseDouble(txt3.getText());

			double media = (num1 + num2 + num3) / 3;
			lblMedia.setText("La media es " + media);
		} catch (Exception ex) {
			lblMedia.setText("Datos no válidos");
		}

	}

	@Override
	public void focusLost(FocusEvent e) {
		// Vacío a propósito.
	}

}
