package EjemplosPDF_2;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Concesionario_de_Coches extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Concesionario_de_Coches();
	}

	public Concesionario_de_Coches() {
		super("Concesionario de Coches");

		setSize(170, 160);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(1,2));
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al intentar cambiar el look and feel.");
		}

		
		JPanel panelIzquierdo = new JPanel();
		panelIzquierdo.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		// Panel Izquierdo
		// Etiqueta
		JLabel lblMarca = new JLabel("Marca");
		
		JCheckBox chkSeat = new JCheckBox("Seat");
		JCheckBox chkFerrari = new JCheckBox("Ferrari");
		JCheckBox chkRenault = new JCheckBox("Renault");
		JCheckBox chkFord = new JCheckBox("Ford");
		JCheckBox chkAudi = new JCheckBox("Audi");

		// Botones
		panelIzquierdo.add(lblMarca);
		panelIzquierdo.add(chkSeat);
		panelIzquierdo.add(chkFerrari);
		panelIzquierdo.add(chkRenault);
		panelIzquierdo.add(chkFord);
		panelIzquierdo.add(chkFord);
		panelIzquierdo.add(chkAudi);
		
		
		// Panel Derecho
		JPanel panelDerecho = new JPanel();
		panelDerecho.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton btnAceptar = new JButton("Aceptar");
		panelDerecho.add(btnAceptar);
		
		
		// Ventana
		
		add(panelIzquierdo);
		add(panelDerecho);

		// pack();
		// setResizable(false);
		setVisible(true);
	}
}
