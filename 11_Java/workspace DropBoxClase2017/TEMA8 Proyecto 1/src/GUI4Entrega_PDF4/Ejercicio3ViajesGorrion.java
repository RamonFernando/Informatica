package GUI4Entrega_PDF4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio3ViajesGorrion extends JFrame implements ItemListener {

	private JLabel lblPrecioTotal;
	private JCheckBox chk1;
	private JCheckBox chk2;
	private JCheckBox chk3;
	private JCheckBox chk4;
	private int precio;

	public Ejercicio3ViajesGorrion() {
		// TODO Auto-generated constructor stub
		super("Viajes Gorrion");
		setSize(200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JPanel panel = (JPanel) getContentPane();
		panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));
		panel.setBorder(BorderFactory.createTitledBorder("Opciones:"));

		chk1 = new JCheckBox("Billetes de avion");
		chk2 = new JCheckBox("Transporte aeropuerto");
		chk3 = new JCheckBox("Estancia en el Hotel");
		chk4 = new JCheckBox("Pension completa");

		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
		chk4.addItemListener(this);

		// ButtonGroup btnGrupo = new ButtonGroup();
		// btnGrupo.add(chkBilletes);
		// btnGrupo.add(chkTransporte);
		// btnGrupo.add(chkhotel);
		// btnGrupo.add(chkpension);

		lblPrecioTotal = new JLabel("Precio Total: 0€");

		add(chk1);
		add(chk2);
		add(chk3);
		add(chk4);
		add(lblPrecioTotal);

		setResizable(true);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejercicio3ViajesGorrion();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getSource());
		System.out.println(chk1);
		System.out.println(chk1.isSelected());

		if (e.getSource().equals(chk1) && chk1.isSelected() == true) {
			precio += 120;
		} else if (e.getSource().equals(chk1) && chk1.isSelected() == false) {
			precio -= 120;
		} else if (e.getSource().equals(chk2) && chk2.isSelected() == true) {
			precio += 40;
		} else if (e.getSource().equals(chk2) && chk2.isSelected() == false) {
			precio -= 40;
		} else if (e.getSource().equals(chk3) && chk3.isSelected() == true) {
			precio += 100;
		} else if (e.getSource().equals(chk3) && chk3.isSelected() == false) {
			precio -= 100;
		} else if (e.getSource().equals(chk4) && chk4.isSelected() == true) {
			precio += 120;
		} else if (e.getSource().equals(chk4) && chk4.isSelected() == false) {
			precio -= 120;
		}

		lblPrecioTotal.setText("Precio Total: " + precio + "€");
	}

}
