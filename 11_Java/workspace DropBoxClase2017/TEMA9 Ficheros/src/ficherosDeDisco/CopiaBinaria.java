package ficherosDeDisco;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class CopiaBinaria extends JFrame {

	private JButton btnEjecutar;
	private JTextArea txtSalida;

	public CopiaBinaria() {
		super("Titulo");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JToolBar BarraHerramientas = new JToolBar();

		btnEjecutar = new JButton(new ImageIcon("iconos/38.png"));
		btnEjecutar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ejecutar();

			}
		});

		txtSalida = new JTextArea(1, 1);
		txtSalida.setLineWrap(true);
		txtSalida.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(txtSalida,
				JScrollPane.VERTICAL_SCROLLBAR_NEVER,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		add(BarraHerramientas, BorderLayout.NORTH);
		BarraHerramientas.add(btnEjecutar);
		add(scrollPane, BorderLayout.CENTER);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CopiaBinaria();
	}

	/**
	 * Copia Byte a Byte un archivo
	 */

	public void ejecutar() {
		// Abrimos el fichero original y la copia (que no tiene por que existir)

		// Para limpiar
		txtSalida.setText("");
		System.out.println("entrar");
		try {
			txtSalida.append("Creando Streams...");
			FileInputStream entrada = new FileInputStream(
					"ficheros/Texto.txt");
			FileOutputStream salida = new FileOutputStream(
					"ficheros/Texto.copia.txt");

			boolean eof = false;
			int caracter = 0;

			txtSalida.append("\nCopiando archivo");
			while (!eof) {
				caracter = entrada.read();
				if (caracter == -1) {
					eof = true;
				} else {
					salida.write(caracter);
				}

			}
			txtSalida.append("\nFinalizado");
			entrada.close();
			salida.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
