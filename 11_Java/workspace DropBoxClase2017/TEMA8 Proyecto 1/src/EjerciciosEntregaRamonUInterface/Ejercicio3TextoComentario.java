package EjerciciosEntregaRamonUInterface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.*;

import javax.swing.*;

public class Ejercicio3TextoComentario extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejercicio3TextoComentario();
	}

	public Ejercicio3TextoComentario() {
		super("Comentarios");
		setSize(400, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		// Vista de la Ventana
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			System.out.println("Error al intentar cambiar el look and feel.");
		}

		// Etiqueta
		JLabel lblEtiqueta = new JLabel("Deja un comentario");
		add(lblEtiqueta);

		JTextArea txtComentarios = new JTextArea("Comentario", 8, 28);
		FlowLayout dis = new FlowLayout();
		setLayout(dis);
		JScrollPane scrPanelBarras = new JScrollPane(txtComentarios);
		getContentPane().add(scrPanelBarras);

		JButton btnBoton1 = new JButton("Enviar");

		// Ventana
		add(btnBoton1);

		setResizable(false);
		setVisible(true);
	}
}
