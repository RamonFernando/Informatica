package EjemplosPDF_3;

import java.awt.FlowLayout;

import java.awt.*;
import javax.swing.*;

public class Ejemplo15JMenuBar extends JFrame {

	public static void main(String[] args) {
		new Ejemplo15JMenuBar();
	}

	public Ejemplo15JMenuBar() {

		super("Barra de menú");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		// Menú File
		JMenuItem itemNew = new JMenuItem("New");
		JMenuItem itemOpenFile = new JMenuItem("Open File...");
		JMenuItem itemOpenProjects = new JMenuItem(
				"Open Projects from File System");

		JMenuItem itemClose = new JMenuItem("Close");
		JMenuItem itemCloseAll = new JMenuItem("Close All");

		JMenu menuFile = new JMenu("File");
		menuFile.add(itemNew);
		menuFile.add(itemOpenFile);
		menuFile.add(itemOpenProjects);
		menuFile.addSeparator();
		menuFile.add(itemClose);
		menuFile.add(itemCloseAll);

		// Menú Edit
		JMenuItem itemUndo = new JMenuItem("Undo Typing");
		JMenuItem itemRedo = new JMenuItem("Redo Typing");
		JMenuItem itemCut = new JMenuItem("Cut");
		JMenuItem itemCopy = new JMenuItem("Copy");

		JMenu menuEdit = new JMenu("Edit");
		menuEdit.add(itemUndo);
		menuEdit.add(itemRedo);
		menuEdit.addSeparator();
		menuEdit.add(itemCut);
		menuEdit.add(itemCopy);

		// Barra de menú
		JMenuBar barraMenu = new JMenuBar();
		barraMenu.add(menuFile);
		barraMenu.add(menuEdit);

		// Ventana
		setJMenuBar(barraMenu);

		setVisible(true);

	}

}
