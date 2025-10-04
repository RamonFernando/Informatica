package EjercicioPreExamen;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Coordenadas extends JFrame implements MouseListener{
	
	private JLabel lblcord;
	private JLabel lblBoton;
	private int x,y;
	
	public Coordenadas() {
		super("Coordenadas de Click");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		
		lblcord = new JLabel("Coordenadas:");
		lblBoton = new JLabel("Boton:");
		
		addMouseListener(this);
		
		
		add(lblcord);
		add(lblBoton);
		
		setResizable(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Coordenadas();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		x = e.getX();
		y = e.getY();
		
		lblcord.setText("Coordenadas: (" + x + "," + y + ")");
		lblBoton.setText("Boton: " + e.getButton()); 
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
