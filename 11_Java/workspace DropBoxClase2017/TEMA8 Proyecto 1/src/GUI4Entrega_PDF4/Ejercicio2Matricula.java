package GUI4Entrega_PDF4;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Ejercicio2Matricula extends JFrame implements ItemListener {

	String[] cursos = { "Selecciona un curso", "1º ESO", "2º ESO", "3º ESO",
			"4º ESO" };
	private JLabel lblCurso;
	private JComboBox cmbCursos;

	public Ejercicio2Matricula() {
		// TODO Auto-generated constructor stub
		super("Matricula");
		setSize(310, 260);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			System.out.println("Error al intentar cambiar el look and feel.");
		}

		JLabel lblApellidos = new JLabel("Apellidos");
		JTextField txtApellidos = new JTextField("Apellidos", 22);

		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField("Nombre", 22);

		JLabel lblCur = new JLabel("Curso");
		cmbCursos = new JComboBox(cursos);
		cmbCursos.addItemListener(this);

		JPanel panel = (JPanel) getContentPane();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 0, 0));
		panel.setBorder(BorderFactory
				.createTitledBorder("Datos del Estudiante"));

		JLabel lblSeleccion = new JLabel("Curso seleccionado: ");

		lblCurso = new JLabel("");

		// Apellidos
		add(lblApellidos);
		add(txtApellidos);
		// Nombre
		add(lblNombre);
		add(txtNombre);
		// Cursos
		add(lblCur);
		add(cmbCursos);

		//
		add(lblSeleccion);
		add(lblCurso);

		setResizable(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejercicio2Matricula();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

		if (cursos[cmbCursos.getSelectedIndex()] == cursos[0]) {
			lblCurso.setText("");
		} else {
			lblCurso.setText("Curso: " + cursos[cmbCursos.getSelectedIndex()]);
		}

	}

}
