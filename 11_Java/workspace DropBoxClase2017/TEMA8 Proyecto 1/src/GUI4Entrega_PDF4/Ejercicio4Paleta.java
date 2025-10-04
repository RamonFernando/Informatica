package GUI4Entrega_PDF4;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejercicio4Paleta extends JFrame implements FocusListener {

	private JTextArea txtPaleta;
	private JTextField txtColor;

	private JSlider sldRojo;
	private JSlider sldAzul;
	private JSlider sldVerde;

	public Ejercicio4Paleta() {
		// TODO Auto-generated constructor stub
		super("Paleta");
		setSize(247, 400);
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

		JLabel lblRojo = new JLabel("Rojo");
		sldRojo = new JSlider(0, 255, 250);
		sldRojo.setMajorTickSpacing(50);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setPaintTicks(true);
		sldRojo.setPaintLabels(true);
		sldRojo.addFocusListener(this);

		JLabel lblVerde = new JLabel("Verde");
		sldVerde = new JSlider(0, 255, 200);
		sldVerde.setMajorTickSpacing(50);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setPaintTicks(true);
		sldVerde.setPaintLabels(true);
		sldVerde.addFocusListener(this);

		JLabel lblAzul = new JLabel("Azul");
		sldAzul = new JSlider(0, 255, 50);
		sldAzul.setMajorTickSpacing(50);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setPaintTicks(true);
		sldAzul.setPaintLabels(true);
		sldAzul.addFocusListener(this);

		txtPaleta = new JTextArea(2, 9);
		txtColor = new JTextField(7);

		add(lblRojo);
		add(sldRojo);

		add(lblVerde);
		add(sldVerde);

		add(lblAzul);
		add(sldAzul);

		add(txtPaleta);
		add(txtColor);

		setResizable(true);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Ejercicio4Paleta();
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		int valor1 = sldRojo.getValue();
		int valor2 = sldVerde.getValue();
		int valor3 = sldAzul.getValue();

		String resultado = "#" + Integer.toHexString(valor1)
				+ Integer.toHexString(valor2) + Integer.toHexString(valor3);
		txtColor.setText(resultado.toUpperCase());

		txtPaleta.setBackground(new Color(valor1, valor2, valor3));
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}

}
