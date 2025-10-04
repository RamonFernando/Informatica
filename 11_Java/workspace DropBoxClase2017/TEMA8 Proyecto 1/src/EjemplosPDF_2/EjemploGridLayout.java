package EjemplosPDF_2;

import java.awt.*;
import javax.swing.*;

public class EjemploGridLayout extends JFrame {

	public static void main(String[] args) {
		new EjemploGridLayout();
	}

	public EjemploGridLayout() {

		super("Título");
		setSize(250, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Separacion(Filas, Columnas, Separacion Vertical, Separacion
		// Orizontal); (5,2,5,5)
		setLayout(new GridLayout(5, 2, 5, 5));

		JCheckBox chkJava = new JCheckBox("Java");
		JCheckBox chkRuby = new JCheckBox("Ruby");
		JCheckBox chkC = new JCheckBox("C");
		JCheckBox chkCpp = new JCheckBox("C++");
		JCheckBox chkPython = new JCheckBox("Python");
		JCheckBox chkCobol = new JCheckBox("Cobol");
		JCheckBox chkPhp = new JCheckBox("Php");
		JCheckBox chkJavaScript = new JCheckBox("JavaScript");
		JCheckBox chkBasic = new JCheckBox("Basic");
		JCheckBox chkPascal = new JCheckBox("Pascal");

		add(chkJava);
		add(chkRuby);
		add(chkC);
		add(chkCpp);
		add(chkPython);
		add(chkCobol);
		add(chkPhp);
		add(chkJavaScript);
		add(chkBasic);
		add(chkPascal);

		setVisible(true);

	}

}
