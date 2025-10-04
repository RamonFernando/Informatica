package RepasoExamenT9;

import java.io.File;

public class DirectoriosMkdir {

	public DirectoriosMkdir() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File carpeta = new File("ficheros/Configuracion");
		File carpeta1 = new File("ficheros/Configuracion/Pruebas");
		File carpeta2 = new File("ficheros/Configuracion/Pruebas/ArchivoR.txt");

		boolean creada = carpeta.mkdir();
		creada = carpeta1.mkdir();
		creada = carpeta2.mkdir();
		carpeta2.delete();
		
		
		if (!creada) {
			System.out.println("No se ha podido crear");
		} else {
			System.out.println("Ok");
		}

	}

}
