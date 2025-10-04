package ficherosDeDisco;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class LectorByte extends JFrame {

	private JButton btnEjecutar;
	private JTextArea txtSalida;

	public LectorByte() {
		super("Lectura Byte");
		setSize(500, 400);
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
		JScrollPane scrollPane = new JScrollPane(txtSalida, JScrollPane.VERTICAL_SCROLLBAR_NEVER,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		add(BarraHerramientas, BorderLayout.NORTH);
		BarraHerramientas.add(btnEjecutar);
		add(scrollPane, BorderLayout.CENTER);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LectorByte();
	}

	public void ejecutar() {

		txtSalida.setText("");
		try {
			FileInputStream archivo = new FileInputStream("Fichero/Ordenador.jpg");
			boolean eof = false;
			int caracter = 0;
			int contador = 0;

			
			while (!eof) {
				
				caracter = archivo.read();
				if (caracter == -1) {
					eof = true;
				} else {
					contador++;
					txtSalida.append(caracter + " ");
				}
			}
			
			
			txtSalida.append("\n" + contador + " bytes leidos");
			archivo.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
