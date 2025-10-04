package EjemplosPDF_1;

import java.awt.*;
import javax.swing.*;

public class TemasSwing2 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TemasSwing2();

	}
	// Dos etiquetas
	// Dos botones
	// Un combobox
	// Aplicar el tema que quieras

	public TemasSwing2() {
		super("Temas");
		setSize(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al intentar cambiar el look and feel.");
		}
		
		
		JButton btnBoton1 = new JButton("Tema 1");
		JButton btnBoton2 = new JButton("Tema 2");
		add(btnBoton1);
		add(btnBoton2);

		
		JComboBox<String> cmbcolores = new JComboBox<>();
		cmbcolores.addItem("Verde");
		cmbcolores.addItem("Rojo");
		cmbcolores.addItem("Azul");
		add(cmbcolores);
		
		JLabel lblBoton = new JLabel("Boton");
		add(lblBoton);
		

		setVisible(true);
	}

}
