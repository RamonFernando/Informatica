package EjemplosPDF_1;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PlayBack2 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlayBack2 playBack2 = new PlayBack2();
	}
	public PlayBack2(){
		// Titulo de la ventana
		super("PlayBack2");
		// Tamaño de la ventana
		setSize(300,100);
		// Comando para cerrar la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// FlowLayout son para darle forma a los botones
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		// JButton son para los botones
		JButton btnPlay = new JButton("Play");
		add(btnPlay);
		JButton btnStop = new JButton("Stop");
		add(btnStop);
		JButton btnPause = new JButton("Pause");
		add(btnPause);
		
		
		// Para hacerla visible
		setVisible(true);
	}
}
