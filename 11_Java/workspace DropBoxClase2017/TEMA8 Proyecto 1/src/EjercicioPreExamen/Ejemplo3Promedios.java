package EjercicioPreExamen;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ejemplo3Promedios extends JFrame implements FocusListener {

	private JTextField txtBoton1, txtBoton2, txtBoton3;
	private JTextArea txtArea;
	private double v1,v2,v3;
	JScrollPane scrPanel;

	public static void main(String[] args) {
		new Ejemplo3Promedios();
	}

	public Ejemplo3Promedios() {

		super("Media");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		txtBoton1 = new JTextField("0", 7);
		txtBoton2 = new JTextField("0", 7);
		txtBoton3 = new JTextField("0", 7);
		txtArea = new JTextArea("La media es: 0.0",7, 23);
		scrPanel = new JScrollPane(txtArea,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		add(txtBoton1);
		add(txtBoton2);
		add(txtBoton3);
		add(scrPanel);

		txtBoton1.addFocusListener(this);
		txtBoton2.addFocusListener(this);
		txtBoton3.addFocusListener(this);

		setResizable(true);
		setVisible(true);

	}

	@Override
	public void focusGained(FocusEvent e) {
		if (txtBoton1 == e.getSource()) {
			txtBoton1.setText("");
		}
		else if (txtBoton2 == e.getSource()) {
			txtBoton2.setText("");
		}
		else if (txtBoton3 == e.getSource()) {
			txtBoton3.setText("");
		}
		
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		
		double v1 = Integer.parseInt(txtBoton1.getText()); 
		double v2 = Integer.parseInt(txtBoton2.getText());
		double v3 = Integer.parseInt(txtBoton3.getText());
		
		double media = (v1 + v2 + v3)/3;
		
		
		txtArea.setText("La media es: " +  media);
	}

}
