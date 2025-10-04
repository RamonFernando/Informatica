package EjemplosPDF_2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();
	}
	public Login() {

		super("Login");
		setSize(370, 130);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new GridLayout(1,2));
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al intentar cambiar el look and feel.");
		}
		
		
		// Panel Izquierdo
		// JPanel por defecto tiene un FlowLayout
		JPanel panelIzquierdo = new JPanel();
		
		JLabel lblUsuario = new JLabel("Usuario");
		JTextField txtUsuario = new JTextField(15);
		
		JLabel lblPassword = new JLabel("Password");
		JTextField txtpassword = new JTextField(15);
		
		panelIzquierdo.add(lblUsuario);
		panelIzquierdo.add(txtUsuario);
		panelIzquierdo.add(lblPassword);
		panelIzquierdo.add(txtpassword);
		
		
		// Panel Derecho
		JPanel panelDerecho = new JPanel();
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setPreferredSize(new Dimension(100, 25));
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.setPreferredSize(new Dimension(100, 25));
		
		panelDerecho.add(btnLogin);
		panelDerecho.add(btnRegistro);
		
		// Ventana
		add(panelIzquierdo);
		add(panelDerecho);
		
		setVisible(true);

	}
}
