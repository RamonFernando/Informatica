package EjemplosPDF_1;

import java.awt.*;
import javax.swing.*;

public class CheckBoxes extends JFrame {

	public static void main(String[] args) {

		CheckBoxes checkBoxes = new CheckBoxes();

	}

	public CheckBoxes() {
		super("Opciones de instalacion");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		// Ventanas para marcar
		JCheckBox opcion1 = new JCheckBox("Writer");
		JCheckBox opcion2 = new JCheckBox("Calc");
		JCheckBox opcion3 = new JCheckBox("Base");
		JCheckBox opcion4 = new JCheckBox("Draw");

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(opcion1);
		grupo.add(opcion2);
		grupo.add(opcion3);
		grupo.add(opcion4);

		add(opcion1);
		add(opcion2);
		add(opcion3);
		add(opcion4);

		setVisible(true);

	}
}
