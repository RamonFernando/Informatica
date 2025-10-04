package EjemplosPDF_1;

import java.awt.FlowLayout;

import javax.swing.*;

public class TemasSwing extends JFrame {

	public static void main(String[] args) {
		TemasSwing temas = new TemasSwing();
	}

	public TemasSwing() {
		super("Opciones de instalación");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al intentar cambiar el look and feel.");
		}

		JCheckBox opcion1 = new JCheckBox("Writer");
		JCheckBox opcion2 = new JCheckBox("Calc");
		JCheckBox opcion3 = new JCheckBox("Base");
		JCheckBox opcion4 = new JCheckBox("Draw");

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(opcion1);
		grupo.add(opcion2);
		grupo.add(opcion3);
		grupo.add(opcion4);

		JButton btn1 = new JButton("Aceptar");
		JButton btn2 = new JButton("Cancelar");

		JComboBox cmbLista = new JComboBox();
		cmbLista.addItem(2);
		cmbLista.addItem("Monitor");

		add(opcion1);
		add(opcion2);
		add(opcion3);
		add(opcion4);

		add(btn1);
		add(btn2);

		add(cmbLista);

		setVisible(true);
	}

}
