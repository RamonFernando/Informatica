package ficherosDeDisco;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Plantilla extends JFrame  {

	private JButton btnEjecutar;
	private JTextArea txtSalida;

	public Plantilla() {
		super("Titulo");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JToolBar BarraHerramientas = new JToolBar();

		btnEjecutar = new JButton(new ImageIcon("iconos/38.png"));
		btnEjecutar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ejecutar();

			}
		});

		txtSalida = new JTextArea(1, 1);
		txtSalida.setLineWrap(true);
		txtSalida.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(txtSalida, 
				JScrollPane.VERTICAL_SCROLLBAR_NEVER,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		add(BarraHerramientas, BorderLayout.NORTH);
		BarraHerramientas.add(btnEjecutar);
		add(scrollPane, BorderLayout.CENTER);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Plantilla();
	}


	public void ejecutar() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Ejecutando...", "Ejecutando", JOptionPane.INFORMATION_MESSAGE);
	}

}
