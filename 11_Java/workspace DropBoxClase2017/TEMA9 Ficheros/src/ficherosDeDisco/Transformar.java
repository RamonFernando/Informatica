package ficherosDeDisco;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Transformar extends JFrame {

	private JTextArea txtSalida;

	public static void main(String[] args) {
		new Transformar();
	}

	public Transformar() {

		super("Transformar a mayúsculas");
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

		try {
			FileReader original = new FileReader("ficheros/texto.txt");
			BufferedReader bufferOriginal = new BufferedReader(original);

			FileWriter temporal = new FileWriter("ficheros/texto.txt.temp");
			BufferedWriter bufferTemporal = new BufferedWriter(temporal);

			boolean eof = false;
			String linea = null;

			while (!eof) {

				linea = bufferOriginal.readLine();

				if (linea == null) {
					eof = true;
				} else {

					bufferTemporal.write(linea.toUpperCase() + "\n");

				}

			}

			bufferOriginal.close();
			bufferTemporal.close();

			File archivoOriginal = new File("ficheros/texto.txt");
			File archivoTemporal = new File("ficheros/texto.txt.temp");

			archivoOriginal.delete();
			archivoTemporal.renameTo(archivoOriginal);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
