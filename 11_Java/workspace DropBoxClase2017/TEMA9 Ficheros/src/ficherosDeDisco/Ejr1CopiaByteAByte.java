package ficherosDeDisco;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;



public class Ejr1CopiaByteAByte extends JFrame {
	/**
	 * 1.- Escribe un programa de línea de comandos cuya tarea sea copiar byte a
	 * byte un archivo dentro de la carpeta ficheros de tu proyecto. El nombre
	 * del archivo lo leerá por consola, y el nombre de la copia será el mismo
	 * anteponiendo la palabra "copia" a la extensión. Por ejemplo:
	 * unaimagen.jpg se copiará con el nombre miarchivo.copia.jpg Ayuda:
	 * Recuerda los métodos substring() y lastIndexOf().
	 */
	private JButton btnEjecutar;
	private JTextArea txtSalida;

	public Ejr1CopiaByteAByte() {
		super("Programa de Copiar");
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
		// setResizable(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejr1CopiaByteAByte();

	}
	private void ejecutar() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Ejecutando...", "Ejecutando", JOptionPane.INFORMATION_MESSAGE);
	}

}
