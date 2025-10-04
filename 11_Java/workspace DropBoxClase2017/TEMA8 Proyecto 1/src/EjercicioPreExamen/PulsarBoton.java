package EjercicioPreExamen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PulsarBoton extends JFrame implements ActionListener {

	JButton btnBoton;
	JLabel pulsado;

	public PulsarBoton() {
		// TODO Auto-generated constructor stub
		super("Ejemplo Boton");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		btnBoton = new JButton("Pulsar");
		pulsado = new JLabel("Aun no has pulsado el boton");
		btnBoton.addActionListener(this);

		
		
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(190,190));
		panel.add(btnBoton);
		panel.add(pulsado);
		
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		add(panel);
		

		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PulsarBoton();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnBoton == e.getSource()) {
			pulsado.setText("Por Fin!!");
			

		}

	}

}
