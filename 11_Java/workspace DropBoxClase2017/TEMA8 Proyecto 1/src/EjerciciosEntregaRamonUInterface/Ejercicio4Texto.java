package EjerciciosEntregaRamonUInterface;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.*;

import javax.swing.*;

public class Ejercicio4Texto extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejercicio4Texto();
	}

	public Ejercicio4Texto() {
		super("Suscripción");
		setSize(282, 400);
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

		// 1er Panel
		// Etiqueta
		JLabel lblNombre = new JLabel("Nombre ");
		// Cuadro de Texto
		JTextField txtNombre = new JTextField("Nombre...", 21);
		add(lblNombre);
		add(txtNombre);

		// 2do
		// Etiqueta
		JLabel lblEmail = new JLabel("Email ");
		// Cuadro de Texto
		JTextField txtEmail = new JTextField("Email...", 21);
		add(lblEmail);
		add(txtEmail);

		// 3er Panel
		// Etiqueta
		JLabel lblEtiqueta = new JLabel("Deja un comentario");
		add(lblEtiqueta);
		// Cuadro de Texto
		JTextArea txtComentarios = new JTextArea(
				"Motivo por el que te suscribes", 8, 21);
		FlowLayout dis = new FlowLayout();
		setLayout(dis);
		JScrollPane scrPanelBarras = new JScrollPane(txtComentarios);
		getContentPane().add(scrPanelBarras);

		// 4to Panel
		// Etiqueta
		JCheckBox chkMensaje = new JCheckBox(
				"Recivir informacion por correo   ");
		add(chkMensaje);
		// Boton
		JButton btnEnviar = new JButton("Enviar");
		add(btnEnviar);

		setResizable(true);
		setVisible(true);
	}
}
