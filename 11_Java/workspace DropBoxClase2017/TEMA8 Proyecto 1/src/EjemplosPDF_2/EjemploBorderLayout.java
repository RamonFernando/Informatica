package EjemplosPDF_2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class EjemploBorderLayout extends JFrame {

	public static void main(String[] args) {
		new EjemploBorderLayout();
	}

	public EjemploBorderLayout() {

		super("BorderLayout");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al intentar cambiar el look and feel.");
		}

		JButton btnNorte = new JButton("Norte");
		JButton btnSur = new JButton("Sur");
		JButton btnEste = new JButton("Este");
		JButton btnOeste = new JButton("Oeste");
		JButton btnCentro = new JButton("Centro");

		add(btnNorte, BorderLayout.NORTH);
		add(btnSur, BorderLayout.SOUTH);
		add(btnEste, BorderLayout.EAST);
		add(btnOeste, BorderLayout.WEST);
		add(btnCentro, BorderLayout.CENTER);

		setVisible(true);
	}

}
