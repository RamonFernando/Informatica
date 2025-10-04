package practicas;

import java.awt.FlowLayout;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

// Para conectarse desde la consola es el comando: netstat -tln
/**
 * La clase Servidor abre un puerto de red y muestra los mensajes que va
 * recibiendo por ese puerto.
 * 
 * @author Carlos
 *
 */
public class Servidor extends JFrame {

	private JTextArea txtMensajes;

	public Servidor() {

		super("Servidor");
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		txtMensajes = new JTextArea(6, 32);
		JScrollPane scrMensajes = new JScrollPane(txtMensajes);

		add(scrMensajes);

		setVisible(true);

		iniciarServicio();

	}

	/**
	 * Abre un puerto de red y empieza a escuchar conexiones a través de él.
	 * Cuando llega una conexión crea un nuevo hilo para atenderla.
	 */
	private void iniciarServicio() {

		ServerSocket socketServidor;
		
		try {
			socketServidor = new ServerSocket(5000);
			
			Socket socketCliente;
			
			while(true){
				// Guarda la peticion en socketCliente
				// socketCliente = socketServidor.accept();
				// txtMensajes.append("Ha llegado una peticion!!\n");
				
				// Crear un hilo nuevo,pasarle socketCliente
				// (que permite obtener el mensaje que nos ha 
				// enviado desde un cliente).
				socketCliente = socketServidor.accept();
				
				Thread hilo = new Thread(
						new ManejadorPeticiones(socketCliente, this));
				hilo.start();
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public JTextArea getTxtMensajes() {
		return txtMensajes;
	}

	public void setTxtMensajes(JTextArea txtMensajes) {
		this.txtMensajes = txtMensajes;
	}

	public static void main(String[] args) {
		new Servidor();
	}

}
