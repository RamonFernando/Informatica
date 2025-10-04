package EjemplosPDF_1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.*;

public class CuadroDeDialogo extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JOptionPane.showMessageDialog(null, "Procesando...");
		// JOptionPane.showMessageDialog(null, "Se ha producido un error al
		// guardar.", "Error de E/S",
		// JOptionPane.ERROR_MESSAGE);
		 procesar();
		 Error();
		 salir();
		aviso();
		titulo();
	}

	public static void procesar() {
		JOptionPane.showMessageDialog(null, "Procesando...");
	}

	public static void Error() {
		JOptionPane.showMessageDialog(null, "Se ha producido un error al guardar.", "Error de E/S",
				JOptionPane.ERROR_MESSAGE);
	}

	public static void salir() {
		JOptionPane.showConfirmDialog(null, "Desea guardar los ultimos cambios");
	}

	public static void aviso() {
		// opc = a la opcion SI(0),NO(1),Cancel(2).
		int opc = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Aviso",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

		System.out.println("Respuesta " + opc);

		if (opc == JOptionPane.YES_OPTION) {
			System.out.println("Has echo bien contestando SI");
		} else if (opc == JOptionPane.NO_OPTION) {
			System.out.println("Has echo bien contestando NO");
		} else {
			System.out.println("Has echo bien contestando CANCELAR");
		}

	}

	public static void titulo() {
		String opc = JOptionPane.showInputDialog(null, "Escribe tu correo electronico ", "Correo del Usuario",
				JOptionPane.QUESTION_MESSAGE);

		if (opc == null) {
			JOptionPane.showMessageDialog(null, "Operacion cancelada", "Operacion cancelada",
					JOptionPane.WARNING_MESSAGE);
		} else {
			System.out.println("Tu correo es " + opc);
		}

	}

	public static void opcion() {
		String[] opciones = { "Writer", "Calculo", "Base", "Draw" };

		// int o = JOptionPane.showOptionDialog(null, "", "",0,
		// JOptionPane.QUESTION_MESSAGE, null, opciones, 0);

		int opc = JOptionPane.showOptionDialog(null, "Elije la aplicacion a ejecutar", "Abrir aplicacion", 0,
				JOptionPane.QUESTION_MESSAGE, null, opciones, 0);

		switch (opc) {
		case 0:
			System.out.println("Abriendo Writer...");
			break;
		case 1:
			System.out.println("Abriendo Calc...");
			break;
		case 2:
			System.out.println("Abriendo Base...");
			break;
		case 3:
			System.out.println("Abriendo Draw...");
			break;
		}
	}
}
