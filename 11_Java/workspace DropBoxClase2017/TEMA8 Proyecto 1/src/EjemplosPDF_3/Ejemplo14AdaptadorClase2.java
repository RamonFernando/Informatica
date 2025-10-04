package EjemplosPDF_3;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.management.monitor.Monitor;
import javax.swing.*;

public class Ejemplo14AdaptadorClase2 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejemplo14AdaptadorClase2();
	}

	JLabel lblTexto;

	public Ejemplo14AdaptadorClase2() {
		// TODO Auto-generated constructor stub
		super("Letras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);

		setLayout(new FlowLayout());

		lblTexto = new JLabel("Ve pulsando Teclas");
		add(lblTexto);

		MonitorTeclas monitor = new MonitorTeclas(this);
		addKeyListener(monitor);

		setVisible(true);
	}

	class MonitorTeclas extends KeyAdapter {
		Ejemplo14AdaptadorClase2 ventana;

		MonitorTeclas(Ejemplo14AdaptadorClase2 ventana) {
			this.ventana = ventana;
		}

		@Override
		public void keyTyped(KeyEvent evento) {
			// String texto = ventana.lblTexto.getText();
			ventana.lblTexto.setText("" + evento.getKeyChar());
		}
	}
}
