package EjercicioPreExamen;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio3Peliculas extends JFrame implements ItemListener{
	
	String[] peliculas = { "Titanic", "El turista", "Tom Rider" };
	String[] artistas = { "Leonardo Dicaprio", "Jonny Deep", "Angelina Jolie" };
	JLabel lblArtista;
	JComboBox<String> cmbpeliculas;
	
	public Ejercicio3Peliculas() {
		super("Peliculas de Ciencia Ficcion");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		cmbpeliculas = new JComboBox<>(peliculas);
		lblArtista = new JLabel("Artista");
		
		
		cmbpeliculas.addItemListener(this);
		
		
		add(cmbpeliculas);
		add(lblArtista);
		
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejercicio3Peliculas();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// System.out.println(peliculas[cmbpeliculas.getSelectedIndex()]);
		lblArtista.setText(artistas[cmbpeliculas.getSelectedIndex()]);
		
		
	}

}
