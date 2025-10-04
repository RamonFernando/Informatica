package EjemplosPDF_1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CampoTexto extends JFrame {

	public static void main(String[] args) {
		//
		CampoTexto campoTexto = new CampoTexto();

	}

	public CampoTexto() {
		super("Campo Texto");
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Se crea para dar forma a los botones
		setLayout(new FlowLayout());

		// Para poner un panel
		JLabel lblDireccion = new JLabel("Direccion pagina web: ");
		// Panel para Texto de 30 caracteres
		JTextField txtDireccion = new JTextField("URL...", 30);
		add(lblDireccion);
		add(txtDireccion);

		// Para que no se pueda cambiar de tamaño la ventana
		setResizable(false);
		
		// Que sea visible la ventana
		setVisible(true);
	}

}
