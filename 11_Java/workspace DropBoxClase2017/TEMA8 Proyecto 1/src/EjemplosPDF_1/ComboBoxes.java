package EjemplosPDF_1;

import javax.swing.*;
import java.awt.*;

public class ComboBoxes extends JFrame {

	public static void main(String[] args) {
		new ComboBoxes();

	}

	public ComboBoxes() {
		super("Provincia");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		
		// Para poner un cajon de opciones
		JComboBox<String> cmbProvincia = new JComboBox();
		cmbProvincia.addItem("Albacete");
		cmbProvincia.addItem("Alicante");
		cmbProvincia.addItem("Baleares");
		cmbProvincia.addItem("Barcelona");
		cmbProvincia.addItem("Madrid");
		cmbProvincia.setPreferredSize(new Dimension(200, 20));

		add(new JLabel("Elija Provincia"));
		add(cmbProvincia);

		setVisible(true);
	}
}
