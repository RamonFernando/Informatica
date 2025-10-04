package ficherosDeDisco;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class GuardarPuntuaciones extends JFrame {

	private JTextArea txtSalida;

	public static void main(String[] args) {
		new GuardarPuntuaciones();
	}

	public GuardarPuntuaciones() {

		super("Guardar puntuaciones");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JToolBar barraHerramientas = new JToolBar();

		JButton btnEjecutar = new JButton(new ImageIcon("iconos/38.png"));
		btnEjecutar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ejecutar();
			}

		});

		barraHerramientas.add(btnEjecutar);

		txtSalida = new JTextArea();
		txtSalida.setLineWrap(true);
		txtSalida.setWrapStyleWord(true);

		JScrollPane scrSalida = new JScrollPane(txtSalida);

		add(barraHerramientas, BorderLayout.NORTH);
		add(scrSalida, BorderLayout.CENTER);

		setVisible(true);

	}

	public void ejecutar() {

		String nombre = "charlie";
		int puntos = 3400;

		try {
			FileWriter archivo = new FileWriter("ficheros/score.txt");
			BufferedWriter buffer = new BufferedWriter(archivo);

			buffer.write(nombre + "," + puntos);

			buffer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
