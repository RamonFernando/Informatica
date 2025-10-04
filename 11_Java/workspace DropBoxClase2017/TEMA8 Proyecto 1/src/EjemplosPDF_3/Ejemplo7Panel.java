package EjemplosPDF_3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejemplo7Panel extends JFrame implements FocusListener {

	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JPanel panelResultado;
	private int num1;
	private int num2;
	private int num3;

	public static void main(String[] args) {
		new Ejemplo7Panel();
	}

	public Ejemplo7Panel() {
		super("Focusable, cambio de color.");
		setSize(300, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JPanel panelColores = new JPanel();
		panelColores.setPreferredSize(new Dimension(125, 100));
		panelColores.setBorder(BorderFactory.createTitledBorder("R.G.B."));
		panelColores.setLayout(new BoxLayout(panelColores, BoxLayout.Y_AXIS));

		txt1 = new JTextField("0", 5);
		txt2 = new JTextField("0", 5);
		txt3 = new JTextField("0", 5);

		txt1.setBackground(new Color(255, 200, 200));
		txt2.setBackground(new Color(200, 255, 200));
		txt3.setBackground(new Color(200, 200, 255));

		panelColores.add(txt1);
		panelColores.add(txt2);
		panelColores.add(txt3);

		txt1.addFocusListener(this);
		txt2.addFocusListener(this);
		txt3.addFocusListener(this);

		panelResultado = new JPanel();
		panelResultado.setPreferredSize(new Dimension(125, 100));
		panelResultado.setBorder(BorderFactory.createTitledBorder("Mezcla"));
		panelResultado
				.setLayout(new BoxLayout(panelResultado, BoxLayout.Y_AXIS));
		panelResultado.setOpaque(true);
		panelResultado.setBackground(Color.BLACK);

		add(panelColores);
		add(panelResultado);

		setVisible(true);
	}

	@Override
	public void focusGained(FocusEvent e) {

		try {
			num1 = Integer.parseInt(txt1.getText());
			num2 = Integer.parseInt(txt2.getText());
			num3 = Integer.parseInt(txt3.getText());

			if (num1 > 255) {
				txt1.setText("255");
				num1 = 255;
			} else if (num1 < 0) {
				txt1.setText("0");
				num1 = 0;
			}
			if (num2 > 255) {
				txt2.setText("255");
				num2 = 255;
			} else if (num2 < 0) {
				txt2.setText("0");
				num2 = 0;
			}
			if (num3 > 255) {
				txt3.setText("255");
				num3 = 255;
			} else if (num3 < 0) {
				txt3.setText("0");
				num3 = 0;
			}

		} catch (Exception err) {
			JOptionPane.showMessageDialog(null,
					"¡Atención!, se ha producido un error.",
					"Error detectado...", JOptionPane.ERROR_MESSAGE);
			txt1.setText("0");
			txt2.setText("0");
			txt3.setText("0");
		}

		panelResultado.setBackground(new Color(num1, num2, num3));
	}

	@Override
	public void focusLost(FocusEvent e) {

	}

}
