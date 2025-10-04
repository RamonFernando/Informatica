package InterfazGrafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PrimeraInterfaz extends JFrame implements ActionListener{
	
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JTextField txtNombre;

	public PrimeraInterfaz() {
		super("Informacion");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel panelsuperior = new JPanel();
		panelsuperior.setPreferredSize(new Dimension(350,170));
		panelsuperior.setBorder(BorderFactory.createTitledBorder("Datos"));
		// panelsuperior.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		JTextField txtNombre = new JTextField();
		JTextField txtPass = new JTextField();
		JLabel lblnombre = new JLabel("Nombre");
		txtNombre.setPreferredSize(new Dimension(100,20));
		
		JLabel lblPass = new JLabel("Contraseña");
		txtPass.setPreferredSize(new Dimension(100,20));
		
		panelsuperior.add(lblnombre);
		panelsuperior.add(lblPass);
		
		panelsuperior.add(txtNombre);
		panelsuperior.add(txtPass);
		
		
		
		JPanel panelInferior = new JPanel();
		
		
		
		add(panelsuperior);
		add(panelInferior);
		
		setResizable(true);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new PrimeraInterfaz();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
