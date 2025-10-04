package EjemplosPDF_2;

import java.awt.*;
import javax.swing.*;

public class Plantilla extends JFrame {

	public static void main(String[] args) {
		new Plantilla();
	}

	public Plantilla() {

		super("Título");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setVisible(true);

	}

}
