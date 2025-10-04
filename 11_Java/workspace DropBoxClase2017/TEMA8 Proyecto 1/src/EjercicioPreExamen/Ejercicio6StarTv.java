package EjercicioPreExamen;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio6StarTv extends JFrame implements KeyListener{
	
	int x = 50;
	int y = 50;
	JLabel lbltv;
	
	public Ejercicio6StarTv() {
		// TODO Auto-generated constructor stub
		super("StarTV");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		addKeyListener(this);
		
		ImageIcon imgtv = new ImageIcon("iconos/67.png");
		JButton btntv = new JButton(imgtv);
		lbltv = new JLabel(imgtv);
		
		// Para agregar al JLabel el tamaño de la Imagen
		lbltv.setBounds(x,y,24,24);
		add(lbltv);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejercicio6StarTv();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyChar() == 'w') {
			y -= 5;
		}
		if (e.getKeyChar() == 's') {
			y += 5;
		}
		if (e.getKeyChar() == 'a') {
			x -= 5;
		}
		if (e.getKeyChar() == 'd') {
			x += 5;
		}
		lbltv.setBounds(x,y,24,24);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
