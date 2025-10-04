package GUI4Entrega_PDF4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio1Fotogramas extends JFrame implements ActionListener {

	JLabel lblImg;
	JButton btnBoton1;
	JButton btnBoton2;
	JButton btnBoton3;
	JButton btnBoton4;

	ImageIcon img1;
	ImageIcon img2;
	ImageIcon img3;
	ImageIcon img4;

	public static void main(String[] args) {
		// 1.- Crea una aplicacion que muestre en la parte superior cuatro
		// botones con titulos de peliculas. Al pulsar uno de los botones, se
		// mostrara¡ una imagen de dicha pelicula.
		// Utiliza BorderLayout para maquetar la ventana.
		new Ejercicio1Fotogramas();
	}

	public Ejercicio1Fotogramas() {
		super("Fotogramas");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		btnBoton1 = new JButton("Harry Poter");
		btnBoton2 = new JButton("La mascara");
		btnBoton3 = new JButton("Piratas del Caribe");
		btnBoton4 = new JButton("World of War Craft");

		btnBoton1.addActionListener(this);
		btnBoton2.addActionListener(this);
		btnBoton3.addActionListener(this);
		btnBoton4.addActionListener(this);

		JPanel btnPanel = new JPanel();

		JPanel img = new JPanel();
		img1 = new ImageIcon("img/HP.jpeg");
		img2 = new ImageIcon("img/LM.jpeg");
		img3 = new ImageIcon("img/PC.jpg");
		img4 = new ImageIcon("img/WOW.jpg");

		lblImg = new JLabel(img1);

		btnPanel.add(btnBoton1);
		btnPanel.add(btnBoton2);
		btnPanel.add(btnBoton3);
		btnPanel.add(btnBoton4);
		add(btnPanel);
		img.add(lblImg);
		add(img);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton botonPulsado = (JButton) e.getSource();

		if (botonPulsado == btnBoton1) {
			lblImg.setIcon(img1);
		}
		if (botonPulsado == btnBoton2) {
			lblImg.setIcon(img2);
		}
		if (botonPulsado == btnBoton3) {
			lblImg.setIcon(img3);
		}
		if (botonPulsado == btnBoton4) {
			lblImg.setIcon(img4);
		}

	}
}
