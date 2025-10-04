package EjemplosPDF_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ejemplo13MouseAdapter extends JFrame {

	private JLabel lblCoordenadas;
	private JLabel lblBoton;

	public static void main(String[] args) {
		new Ejemplo13MouseAdapter();
	}

	public Ejemplo13MouseAdapter() {

		super("Ejemplo Mouse");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

		lblCoordenadas = new JLabel("Coordenadas:");
		lblBoton = new JLabel("Botón:");

		add(lblCoordenadas);
		add(lblBoton);

		addMouseListener(new MouseAdapter() {

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

		});

		setVisible(true);

	}

}
