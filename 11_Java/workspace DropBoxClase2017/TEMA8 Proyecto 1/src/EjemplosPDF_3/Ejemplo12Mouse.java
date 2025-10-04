package EjemplosPDF_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ejemplo12Mouse extends JFrame implements MouseListener {

	private JLabel lblCoordenadas;
	private JLabel lblBoton;

	public static void main(String[] args) {
		new Ejemplo12Mouse();
	}

	public Ejemplo12Mouse() {

		super("Ejemplo Mouse");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

		lblCoordenadas = new JLabel("Coordenadas:");
		lblBoton = new JLabel("Botón:");

		add(lblCoordenadas);
		add(lblBoton);

		addMouseListener(this);

		setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		int x = e.getX();
		int y = e.getY();
		int boton = e.getButton();

		lblCoordenadas.setText("Coordenadas: (" + x + "," + y + ")");

		switch (boton) {
		case MouseEvent.BUTTON1:
			lblBoton.setText("Botón: IZQUIERDO");
			break;
		case MouseEvent.BUTTON2:
			lblBoton.setText("Botón: RUEDA");
			break;
		case MouseEvent.BUTTON3:
			lblBoton.setText("Botón: DERECHO");
			break;
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// No lo utilizamos.

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// No lo utilizamos.

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// No lo utilizamos.

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// No lo utilizamos.

	}

}
