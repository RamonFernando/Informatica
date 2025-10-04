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

public class Focus2_MezclaColores extends JFrame implements FocusListener {

	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JPanel Resultado;
	private int num1;
	private int num2;
	private int num3;

	public static void main(String[] args) {
		new Focus2_MezclaColores();
	}

	public Focus2_MezclaColores() {
		super("Focusable, cambio de color.");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JPanel Colores = new JPanel();
		Colores.setPreferredSize(new Dimension(125, 100));
		Colores.setBorder(BorderFactory.createTitledBorder("R.G.B."));
		Colores.setLayout(new BoxLayout(Colores, BoxLayout.Y_AXIS));

		txt1 = new JTextField("0", 5);
		txt2 = new JTextField("0", 5);
		txt3 = new JTextField("0", 5);

		txt1.setBackground(new Color(255, 200, 200));
		txt2.setBackground(new Color(200, 255, 200));
		txt3.setBackground(new Color(200, 200, 255));

		Colores.add(txt1);
		Colores.add(txt2);
		Colores.add(txt3);

		txt1.addFocusListener(this);
		txt2.addFocusListener(this);
		txt3.addFocusListener(this);

		Resultado = new JPanel();
		Resultado.setPreferredSize(new Dimension(125, 100));
		Resultado.setBorder(BorderFactory.createTitledBorder("Mezcla"));
		Resultado.setLayout(new BoxLayout(Resultado, BoxLayout.Y_AXIS));
		Resultado.setOpaque(true);
		Resultado.setBackground(Color.BLACK);

		add(Colores);
		add(Resultado);

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

		Resultado.setBackground(new Color(num1, num2, num3));
	}

	@Override
	public void focusLost(FocusEvent e) {

	}

}
