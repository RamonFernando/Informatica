package EjemplosPDF_2;

import java.awt.*;
import javax.swing.*;

public class EjemploFlowLayout extends JFrame {

	public static void main(String[] args) {
		new EjemploFlowLayout();
	}

	public EjemploFlowLayout() {

		super("Título");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT,30,5));
		
		JButton btn1 = (new JButton("Boton 1"));
		JButton btn2 = (new JButton("Boton 2"));
		JButton btn3 = (new JButton("Boton 3"));
		JButton btn4 = (new JButton("Boton 4"));
		JButton btn5 = (new JButton("Boton 5"));
		JButton btn6 = (new JButton("Boton 6"));
		JButton btn7 = (new JButton("Boton 7"));
		JButton btn8 = (new JButton("Boton 8"));
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);

		setVisible(true);

	}

}
