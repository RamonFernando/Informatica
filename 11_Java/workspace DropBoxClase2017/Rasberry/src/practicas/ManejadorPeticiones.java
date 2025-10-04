package practicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.Buffer;

public class ManejadorPeticiones implements Runnable {

	private Socket socketCliente;
	private Servidor ventana;

	public ManejadorPeticiones(Socket socketCliente, Servidor ventana) {
		this.socketCliente = socketCliente;
		this.ventana = ventana;
	}

	@Override
	public void run() {
		// System.out.println("Atendiendo una peticion de un cliente " + "desde
		// el hilo " + Thread.currentThread().getName());
		ventana.getTxtMensajes().append(
				"Atendiendo una peticion de un cliente " + "desde el hilo " + Thread.currentThread().getName() + "\n");
		;

		// Creamos un buffer de entrada para recibir del cliente
		BufferedReader buffer = null;

		try {
			buffer = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));

			String mensaje = buffer.readLine();
			SocketAddress direccionSocket = socketCliente.getRemoteSocketAddress();
			String ipCliente = direccionSocket.toString();
			String[] campos = ipCliente.split(":");
			ipCliente = campos[0].substring(1);

			ventana.getTxtMensajes().append(ipCliente + ": " + mensaje + "\n");
			;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
