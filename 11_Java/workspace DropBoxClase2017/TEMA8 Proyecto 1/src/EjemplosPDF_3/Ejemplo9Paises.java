package EjemplosPDF_3;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Ejemplo9Paises extends JFrame implements ItemListener {

	// Variable Global
	private JComboBox<String> cmbPais;
	private String[][] informacion = { { "Madrid", "46,56Mill", "Europa" }, { "La habana", "11,39Mill", "America" },
			{ "Washington D.C", "321,4Mill", "America" } };
	private JLabel lblInformacion1;
	private JLabel lblInformacion2;
	private JLabel lblInformacion3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejemplo9Paises();
	}

	public Ejemplo9Paises() {
		// TODO Auto-generated constructor stub
		super("Paises");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		JPanel panel = (JPanel) getContentPane();
		panel.setBorder(BorderFactory.createEmptyBorder(40, 30, 0, 0));
		panel.setBorder(BorderFactory.createTitledBorder("Paises"));

		String[] paises = { "España", "Cuba", "EUA" };

		JLabel lblPais = new JLabel("País");
		add(lblPais);
		cmbPais = new JComboBox<>(paises);
		cmbPais.addItemListener(this);
		add(cmbPais);

		JLabel lblinformacion = new JLabel();
		lblInformacion1 = new JLabel("Capital: " + informacion[0][0]);
		lblInformacion2 = new JLabel("Habitantes: " + informacion[0][1]);
		lblInformacion3 = new JLabel("Continente: " + informacion[0][2]);
		add(lblinformacion);
		add(lblInformacion1);
		add(lblInformacion2);
		add(lblInformacion3);
		// panel.add(lblinformacion);
		// panel.add(cmbPais);
		// panel.add(lblInformacion1);
		// panel.add(lblInformacion2);
		// panel.add(lblInformacion3);
		//

		setResizable(true);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		int posicion = cmbPais.getSelectedIndex();
		lblInformacion1.setText("Capital: " + informacion[posicion][0]);
		lblInformacion2.setText("Habitantes: " + informacion[posicion][1]);
		lblInformacion3.setText("Continente: " + informacion[posicion][2]);
	}
}
