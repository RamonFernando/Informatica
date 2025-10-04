package EjemplosPDF_3;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Ejemplo8ComboBox extends JFrame implements ItemListener {

	// Variable Global
	private JComboBox<String> cmbLibros;
	private JLabel lblAutor;
	private String[] autores = { "Bram Stoker", "Joseph Sheridan Le Fanu", "Jhon William Polidori", "Stephen King" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejemplo8ComboBox();
	}

	public Ejemplo8ComboBox() {
		super("Biblioteca");
		setSize(380, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		String[] Libros = { "Drácula", "Carmilla", "El vampiro", "El misterio de Salem's Lot" };
		cmbLibros = new JComboBox<>(Libros);
		cmbLibros.addItemListener(this);

		JLabel lblTitulo = new JLabel("Título");
		lblAutor = new JLabel("Autor: " + autores[0]);

		// Ventana
		add(lblTitulo);
		add(cmbLibros);
		add(lblAutor);

		setResizable(true);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		int posicion = cmbLibros.getSelectedIndex();
		lblAutor.setText(autores[posicion]);
	}
}
