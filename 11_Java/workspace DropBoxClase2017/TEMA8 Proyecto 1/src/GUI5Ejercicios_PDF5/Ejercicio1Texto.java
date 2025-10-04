package GUI5Ejercicios_PDF5;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.*;

import javax.swing.*;

public class Ejercicio1Texto extends JFrame implements FocusListener {

	JTextField txtField1;
	JTextField txtField2;
	JTextField txtField3;

	public Ejercicio1Texto() {
		super("Texto decorado");
		setSize(400, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 33));
		panel.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		txtField1 = new JTextField(8);
		txtField2 = new JTextField(8);
		txtField3 = new JTextField(8);

		add(panel);
		panel.add(txtField1);
		panel.add(txtField2);
		panel.add(txtField3);

		txtField1.addFocusListener(this);
		txtField2.addFocusListener(this);
		txtField3.addFocusListener(this);

		setResizable(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejercicio1Texto();
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub

		if (txtField1 == e.getSource()) {
			txtField1.setBackground(Color.YELLOW);
		} else {
			txtField1.setBackground(Color.WHITE);
		}

		if (txtField2 == e.getSource()) {
			txtField2.setBackground(Color.YELLOW);
		} else {
			txtField2.setBackground(Color.WHITE);
		}

		if (txtField3 == e.getSource()) {
			txtField3.setBackground(Color.YELLOW);
		} else {
			txtField3.setBackground(Color.WHITE);
		}
	}

	@Override
	public void focusLost(FocusEvent e) {

	}

}
