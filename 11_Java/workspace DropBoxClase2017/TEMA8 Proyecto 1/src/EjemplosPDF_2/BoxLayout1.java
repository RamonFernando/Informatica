package EjemplosPDF_2;

import java.awt.*;
import javax.swing.*;

public class BoxLayout1 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoxLayout1();
	}

	public BoxLayout1() {
		super("BoxLayout");
		setSize(350, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxLayout horizontal = new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS);
		setLayout(horizontal);
		
		JButton alta = new JButton("Alta");
		JButton baja = new JButton("Baja");
		JButton actualizar = new JButton("Actualizar");
		JButton salvar = new JButton("Salvar");
		
		add(alta);
		add(baja);
		add(actualizar);
		add(salvar);
		
		setVisible(true);
	}
}
