package ficherosDeDisco;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class ElegirArchivo extends JFrame {

	private JTextArea txtSalida;

	public static void main(String[] args) {
		new ElegirArchivo();
	}

	public ElegirArchivo() {

		super("Elegir archivo");
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

		JFileChooser eleccion = new JFileChooser();

		int opcion = eleccion.showOpenDialog(null);

		if (opcion == JFileChooser.APPROVE_OPTION) {
			
			// Aqui se obtiene la direccion de la ruta
			String nombreArchivo = eleccion.getSelectedFile().toString();

			abrirArchivo(nombreArchivo);

		} else {
			txtSalida.setText("Has pulsado cancelar");
		}

	}

	private void abrirArchivo(String nombreArchivo) {

		try {
			FileReader archivo = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(archivo);

			boolean eof = false;
			String linea = null;

			while (!eof) {

				linea = buffer.readLine();
				if (linea == null) {
					eof = true;
				} else {
					txtSalida.append(linea + "\n");
				}

			}

			buffer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
