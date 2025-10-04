package practicas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Raspberry extends JFrame implements ActionListener {

	private JButton btnBoton1;
	private JButton btnBoton2;
	private JButton btnBoton3;
	private JButton btnBoton4;
	private JButton btnBoton5;
	private JButton btnBoton6;
	private JTextArea txtArea;
	private JLabel lblTexto;
	private boolean v1 = false;
	private boolean v2 = false;
	private boolean v3 = false;

	public Raspberry() {
		// TODO Auto-generated constructor stub
		super("RasBerry");
		setSize(520, 412);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			System.out.println("Error al intentar cambiar el look and feel.");
		}

		JPanel panelup = new JPanel();
		panelup.setPreferredSize(new Dimension(500, 170));

		// panelup.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		panelup.setBorder(BorderFactory.createTitledBorder("Funciones"));

		// Panel Habitacion 1
		JPanel panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		panel1.setBorder(BorderFactory.createTitledBorder("Habitacion 1"));
		panel1.setPreferredSize(new Dimension(150, 120));
		btnBoton1 = new JButton("Encendido");
		btnBoton1.setPreferredSize(new Dimension(100, 30));
		btnBoton1.setBorder(BorderFactory.createEtchedBorder());
		btnBoton2 = new JButton("Apagado");
		btnBoton2.setPreferredSize(new Dimension(100, 30));
		btnBoton2.setBorder(BorderFactory.createEtchedBorder());
		panelup.add(panel1);
		panel1.add(btnBoton1);
		panel1.add(btnBoton2);
		btnBoton1.addActionListener(this);
		btnBoton2.addActionListener(this);

		// Panel Habitacion 2
		JPanel panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		panel2.setBorder(BorderFactory.createTitledBorder("Habitacion 2"));
		panel2.setPreferredSize(new Dimension(150, 120));
		btnBoton3 = new JButton("Encendido");
		btnBoton3.setPreferredSize(new Dimension(100, 30));
		btnBoton4 = new JButton("Apagado");
		btnBoton4.setPreferredSize(new Dimension(100, 30));
		panelup.add(panel2);
		panel2.add(btnBoton3);
		panel2.add(btnBoton4);
		btnBoton3.addActionListener(this);
		btnBoton4.addActionListener(this);

		// Panel Habitacion 3
		JPanel panel3 = new JPanel();
		panel3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		panel3.setBorder(BorderFactory.createTitledBorder("Habitacion 3"));
		panel3.setPreferredSize(new Dimension(150, 120));
		btnBoton5 = new JButton("Encendido");
		btnBoton5.setPreferredSize(new Dimension(100, 30));
		btnBoton5.setBorder(BorderFactory.createEtchedBorder());
		btnBoton6 = new JButton("Apagado");
		btnBoton6.setPreferredSize(new Dimension(100, 30));
		btnBoton6.setBorder(BorderFactory.createEtchedBorder());
		panelup.add(panel3);
		panel3.add(btnBoton5);
		panel3.add(btnBoton6);
		btnBoton5.addActionListener(this);
		btnBoton6.addActionListener(this);

		JPanel paneldown = new JPanel();
		paneldown.setPreferredSize(new Dimension(496, 180));
		paneldown.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		txtArea = new JTextArea(7, 41);
		JScrollPane scrollPanel = new JScrollPane(txtArea,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		lblTexto = new JLabel("Operaciones Servidor");
		paneldown.add(lblTexto);
		// txtArea.setText("\t \tOperaciones Servidor");

		paneldown.add(scrollPanel);

		add(panelup);
		add(paneldown);

		setResizable(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Raspberry();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnBoton1 == e.getSource() && v1 == false) {

			txtArea.append("Luz encendida Habitacion 1\n");
			v1 = true;
		} else if (btnBoton1 == e.getSource() && v1 == true) {
			txtArea.append("---------------------------------------------------\n");
			txtArea.append("La luz ya esta encendida Habitacion 1\n");
			v1 = true;

		}
		if (btnBoton2 == e.getSource() && v1 == true) {
			txtArea.append("Luz apagada Habitacion 1\n");
			v1 = false;
		} else if (btnBoton2 == e.getSource() && v1 == false) {
			txtArea.append("---------------------------------------------------\n");
			txtArea.append("La luz ya esta pagada Habitacion 1\n");
			v1 = false;

		}
		if (btnBoton3 == e.getSource() && v2 == false) {
			txtArea.append("Luz encendida Habitacion 2\n");
			v2 = true;
		} else if (btnBoton3 == e.getSource() && v2 == true) {
			txtArea.append("---------------------------------------------------\n");
			txtArea.append("La luz ya esta encendida Habitacion 2\n");
			v2 = true;

		}
		if (btnBoton4 == e.getSource() && v2 == true) {
			txtArea.append("Luz apagada Habitacion 2\n");
			v2 = false;
		} else if (btnBoton4 == e.getSource() && v2 == false) {
			txtArea.append("---------------------------------------------------\n");
			txtArea.append("La luz ya esta pagada Habitacion 2\n");
			v2 = false;

		}
		if (btnBoton5 == e.getSource() && v3 == false) {
			txtArea.append("Luz encendida Habitacion 3\n");
			v3 = true;
		} else if (btnBoton5 == e.getSource() && v3 == true) {
			txtArea.append("---------------------------------------------------\n");
			txtArea.append("La luz ya esta encendida Habitacion 3\n");
			v3 = true;

		}
		if (btnBoton6 == e.getSource() && v3 == true) {
			txtArea.append("Luz apagada Habitacion 3\n");
			v3 = false;
		} else if (btnBoton6 == e.getSource() && v3 == false) {
			txtArea.append("---------------------------------------------------\n");
			txtArea.append("La luz ya esta pagada Habitacion 3\n");
			v3 = false;

		}

	}

}
