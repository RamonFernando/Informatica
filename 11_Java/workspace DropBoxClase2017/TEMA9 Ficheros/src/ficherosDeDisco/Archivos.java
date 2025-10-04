package ficherosDeDisco;

import java.io.File;

public class Archivos {

	public Archivos() {

	}

	public static void main(String[] args) {

		// Crear una carpeta
		// File usuarios = new File("usuarios");
		//
		// boolean creada = usuarios.mkdir();

		// if(creada){
		// System.out.println("Ok");
		// }else {
		// System.out.println("No se ha podido crear");
		// }

		// Creamos una ruta con varias carpetas
		// File ruta = new File("ficheros/documentos/pdf/descriptivo");
		// ruta.mkdirs();
		// if (ruta.mkdirs()) {
		// System.out.println("Ok");
		// } else {
		// System.out.println("No se ha podido crear la ruta");
		// }

		// Borrar una carpeta (o un archivo).

		File descriptivo = new File("ficheros/documentos/pdf/descriptivo");
		descriptivo.delete();

		File pdf = new File("ficheros/documentos/pdf");
		pdf.delete();

		File documentos = new File("ficheros/documentos");
		documentos.delete();

		// File archivo = new File("Fichero/Ordenador.jpg");
		// File archivoCambiado = new File("Fichero/Ordenador.copia.jpg");
		// archivo.renameTo(archivoCambiado);

	}

}
