package ficherosDeDisco;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class BufferES extends JFrame {

	private JTextArea txtSalida;

	public static void main(String[] args) {
		new BufferES();
	}

	public BufferES() {

		super("Título");
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

		String nombreArchivo = "ficheros/numeros.dat";

		escribir(nombreArchivo);

		leer(nombreArchivo);

	}

	private void escribir(String nombreArchivo) {

		try {
			FileOutputStream fichero = new FileOutputStream(nombreArchivo);

			BufferedOutputStream buffer = new BufferedOutputStream(fichero);

			for (int i = 1; i <= 50; i++) {
				buffer.write(i);
			}

			buffer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void leer(String nombreArchivo) {

	}

}