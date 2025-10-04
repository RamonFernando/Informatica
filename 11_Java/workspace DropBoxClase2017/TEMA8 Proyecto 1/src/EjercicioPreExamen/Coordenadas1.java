package EjercicioPreExamen;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Coordenadas1 extends JFrame implements MouseListener{
	
	private JLabel lblCoordenadas;
	private JLabel lblBoton;
	private int x,y;
	
	public Coordenadas1() {
		super("Coordenadas");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		
		lblCoordenadas = new JLabel("Coordenadas:");
		lblBoton = new JLabel("Boton:");
		
		addMouseListener(this);
		
		add(lblCoordenadas);
		add(lblBoton);
		
	
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Coordenadas1();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		x = e.getX();
		y = e.getY();
		lblCoordenadas.setText("Coordenadas: (" + x + " , " + y + ")");
		lblBoton.setText("Boton: " + e.getButton());
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
