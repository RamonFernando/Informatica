package practicas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class PruebaHilos extends JFrame {

	private JButton btnEjecutar;
	private JTextArea txtSalida;

	public PruebaHilos() {
		super("Titulo");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JToolBar BarraHerramientas = new JToolBar();

		btnEjecutar = new JButton(new ImageIcon("iconos/38.png"));
		btnEjecutar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lanzarHilos();

			}

		});

		txtSalida = new JTextArea(1, 1);
		txtSalida.setLineWrap(true);
		txtSalida.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(txtSalida, JScrollPane.VERTICAL_SCROLLBAR_NEVER,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		add(BarraHerramientas, BorderLayout.NORTH);
		BarraHerramientas.add(btnEjecutar);
		add(scrollPane, BorderLayout.CENTER);
		setVisible(true);
	}

	private void lanzarHilos() {
		txtSalida.setText("Iniciando el programa con el hilo " + Thread.currentThread().getName());
		System.out.println("Iniciando el programa con el hilo " + Thread.currentThread().getName());
		
		Thread hilo1 = new Thread(new Hilo());
		Thread hilo2 = new Thread(new Hilo());
		Thread hilo3 = new Thread(new Hilo());
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
	}

	public static void main(String[] args) {
		new PruebaHilos();
	}
}
