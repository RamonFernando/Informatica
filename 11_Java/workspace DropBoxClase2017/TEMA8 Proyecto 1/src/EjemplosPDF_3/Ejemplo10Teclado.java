package EjemplosPDF_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ejemplo10Teclado extends JFrame implements KeyListener {

	private JLabel lblTecla;

	public static void main(String[] args) {
		new Ejemplo10Teclado();
	}

	public Ejemplo10Teclado() {

		super("Teclado");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		lblTecla = new JLabel("");

		add(lblTecla);

		addKeyListener(this);

		setVisible(true);

	}

	@Override
	public void keyTyped(KeyEvent e) {

		char letra = e.getKeyChar();
		lblTecla.setText("" + letra);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
