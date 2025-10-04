package EjemplosPDF_2;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BordeInvisible extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BordeInvisible();
	}

	public BordeInvisible() {
		// TODO Auto-generated constructor stub
		super("Título");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JPanel panel = (JPanel)getContentPane();
		
		JLabel lblNombre = new JLabel("Nombre completo");
		JTextField txtNombre = new JTextField(15);
		
		
		// Ventana
		
		panel.add(lblNombre);
		panel.add(txtNombre);
		
		// Border
		panel.setBorder(BorderFactory.createEmptyBorder(40, 30, 0, 0));
		panel.setBorder(BorderFactory.createTitledBorder("Usuario"));
		
		setVisible(true);

	}
}
