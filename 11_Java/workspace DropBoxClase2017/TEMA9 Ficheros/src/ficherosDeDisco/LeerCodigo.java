package ficherosDeDisco;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class LeerCodigo extends JFrame {

	private JTextArea txtSalida;

	public static void main(String[] args) {
		new LeerCodigo();
	}

	public LeerCodigo() {

		super("Leer código");
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

		txtSalida.setText("");

		try {
			// Abrimos el archivo de texto para lectura.
			FileReader archivo = new FileReader("src/LeerCodigo.java");

			// Creamos un BufferedReader para leer el archivo
			// usando un buffer.
			BufferedReader buffer = new BufferedReader(archivo);

			boolean eof = false; // Marca que indicará final de archivo.
			String linea; // Para ir leyendo cada línea.

			while (!eof) {

				// Leemos una línea
				linea = buffer.readLine();

				// Comprobamos si hemos llegado al final del archivo.
				if (linea == null) {
					eof = true;
				} else {
					txtSalida.append(linea + "\n");
				}

			}

			buffer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
