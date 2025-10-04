package EjemplosPDF_1;

import java.awt.*;
import javax.swing.*;;

public class TextAreas extends JFrame {

	public static void main(String[] args) {
		new TextAreas();
	}

	public TextAreas() {
		super("Comentarios del usuario");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblComentarios = new JLabel("Escriba aquí sus comentarios:");

		// Creamos un TextArea de un tamaño aproximado de 5 filas x 20 columnas.
		JTextArea txtComentarios = new JTextArea(5, 20);

		add(lblComentarios);
		add(txtComentarios);

		setVisible(true);
	}
}
