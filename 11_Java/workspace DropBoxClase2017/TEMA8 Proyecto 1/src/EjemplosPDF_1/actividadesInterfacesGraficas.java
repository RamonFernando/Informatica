package EjemplosPDF_1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.*;

import javax.swing.*;

/**
 * Extendido de JFrame cuadro de dialogos
 * 
 * @author Ramon
 *
 */
public class actividadesInterfacesGraficas extends JFrame {

	/**
	 * Actividades de cuadros de dialogos confirma,dni,alerta,eleccion,hosting
	 */

	public actividadesInterfacesGraficas() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("^Programa de cuadro de Dialogos^");
		System.out.println("Opciones");
		System.out.println("-----------------------------------");
		System.out.println("Opcion Ejercicio 1");
		confirma();
		System.out.println("-----------------------------------");
		System.out.println("Opcion Ejercicio 2");
		dni();
		System.out.println("-----------------------------------");
		System.out.println("Opcion Ejercicio 3");
		alerta();
		System.out.println("-----------------------------------");
		System.out.println("Opcion Ejercicio 4");
		eleccion();
		System.out.println("-----------------------------------");
		System.out.println("Opcion Ejercicio 5");
		hosting();
		System.out.println("-----------------------------------");
		System.out.println("^Fin del Programa^");
	}

	// Ejercicio 1
	/**
	 * Cuadro de dialogo para formatear
	 */
	public static void confirma() {

		try {
			UIManager
					.setLookAndFeel(("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"));
			// SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.out.println("No se ha podido configurar el look and feel:"
					+ e.getMessage());
		}
		int opc = JOptionPane.showConfirmDialog(null,
				"¿Desea formatear el disco duro?", "Confirmacion de formateo",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

		if (opc == JOptionPane.YES_OPTION) {
			System.out.println("Formateando...");
		} else if (opc == JOptionPane.CANCEL_OPTION) {
			System.out.println("Opcion cancelada");
		} else {
			System.out.println("Ventana cerrada");
		}

	}

	// Ejercicio 2
	/**
	 * Cuadro de dialogo para pedir el dni
	 */
	public static void dni() {
		try {
			UIManager
					.setLookAndFeel(("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"));
			// SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.out.println("No se ha podido configurar el look and feel:"
					+ e.getMessage());
		}

		String respuesta = JOptionPane.showInputDialog(null,
				"Confirmacion de identidad", "Escribe tu DNI:");

		// int opc = Integer.parseInt(respuesta);
		//
		// if (opc == JOptionPane.YES_OPTION) {
		//
		// // System.out.println(respuesta);
		// } else if (opc == JOptionPane.CANCEL_OPTION) {
		// System.out.println("Opcion cancelada");
		// } else {
		// System.out.println("Ventana cerrada");
		// }
		System.out.println("DNI: " + respuesta);
	}

	// Ejercicio 3
	/**
	 * Cuadro de dialogo para alerta de ip
	 */
	public static void alerta() {
		try {
			UIManager
					.setLookAndFeel(("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"));
			// SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.out.println("No se ha podido configurar el look and feel:"
					+ e.getMessage());
		}
		JOptionPane.showMessageDialog(null,
				"Se ha detectado un escaneo de red desde la IP 192.168.1.51 .",
				"Alerta de Seguridad", JOptionPane.WARNING_MESSAGE);

		System.out.println("Aceptar");
	}

	// Ejercicio 4
	/**
	 * Cuadro de dialogo para usar cuadro de seleccion de opciones
	 */
	public static void eleccion() {

		String[] opciones = { "Futurama", "Los Simpson", "Heroes", "Cancelar" };

		try {
			UIManager
					.setLookAndFeel(("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"));
			// SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.out.println("No se ha podido configurar el look and feel:"
					+ e.getMessage());
		}

		int opc = JOptionPane.showOptionDialog(null,
				"Haz clic en tu serioe favorita", "Eleccion de Serie", 0,
				JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);

		switch (opc) {
		case 0:
			System.out.println("Abriendo Futurama...");
			break;
		case 1:
			System.out.println("Abriendo Los Simpson...");
			break;
		case 2:
			System.out.println("Abriendo Heroes...");
			break;
		case 3:
			System.out.println("Cancelando...");
			break;

		}
	}

	// Ejercicio 5
	/**
	 * Cuadro de dialogo para mostrar opciones de seleccion de opciones
	 */
	public static void hosting() {
		String[] opciones = { "Apache", "II S", "Nginx", "Node.JS", "Cancelar" };

		// int o = JOptionPane.showOptionDialog(null, "", "",0,
		// JOptionPane.QUESTION_MESSAGE, null, opciones, 0);

		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			// SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			System.out.println("Error al intentar cambiar el look and feel.");
		}

		int opc = JOptionPane.showOptionDialog(null,
				"¿Que servidor web desea para su hosting?",
				"Eleccion de servidor web", 0, JOptionPane.INFORMATION_MESSAGE,
				null, opciones, 0);

		switch (opc) {
		case 0:
			System.out.println("Abriendo Apache...");
			break;
		case 1:
			System.out.println("Abriendo II S...");
			break;
		case 2:
			System.out.println("Abriendo Nginx...");
			break;
		case 3:
			System.out.println("Abriendo Node.JS");
		case 4:
			System.out.println("Cancelando...");
			break;

		}
	}
}
