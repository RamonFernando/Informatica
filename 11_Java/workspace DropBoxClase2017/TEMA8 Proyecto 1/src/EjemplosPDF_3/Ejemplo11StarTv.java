package EjemplosPDF_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ejemplo11StarTv extends JFrame implements KeyListener {

	private JLabel lblTele;
	private int x, y;

	public static void main(String[] args) {
		new Ejemplo11StarTv();
	}

	public Ejemplo11StarTv() {

		super("Star TV");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// No queremos asignar un layout, para así poder colocar un JLabel
		// en cualquier posición de la pantalla.
		setLayout(null);

		ImageIcon iconoTv = new ImageIcon("iconos/67.png");

		x = 20;
		y = 20;

		lblTele = new JLabel(iconoTv);
		lblTele.setBounds(x, y, 24, 24);

		add(lblTele);

		addKeyListener(this);

		setVisible(true);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {

		int codigoTecla = e.getKeyCode();

		int anchoVentana = getWidth();
		int altoVentana = getHeight();

		if (codigoTecla == KeyEvent.VK_RIGHT && x <= anchoVentana - 26) {
			x = x + 2;
		}

		if (codigoTecla == KeyEvent.VK_LEFT && x >= 2) {
			x = x - 2;
		}

		if (codigoTecla == KeyEvent.VK_DOWN && y <= altoVentana - 26) {
			y = y + 2;
		}

		if (codigoTecla == KeyEvent.VK_UP && y >= 2) {
			y = y - 2;
		}

		lblTele.setBounds(x, y, 24, 24);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
