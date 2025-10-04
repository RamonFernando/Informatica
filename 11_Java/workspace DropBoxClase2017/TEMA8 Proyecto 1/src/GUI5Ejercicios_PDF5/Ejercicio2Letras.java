package GUI5Ejercicios_PDF5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio2Letras extends JFrame implements KeyListener {

	JLabel lblLetras;

	public Ejercicio2Letras() {
		super("Letras - Colores");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		lblLetras = new JLabel("Color");
		add(lblLetras);
		addKeyListener(this);

		setResizable(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejercicio2Letras();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char letra = e.getKeyChar();
		lblLetras.setText("" + letra);

		if (e.getKeyChar() == 'r') {
			lblLetras.setForeground(Color.RED);
			lblLetras.setText("Rojo");
		}
		if (e.getKeyChar() == 'a') {
			lblLetras.setForeground(Color.BLUE);
			lblLetras.setText("Azul");
		}
		if (e.getKeyChar() == 'v') {
			lblLetras.setForeground(Color.GREEN);
			lblLetras.setText("Verde");
		}
		if (e.getKeyChar() == 'n') {
			lblLetras.setForeground(Color.ORANGE);
			lblLetras.setText("Naranja");
		}
		if (e.getKeyChar() == 'g') {
			lblLetras.setForeground(Color.GRAY);
			lblLetras.setText("Gris");
		}
		if (e.getKeyChar() == 'm') {
			lblLetras.setForeground(Color.magenta);
			lblLetras.setText("Magenta");
		}
		if (e.getKeyChar() == 'y') {
			lblLetras.setForeground(Color.YELLOW);
			lblLetras.setText("Amarillo");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
